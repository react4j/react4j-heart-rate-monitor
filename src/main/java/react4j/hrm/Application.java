package react4j.hrm;

import arez.annotations.CascadeDispose;
import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.dom.proptypes.html.ImgProps;
import static react4j.dom.DOM.*;

@View
abstract class Application
{
  @Nonnull
  @CascadeDispose
  final HeartRateMonitor _heartRateMonitor = HeartRateMonitor.create();

  @Nonnull
  @Render
  ReactNode render()
  {
    return
      div( new HtmlProps().className( "container" ),
           div( new HtmlProps().className( "hrm_panel" ),
                h1( "Heart Rate Monitor" ),
                img( new ImgProps().className( "heart" ).src( "img/heart.svg" ) ),
                ReactNode.of( _heartRateMonitor.getHearRate() )
           )
      );
  }
}
