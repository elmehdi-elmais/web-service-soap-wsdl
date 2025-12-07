

import proxy.Account;
import proxy.BankAccountService;
import proxy.BankWs;

import java.io.IOException;

/**
 * AppClient
 *
 */
public class AppClient
{
    public static void main( String[] args ) throws IOException
    {
        BankAccountService proxyWs = new BankWs().getBankAccountServicePort();
        System.out.println("Conversion de 800 euros en dirhams: " + proxyWs.conversionEuroToDh(800));
        Account account = proxyWs.getAccount(3);
        System.out.println("---------------------------------");
        System.out.println(account.getCode());
        System.out.println(account.getBalance());
        System.out.println(account.getDateCreated());
    }
}
