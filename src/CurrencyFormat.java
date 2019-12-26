import java.util.*;
import java.text.*;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        /*DecimalFormat round = new DecimalFormat(0.##);
        round.format(payment);*/

        String Dol = NumberFormat.getCurrencyInstance(Locale.US).format(payment); //US format
        String Yen = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment); //Chinese format
        String Euro = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment); //French format
        String RS = NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(payment); //EN(Indian) format
        String RSReal = "";
        for(int i = 0; i < RS.length()-1; i++){
            RSReal = RSReal + RS.charAt(i+1);

        }

        String us = Dol;
        String china = Yen;
        String france = Euro;
        String india = "Rs." + RSReal;


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

