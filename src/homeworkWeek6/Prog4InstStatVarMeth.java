/**
 * 4. Write a Java programme using the following steps.
 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.
 */
package homeworkWeek6;
public class Prog4InstStatVarMeth
{
    int x=10;//instance variables declared
    int y=20;//instance variables declared
    static int a=30;// static variable declared
    static int b=40;// static variable declared
    public static void main(String[] args)//main method
    {
        Prog4InstStatVarMeth obj1=new Prog4InstStatVarMeth();//object created
        obj1.instanceMethod();//invoking instance method using object
        staticMethod();//calling static method directly
    }
    public void instanceMethod()//instance method
    {
        System.out.println("-----This is Instance Method-----");
        System.out.println("Instance variable x is : "+x);//calling two instance variable into instance method
        System.out.println("Instance variable y is : "+y);
        System.out.println("Static variable a is : "+a);//calling two static variable into instance method
        System.out.println("Static variable b is : "+b);
    }
    public static void staticMethod()//static method
    {
        System.out.println("-----This is Static Method-----");
        Prog4InstStatVarMeth obj=new Prog4InstStatVarMeth();
        System.out.println("Instance variable x is : " +obj.x);//calling two instance variable into static method using an object
        System.out.println("Instance variable y is : " +obj.y);
        System.out.println("Static variable a is : " +a);// calling two static variable into static method
        System.out.println("Static variable b is : " +b);
    }
}
