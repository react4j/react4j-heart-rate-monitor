package react4j.hrm;

import arez.annotations.CascadeDispose;
import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
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
    return
      div( new HtmlProps().className( "container" ),
           div( new HtmlProps().className( "hrm_panel" ),
                h1( "Heart Rate Monitor" ),
                img( new ImgProps().className( "heart" ).src( "img/heart.svg" ) ),
                0 != heartRate ? ReactNode.of( heartRate ) : null,
           )
      );
  }
}
