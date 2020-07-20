package react4j.hrm;

import arez.annotations.ArezComponent;
import javax.annotation.Nonnull;

@ArezComponent( allowEmpty = true )
abstract class HeartRateMonitor
{
  @Nonnull
  static HeartRateMonitor create()
  {
    return new Arez_HeartRateMonitor();
  }

  boolean isConnected()
  {
    return true;
  }

  int getHearRate()
  {
    return 0;
  }
}
