import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class splitString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        //Asks user for number of string cases to run
        int cases = scan.nextInt();
        //initializes string
        String s;
        //loops through each case one by one
        for(int i = 0; i < cases; i++){
            //asks user to input string to break between even and odd pairing
            s = scan.next();
            String odd = "";
            String even = "";
            //loops thru each character, seperating even and odd index chars into
            //seperate strings and print even then odd.
            for(int j = 0; j < s.length(); j++) {
                if(j%2 == 0){
                    even = even + s.substring(j,j+1);
                }
                else
                {
                    odd = odd + s.substring(j,j+1);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
