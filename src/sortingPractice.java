import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sortingPractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numSwaps = 0;
        int temp;
        for(int i = 0; i < n -1; i++) {
            if(a[i] < a[i +1]){
                temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;
                numSwaps++;

            }

        }
        System.out.println(numSwaps);
        System.out.println(a[0]);
        System.out.println(a[a.length - 1]);
    }
}

