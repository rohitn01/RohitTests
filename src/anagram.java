import java.util.Scanner;
public class anagram {


    public static class Solution {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            char Char;
            char CharA;
            char CharB;
            int tempa = 0;
            int tempb = 0;
            if(a.length() != b.length())
            {
                return false;
            }
            else
            {
                for(int i = 0; i < a.length(); i++){
                    Char = a.charAt(i);
                    Char = Character.toLowerCase(Char);
                    tempa = 0;
                    tempb = 0;
                    for(int j = 0; j < b.length(); j++){
                        CharA = a.charAt(j);
                        CharA = Character.toLowerCase(CharA);
                        CharB = b.charAt(j);
                        CharB = Character.toLowerCase(CharB);

                        if(Char == CharA)
                        {
                            tempa++;
                        }
                        if(Char == CharB)
                        {
                            tempb++;
                        }
                    }
                    if(tempa != tempb)
                    {
                        return false;
                    }
                }
                return true;
            }
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }
}
