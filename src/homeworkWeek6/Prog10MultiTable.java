/**
 10.Write a Java program that takes a number as an input
 and prints its multiplication table up to 10.
 */
package homeworkWeek6;
import java.util.Scanner;//importing scanner class using java utility
public class Prog10MultiTable
{
    public static void main(String[] args)//main method
    {
       System.out.print("Enter a number for Multiplication Table : ");
       multi();//calling static multiplication method
    }
    public static void multi()//static method
    {
        Scanner scan=new Scanner(System.in);//creating the scanner object
        int x=scan.nextInt();//User enters number
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "1"+ "=" +(x*1));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "2"+ "=" +(x*2));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "3"+ "=" +(x*3));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "4"+ "=" +(x*4));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "5"+ "=" +(x*5));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "6"+ "=" +(x*6));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "7"+ "=" +(x*7));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "8"+ "=" +(x*8));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "9"+ "=" +(x*9));
        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ x + "X" + "10"+ "=" +(x*10));
        scan.close();
    }
}
