//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class mapping{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here

            if(phoneBook.get(s) == null) {
                System.out.println("Not found");
            }
            else {
                System.out.print(s+"=");
                System.out.println(phoneBook.get(s));
            }
        }
        in.close();
    }
}

