import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic{ // Class arithmetic which contains add method
    public int add(int a, int b) //add method take two int values and returns the sum
    {
        int sum = a + b;
        return sum;
    }
}
// Adder is child class of arithmetic
class Adder extends Arithmetic{
    // Contains nothing, just a test to see if child inherits from parent class
}
public class ParentAdder{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
