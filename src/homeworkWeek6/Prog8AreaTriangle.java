/**
 * 8. Write a program to calculate the area of a triangle.
 */
package homeworkWeek6;
import java.text.DecimalFormat;//importing DecimalFormat class with java text
import java.util.Scanner; //importing the package for the class scanner
public class Prog8AreaTriangle
{
    public static void main(String[] args)//main method
    {
        Scanner scan=new Scanner(System.in);//creating the object to call the scanner class functionality to use
        System.out.print("Enter the base of a triangle : ");
        double b= scan.nextDouble();// getting first user input using scanner class
        System.out.print("Enter the height of a triangle : ");
        double h= scan.nextDouble();//getting second user input using scanner class
        areaTriangle(b,h);//calling static method
        scan.close();
    }
    public static void areaTriangle(double base,double height)//static method
    {
        double area= ((base*height)/2);//calculating the area
        DecimalFormat f1= new DecimalFormat("##.00");//creating an object for displaying output in to two decimal places
        System.out.println("The area of your triangle is : " + f1.format(area));//displaying the area
    }
}
