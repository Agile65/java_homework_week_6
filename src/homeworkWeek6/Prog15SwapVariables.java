/**
 * 15. Write a Java program to swap two variables.
 */
package homeworkWeek6;
import java.util.Scanner;//importing scanner class from java utility package
public class Prog15SwapVariables
{
    public static void main(String[] args)//main method
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter variable 1 : ");
        int a= scan.nextInt();//user inputs first variable and storing it
        System.out.print("Enter variable 2 : ");
        int b= scan.nextInt();//user inputs second veriable and storing it
        swap(a,b);//calling static swap method
    }
    public static void swap(int x,int y)//static method with parameter without returning the value
    {
        int z;
        z=y;//exchanging value using third variable
        y=x;
        x=z;
        System.out.println("After swapping the variables are ");
        System.out.println("Variable 1 is : " +x);//displaying variable after swap
        System.out.println("Variable 2 is : " +y);//displaying variable after swap
    }
}
