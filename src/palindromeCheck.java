import java.io.*;
import java.util.*;

public class palindromeCheck {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int endIndex = A.length() - 1;
        int check = 0;
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == A.charAt(endIndex - i)){
                check++;
            }
        }
        if(check == A.length()) {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}



