package react4j.hrm;

import arez.annotations.CascadeDispose;
import arez.annotations.Feature;
import arez.annotations.Observable;
import elemental2.dom.DomGlobal;
import javax.annotation.Nonnull;
import jsinterop.base.Js;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.events.ReactEventHandler;
import react4j.dom.proptypes.html.BtnProps;
import react4j.dom.proptypes.html.CssProps;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.dom.proptypes.html.ImgProps;
import static react4j.dom.DOM.*;

@View( type = View.Type.TRACKING )
abstract class Application
{
  @Nonnull
  @CascadeDispose
  final HeartRateMonitor _heartRateMonitor = HeartRateMonitor.create();

  @Observable( readOutsideTransaction = Feature.ENABLE, writeOutsideTransaction = Feature.ENABLE )
  abstract boolean isExpandAnimation();

  abstract void setExpandAnimation( boolean expandAnimation );

  @Nonnull
  @Render
  ReactNode render()
  {
    final CssProps cssProps = new CssProps();

    final int heartRate = _heartRateMonitor.getHeartRate();
    if ( heartRate > 0 )
    {
      cssProps
        .animationName( "beating" )
        .animationDirection( "alternate" )
        .animationIterationCount( "infinite" );
      //TODO: Add mapping for this into react4j
      Js.asPropertyMap( cssProps ).set( "animationTimingFunction", "ease-in" );
      // We used to try and change the animated duration but this property
      // can not be used in transition and changing it in onAnimationIteration is
      // seemingly too late and causes animation to reset
      //TODO: Add mapping for this into react4j
      Js.asPropertyMap( cssProps ).set( "animationDuration", "0.8s" );
    }
    final boolean connected = _heartRateMonitor.isConnected();
    final ImgProps imgProps = new ImgProps()
      .className( "heart" )
      .style( cssProps )
      .src( "img/heart.svg" );

    //TODO: Add react4j support for onAnimationStart onAnimationEnd onAnimationIteration
    final ReactEventHandler onAnimationStart = e -> DomGlobal.console.log( e.getNativeEvent() );
    imgProps.prop( "onAnimationStart", Js.asAny( onAnimationStart ) );
    final ReactEventHandler onAnimationEnd = e -> DomGlobal.console.log( e.getNativeEvent() );
    imgProps.prop( "onAnimationEnd", Js.asAny( onAnimationEnd ) );
    final ReactEventHandler onAnimationIteration = e -> {
      DomGlobal.console.log( e.getNativeEvent() );
      setExpandAnimation( !isExpandAnimation() );
    };
    imgProps.prop( "onAnimationIteration", Js.asAny( onAnimationIteration ) );
    return
      div( new HtmlProps().className( "container" ),
           div( new HtmlProps().className( "hrm_panel" ),
                h1( "Heart Rate Monitor" ),
                img( imgProps ),
                0 != heartRate ? ReactNode.of( heartRate ) : null,
                0 != heartRate ? ( isExpandAnimation() ? ReactNode.of( " Expand" ) : ReactNode.of( " Contract" ) ) : null,
                button( new BtnProps()
                          .disabled( connected )
                          .onClick( e -> _heartRateMonitor.connect() ),
                        "Start" ),
                button( new BtnProps()
                          .disabled( !connected )
                          .onClick( e -> _heartRateMonitor.disconnect() ),
                        "Stop" )
           )
      );
  }
}
