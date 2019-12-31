import java.util.Scanner;

public class subSComp {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int lexS;
        int lexL;
        // Complete the function
        smallest = smallest + s.substring(0,k);
        largest = largest + s.substring(0,k);
        String sub;
        for(int i = 0; i < s.length() + 1 - k; i++){
            sub = s.substring(i,i+k);

            // 'smallest' must be the lexicographically smallest substring of length 'k'
            lexS = smallest.compareTo(sub);
            if(lexS > 0)
            {
                smallest = sub;
            }
            // 'largest' must be the lexicographically largest substring of length 'k'
            lexL = largest.compareTo(sub);
            if(lexL < 0)
            {
                largest = sub;
            }
        }


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}