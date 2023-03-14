/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 */
package homeworkWeek6;
import java.text.DecimalFormat; //importing Decimal format for 2 digits
import java.util.Scanner;//importing Scanner for user input
public class Prog14AreaPeriRec
{
    public static void main(String[] args)//main method
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter width of a rectange : ");
        double width= scan.nextDouble();//user inputs the width
        System.out.print("Enter height of a rectange : ");
        double height=scan.nextDouble();//user inputs the height
        Prog14AreaPeriRec obj=new Prog14AreaPeriRec();//creating an object
        obj.area(width,height);//calling an instance area method with an object
        System.out.println("Perimeter of this rectangle is : " +perimeter(width,height));//calling static perimeter method
    }
    public void area(double a,double b)//instance method with parameter
    {
        DecimalFormat form= new DecimalFormat("##.00");//creating an object for displaying output in to two decimal places
        System.out.println("Area of this rectangle is : " +(form.format(a*b)));// displaying the result up to two decimal places
    }
    public static double perimeter(double c,double d)//static method with parameter with return value
    {
        return (2*(c+d));//returning value in double
    }
}
