import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class foodPrice {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int totalCost;
        double tCost, tip, tax, tipPer, taxPer;
        tipPer = tip_percent;
        taxPer = tax_percent;
        tip = meal_cost * (tipPer/100);
        tax = meal_cost * (taxPer/100);
        tCost = meal_cost + tip + tax;
        totalCost = (int)tCost;

        System.out.println(totalCost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
