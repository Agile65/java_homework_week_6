/** 13. Write a Java program that takes three numbers as input
 * to calculate and print the average of the numbers.
 */
package homeworkWeek6;
import java.text.DecimalFormat;//importing DecimalFormat class from java text
import java.util.Scanner;//importing Scanner class using java utility
public class Prog13AvgNumbers
{
    public static void main(String[] args)//main method
    {
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter first number : ");
            double a=scan.nextInt();// have to use double datatype as average can come in digital vales and user input first number
            System.out.print("Enter second number : ");
            double b=scan.nextInt();//input second number
            System.out.print("Enter third number : ");
            double c=scan.nextInt();//input third number
            avgNumb(a,b,c);//calling static method
            scan.close();
    }
    public static void avgNumb(double a,double b, double c)
    {
        double ans = ((a + b + c) / 3);//calculation
        DecimalFormat f1=new DecimalFormat("##.00");//creating an object for displaying output in to two decimal places
        System.out.println("The average of this three numbers is : " + f1.format(ans));//displaying answer
    }
}
