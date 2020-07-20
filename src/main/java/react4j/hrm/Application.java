package react4j.hrm;

import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import static react4j.dom.DOM.*;

@View
abstract class Application
{
  @Nonnull
  @Render
  ReactNode render()
  {
    return h1( "Bluetooth Heart Rate Monitor Dashboard" );
  }
}
