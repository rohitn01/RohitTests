import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class negSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int inst = 0;
        // initializing variables and setting array length
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] list = new int[size];

        // inputting int value in array
        for(int f = 0; f < list.length; f++) {
            list[f] = scan.nextInt();
        }

        int sum;

        // For loops will go through each index and find the sum between different gaps.
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; i + j < list.length; j++){
                sum = 0;
                for(int k = 0; k <= j; k++) {
                    sum += list[i+k];
                }
                if (sum < 0) {
                    inst++;
                }
            }
        }
        System.out.println(inst);

    }
}

