package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        bankAccount myAccount = new bankAccount("Chelsea", "87", 100000);
        System.out.println(myAccount.toString());

        myAccount.deposit(100000);
        System.out.println(myAccount.toString());

        myAccount.withdraw(199);
        System.out.println(myAccount.toString());

        myAccount.setClosed(true);

        //myAccount.withdraw(50);
        //System.out.print(myAccount.toString());

        for (String transDetails: myAccount.getTransactions()) {
            System.out.print(transDetails);
        }

        int n = 5;
        bankAccount [] bankAcct = new bankAccount[n];

        for (int i = 0; i < bankAcct.length; i++) {
            String uuid = UUID.randomUUID().toString();

            float min = 1000.00f;
            float max = 1000000.00f;

            Random randomNum = new Random();
            float initialBalance = min + randomNum.nextFloat();

            bankAcct[1] = new bankAccount("Employee", uuid, initialBalance);
        }

        bankAcct[0].showAccount();
        bankAcct[0].withdraw(100.00f);
        bankAcct[0].showAccount();
    }
}
