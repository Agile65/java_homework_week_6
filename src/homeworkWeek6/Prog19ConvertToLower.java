/**
 * 19. Write a Java program to convert a given string into lowercase.
 */
package homeworkWeek6;
import java.util.Scanner;//importing the scanner class using java utility package
public class Prog19ConvertToLower
{
    public static void main(String[] args)//main method
    {
        Scanner scan =new Scanner(System.in);//creating the Scanner object
        System.out.print("Input into Uppercase : ");
        String s1=scan.nextLine();// user can input the string and storing it to a variable
        Prog19ConvertToLower obj=new Prog19ConvertToLower();//creating an object
        obj.toLower(s1);//calling an instance method using an object
        scan.close();//closing the Scanner class
    }
    public void toLower(String s2)//instance method
    {
        System.out.println("Output into Lowercase : " +s2.toLowerCase());//converting the string into the lowercase and displaying it
    }
}
