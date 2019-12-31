import java.io.*;
import java.util.*;

public class stringsIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //Sum of lengths
        int sizeSum = A.length() + B.length();
        System.out.println(sizeSum);

        // Lexicography


        // Capitalize first letter

        String cap = A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(cap);

    }
}



