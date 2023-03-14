/**
 * 2. Write a Java programme using the following steps.
 2.1 Declare two static variables
 2.2 Declare one static method
 2.3 Call both static variables into the static method inside the print statement.
 2.4 Declare the Main method.
 2.5 Call the static method into the Main method and Run the programme.
 */

package homeworkWeek6;
public class Prog2StatVarMeth {
    static int x=20;//static variable
    static int y=30;//static variable
    public static void main(String[] args)//main method
    {
        print();//calling the static method
    }
    static void print()//static method
    {
        System.out.println("Static variable x is :" +x);//calling static variable into static method
        System.out.println("Static variable y is :" +y);//calling static variable into static method
    }
}
