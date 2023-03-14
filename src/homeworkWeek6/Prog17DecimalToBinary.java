/**17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output Binary number is: 101
 */
package homeworkWeek6;
import java.util.Scanner;//importing the scanner class using java utility package
public class Prog17DecimalToBinary
{
    public static void main(String[] args)//main method
    {
        Scanner scan=new Scanner(System.in);//creating the Scanner object
        System.out.print("Input a Decimal Number : ");
        int a= scan.nextInt();//user can do input in decimal number
        deciTobinary(a);//calling static deciTobinary method
        scan.close();
    }
    public static void deciTobinary(int x)//static method with parameter no return type
    {
        System.out.println("Binary number is : " +Integer.toBinaryString(x));//decimal number will convert into binary number
    }
}