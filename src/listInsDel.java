import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class listInsDel {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        // Ask user how many elements they want in list.
        int num, numb;
        String qtype;
        int elements = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(elements);
        //Adds user input numbers in list based on number provided earlier
        for(int i = 0; i < elements; i++){
            num = scan.nextInt();
            list.add(i, num);
        }
        //Ask user how many queries they want to ask.
        int q = scan.nextInt();
        for(int j = 0; j < q; j++) {
            qtype = scan.nextLine();
            if(qtype == "Insert"){
                numb = scan.nextInt();
                num = scan.nextInt();
                list.add(q, num);
            }
            if(qtype == "Delete"){
                num = scan.nextInt();
                list.remove(num);
            }
        }
        for(int k = 0; k < list.size(); k++){
            System.out.print(list.get(k)+ " ");
        }

    }
}

