//This program will ask the user if they want to receive there ticket number, and will give user random ticket number,
//which will then be stored in a list of given numbers so no duplicates can repeat. Once all possible numbers in range
//are distributed, all previous numbers can be used again.
import java.util.ArrayList;
import java.math.*;
import java.util.Random;
import java.util.Scanner;
public class randomTicketNumber {
    public static void main(String[] args) {
        int range = 10;
        Random rand = new Random();
        ArrayList<Integer> usedNum = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Print Ticket # ? (1 for yes | 0 for no)");
        int printTix = scan.nextInt();
        int ticketNum;

        while(printTix == 1) {
            if(usedNum.size() >= range)
            {
                usedNum.clear();
            }
            ticketNum = rand.nextInt(range);
            if(usedNum.contains(ticketNum) == true){
                printTix = 1;
            }
            else{
                System.out.println(ticketNum);
                usedNum.add(ticketNum);
                System.out.println("New ticket? (1 for yes | 0 for no)");
                printTix = scan.nextInt();
            }
        }
    }

}
