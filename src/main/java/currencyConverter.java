import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class currencyConverter {

    public static void main(String[] args) {
        System.out.println("1. Euro");
        System.out.println("2. Dollar");
        System.out.println("3. SEK");
        System.out.println("4. DKK");
        System.out.println("5. XAF");
        //  we  ask the user to enter the currency
        Scanner scanner = new Scanner(System.in);

        // we consider the currency input

        System.out.println("Enter a Currency: ");

        int currencyChoice = scanner.nextInt();
        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // to convert the currency to another using the switch method

        switch (currencyChoice) {

            case 1:
                Euro_to_other_currency(amount);
                break;
            case 2:
                Dollar_to_other_currency(amount);
                break;
            case 3:
                SEK_to_other_currency(amount);
                break;
            case 4:
                DKK_to_other_currency(amount);
                break;
            case 5:
                XAF_to_other_currency(amount);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}

public static void Euro_to_other_currency(double amt) {
    System.out.println("1 Euro = " + 1.09 + "Dollar");
    System.out.println();
    System.out.println(amt + "Euro = " + (amt*1.09) + "Dollar");
    System.out.println();

    System.out.println("1 Euro = " + 11.03 + "SEK");
    System.out.println();
    System.out.println(amt + "Euro = " + (amt*11.03) + "SEK");
    System.out.println();

    System.out.println("1 Euro = " + 7.46 + "DKK");
    System.out.println();
    System.out.println(amt + "Euro = " + (amt*7.46) + "DKK");
    System.out.println();

    System.out.println("1 Euro = " + 655.96 + "XAF");
    System.out.println();
    System.out.println(amt + "Euro" + (amt*655.96) + "XAF");
    System.out.println();


}
