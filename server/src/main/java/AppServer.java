import com.ws.BankAccountService;
import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class AppServer
{
    public static void main( String[] args )
    {
        String url = "http://0.0.0.0:8686/";
        Endpoint.publish(url, new BankAccountService());
        System.out.println("Web service déployé sur: " + url);
    }
}
