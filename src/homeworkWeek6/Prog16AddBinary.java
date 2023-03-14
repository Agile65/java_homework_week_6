/**16. Write a Java program to add two binary numbers.
 *  Input Data: Input first binary number: 10
 *  Input second binary number: 11
 *  Expected Output: Sum of two binary numbers: 101
 */
package homeworkWeek6;
import java.util.Scanner;//importing the scanner class from java util
public class Prog16AddBinary
{
    public static void main(String[] args)//main method
    {
        Scanner scan=new Scanner(System.in);// creating an object for scanner class
        System.out.print("Enter first binary number : ");
        String a= scan.nextLine();//user can do input in binary form and storing in the variable a
        System.out.print("Enter second binary number : ");
        String b=scan.nextLine();//user can do second input in the binary form and storing in the variable b
        binaryAdd(a,b);//calling static binary method
        scan.close();
    }
    static void binaryAdd(String x, String y)
    {
       int n1=Integer.parseInt(x,2);//converting string datatype (which has number input) to integer datatype
       int n2=Integer.parseInt(y,2);//storing them into integer variable
       int n3=n1+n2;//adding two integer numbers
       System.out.println("Sum of two binary number is : " +Integer.toBinaryString(n3));//converting integer number to the binary number and displaying
    }

}
