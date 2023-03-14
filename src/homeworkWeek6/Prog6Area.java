/**
 * 6. Write a program to enter any radius value of the circle
 * and find out the area.(Formula of Area A=PI*r*r).
 */
package homeworkWeek6;
import java.util.Scanner; //importing the java package for scanner
public class Prog6Area
{
    final static double PI=3.14;//static variable
    public static void main(String[] args)//main method
    {
        Scanner scan= new Scanner(System.in);// using the scanner class for user input
        System.out.print(" Enter the radius value : ");
        double r= scan.nextDouble(); // storing the user input in the variable
        areaCircle(r);//calling static method
        scan.close();
    }
    public static void areaCircle(double a)//static method
    {
        double area;
        area= (PI*a*a); //calculating the area and storing it
        System.out.println("The area of the circle is : " +area);//display result
    }
}
