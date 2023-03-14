/**
 * 1. Write a Java programme using the following steps.
 1.1 Declare two instance variables.
 1.2 Declare one instance method.
 1.3 Call both instance variables into the instance method inside the print statement.
 1.4 Declare the Main method.
 1.5 Call the above instance method into the Main method and Run the programme.
 */
package homeworkWeek6;
public class Prog1InsVarMeth
{
    int x=10; // instance variable
    int y=20;//instance variable
    public static void main(String[] args)//main method
    {
        Prog1InsVarMeth obj=new Prog1InsVarMeth();//creating an object
        obj.display();//calling instance method using an object into main method
    }
    void display()//instance method
    {
        System.out.println("x is " +x);//display instance variable directly
        System.out.println("y is " +y);//display instance variable directly
    }
}
