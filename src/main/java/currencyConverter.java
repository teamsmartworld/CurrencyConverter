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

        System.out.println("Enter a Currency Option: ");

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
//conversion of the Euro to other currencies
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

public static void Dollar_to_other_currency(double amt) {
    System.out.println("1 Dollar = " + 0.92 + "Euro");
    System.out.println();
    System.out.println(amt + "Dollar" + (amt*0.92) + "Euro");
    System.out.println();

    System.out.println("1 Dollar = " + 10.17 + "SEK");
    System.out.println();
    System.out.println(amt + "Dollar" + (amt*10.17) + "SEK");
    System.out.println();

    System.out.println("1 Dollar = " + 6.86 + "DKK");
    System.out.println();
    System.out.println(amt + "Dollar " +(amt*6.86) + "DKK");
    System.out.println();

    System.out.println("1 Dollar = " + 604.23 + "XAF");
    System.out.println();
    System.out.println(amt + "Dollar = " + (amt*604.23) + "XAF");
    System.out.println();

}
//converting from SEK to other currencies
public static void SEK_to_other_currency(double amt) {
    System.out.println("1 SEK = " + 0.09 + "Euro");
    System.out.println();
    System.out.println(amt + "SEK " + (amt*0.09) + "Euro");
    System.out.println();

    System.out.println("1 SEK  = " + 0.10 + "Dollar");
    System.out.println();
    System.out.println(amt + "SEK " + (amt*0.10) + "Dollar");
    System.out.println();

    System.out.println("1 SEK  = " + 0.67 + "DKK");
    System.out.println();
    System.out.println(amt + "SEK  " +(amt*0.67) + "DKK");
    System.out.println();

    System.out.println("1 SEK  = " + 59.26 + "XAF");
    System.out.println();
    System.out.println(amt + "SEK  = " + (amt*59.26) + "XAF");
    System.out.println();

}

//converting from DKK to other currencies
public static void DKK_to_other_currency(double amt) {
    System.out.println("1 DKK = " + 0.13 + "Euro");
    System.out.println();
    System.out.println(amt + "DKK " + (amt*0.13) + "Euro");
    System.out.println();

    System.out.println("1 DKK  = " + 0.15 + "Dollar");
    System.out.println();
    System.out.println(amt + "DKK " + (amt*0.15) + "Dollar");
    System.out.println();

    System.out.println("1 DKK = " + 1.48 + "SEK");
    System.out.println();
    System.out.println(amt + "DKK  " +(amt*1.48) + "SEK");
    System.out.println();

    System.out.println("1 DKK  = " + 87.93 + "XAF");
    System.out.println();
    System.out.println(amt + "DKK  = " + (amt*87.93) + "XAF");
    System.out.println();

}
//converting from XAF to other currencies
public static void XAF_to_other_currency(double amt) {
    System.out.println("1 XAF = " + 0.0015 + "Euro");
    System.out.println();
    System.out.println(amt + "XAF " + (amt*0.0015) + "Euro");
    System.out.println();

    System.out.println("1 XAF  = " + 0.0017 + "Dollar");
    System.out.println();
    System.out.println(amt + "XAF " + (amt*0.0017) + "Dollar");
    System.out.println();

    System.out.println("1 XAF = " + 0.0169 + "SEK");
    System.out.println();
    System.out.println(amt + "XAF  " +(amt*0.0169) + "SEK");
    System.out.println();

    System.out.println("1 XAF  = " + 0.0114 + "DKK");
    System.out.println();
    System.out.println(amt + "XAF = " + (amt*0.0114) + "DKK");
    System.out.println();


}