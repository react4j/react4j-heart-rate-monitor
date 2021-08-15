package react4j.hrm;

import akasha.Console;
import akasha.Element;
import akasha.WindowGlobal;
import com.google.gwt.core.client.EntryPoint;
import react4j.dom.ReactDOM;

public final class Main
  implements EntryPoint
{
  @Override
  public void onModuleLoad()
  {
    if ( WindowGlobal.navigator().isBluetoothSupported() )
    {
      final Element element = WindowGlobal.document().getElementById( "app" );
      assert null != element;
      ReactDOM.render( ApplicationBuilder.build(), element );
    }
    else
    {
      Console.log( "Bluetooth API not present" );
    }
  }
}
