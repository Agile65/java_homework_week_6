/**
 * 9. Write a program to convert the upper case to lower case.
 */
package homeworkWeek6;
import java.util.Scanner; // importing the java scanner class
public class Prog9UpperCaseToLowerCase
{
    public static void main(String[] args)//main method
    {
        Scanner scan=new Scanner(System.in);//defining the scaner class object
        System.out.println("Enter the sentance in the uppercase : ");
        String s= scan.nextLine();//storing the user's string into the variable
        upperToLower(s);//calling static method
        scan.close();
    }
    static void upperToLower(String s1)//static method with parameter no return value
    {
        System.out.println(s1.toLowerCase());// converting the string into lowercase and displaying
    }
}
