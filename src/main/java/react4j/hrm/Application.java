package react4j.hrm;

import arez.annotations.CascadeDispose;
import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.proptypes.html.BtnProps;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.dom.proptypes.html.ImgProps;
import static react4j.dom.DOM.*;

@View( type = View.Type.TRACKING )
abstract class Application
{
  @Nonnull
  @CascadeDispose
  final HeartRateMonitor _heartRateMonitor = HeartRateMonitor.create();

  @Nonnull
  @Render
  ReactNode render()
  {
    final int heartRate = _heartRateMonitor.getHeartRate();
    final boolean connected = _heartRateMonitor.isConnected();

    return
      div( new HtmlProps().className( "container" ),
           div( new HtmlProps().className( "hrm_panel" ),
                h1( "Heart Rate Monitor" ),
                img( new ImgProps()
                       .className( "heart", heartRate > 0 ? "beating" : null )
                       .src( "img/heart.svg" ) ),
                0 != heartRate ? ReactNode.of( heartRate ) : null,
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
