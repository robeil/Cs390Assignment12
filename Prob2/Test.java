package Cs390Assignment12.Prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<CustomerAccount> dictionary = new ArrayList<>(Arrays.asList(
                new CustomerAccount("Robeil","123-123-1233",2525),
                new CustomerAccount("Keleab","141,253,3625",3636),
                new CustomerAccount("Haben","695-586-4785",6958),
                new CustomerAccount("Hannah","695-987-5896",9856)
        ));
        System.out.println("Printing before any withdraw or deposit");
        System.out.print(dictionary);
        System.out.println("\n"+dictionary.get(0).getCus_name() +"'s Original Balance -> " + dictionary.get(0).getBalance());
        //withdrawing 2419
        System.out.println("\n"+dictionary.get(0).getCus_name() + " -> Withdrawing 2419$  "  +
                dictionary.get(0).withDraw(2419) + " -> balance "+ + dictionary.get(0).getBalance());
        //this will throw IllegalWithDrawException() because the balance reach below 100
        System.out.println("\n"+dictionary.get(0).getCus_name() + " -> Withdrawing 7$  "   +
                dictionary.get(0).withDraw(7) + " -> balance "+ + dictionary.get(0).getBalance());
        System.out.println("\n"+dictionary.get(0).getCus_name() + " -> Withdrawing 1$  "   +
                dictionary.get(0).withDraw(1) + " -> balance "+ + dictionary.get(0).getBalance());

        //depositing 1000
        System.out.println("\n"+dictionary.get(0).getCus_name() + " -> Depositing 1000$ " +
                dictionary.get(0).deposit(1000) + " -> balance "+ + dictionary.get(0).getBalance());

        System.out.println("\nPrinting after deposit or withdraw");
        System.out.print(dictionary);
    }
}
