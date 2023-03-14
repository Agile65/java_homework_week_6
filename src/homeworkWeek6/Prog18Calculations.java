/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 */
package homeworkWeek6;
import java.util.Scanner;//importing the scanner class using java utility package
public class Prog18Calculations
{
    public static void main(String[] args)//main method
    {
        Scanner scan=new Scanner(System.in);//creating the Scanner object
        System.out.print("Input first number : ");
        int a= scan.nextInt();//user can input the first number
        System.out.print("Input second number : ");
        int b=scan.nextInt();//user can input the second number
        sum(a,b);//calling static method sum
        subtract(a,b);//calling static method subtraction
        multiply(a,b);//calling static method multiply
        divide(a,b);//calling static method divide
        remainder(a,b);//calling static method remainder
        scan.close();//closing the scanner class
    }
    public static void sum(int x, int y)//static method for addition
    {
        System.out.println(x+" + "+y +" = " +(x+y));
    }
    public static void multiply(int x, int y)//static method for multiply
    {
        System.out.println(x+" X "+y +" = " +(x*y));
    }
    public static void subtract(int x, int y)//static method for subtraction
    {
        System.out.println(x+" - "+y +" = " +(x-y));
    }
    public static void divide(int x, int y)//static method for divide
    {
        System.out.println(x+" / "+y +" = " +(x/y));
    }
    public static void remainder(int x, int y)//static method for remainder
    {
        System.out.println(x+" mod "+y +" = " +(x%y));
    }

}
