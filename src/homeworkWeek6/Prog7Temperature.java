/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
package homeworkWeek6;
import java.text.DecimalFormat;
import java.util.Scanner;//impoting the java package for the Scanner class
public class Prog7Temperature
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);//creating the new object to call scaner class
        System.out.print("Enter the temperature in degree Fahrenheit : ");
        double a = scan.nextDouble();//storing the user input from Fahrenheit   ;
        Celsius(a);//calling static method
        scan.close();
    }
    public static void Celsius(double f)
    {
        double Celsius;
        Celsius = ((f - 32) * 5 / 9);//calculating the Celsius and storing it
        DecimalFormat f1= new DecimalFormat("##.00");//creating an object for displaying output in to two decimal places
        System.out.println("Temperature in Celcious is : " +f1.format(Celsius));// displaying the result up to two decimal places
    }
}
