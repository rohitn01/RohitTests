import java.util.Scanner;

public class TestStdin {
    public static void main(String args[]){
        int temp;
        int nums[];
        nums = new int[3];
        Scanner newNum = new Scanner(System.in);
        for(int i = 0; i < nums.length; i++){
            System.out.println("Input a number: ");
            temp = newNum.nextInt();
            nums[i] = temp;
        }
        for(int j = 0; j< nums.length; j++){
            System.out.println(nums[j]);
        }
        newNum.close();
    }
}
