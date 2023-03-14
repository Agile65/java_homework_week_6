/**
 * 3. Write a Java programme using the following steps.
 3.1 Declare one instance and one static variable.
 3.2 Declare one instance method.
 3.3 Declare one static method.
 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 3.5 Declare the Main method.
 3.6 Call both instance and static methods into the Main method and run the programme.
 */
package homeworkWeek6;
public class Prog3InstStatVarMeth
{
    int x=10;//instance variable
    static int y=20;//static variable
    public void instanceMethod()// instance method
    {
        System.out.println("-----This is Instance Method-----");
        System.out.println("Instance variable x is : "+x);//calling instance variable into instance method
        System.out.println("Static variable y is : "+y);//calling static variable into instance method

    }
    public static void staticMethod()//static method
    {
        Prog3InstStatVarMeth o1=new Prog3InstStatVarMeth();//object created
        System.out.println("-----This is Static Method-----");
        System.out.println("Instance variable x is : " +o1.x);//calling instance variable into static method using object
        System.out.println("Static variable y is : "+y);// calling static variable into static method
    }

    public static void main(String[] args)//main method
    {
        Prog3InstStatVarMeth obj = new Prog3InstStatVarMeth();//object created
        obj.instanceMethod();//calling instance method using object
        staticMethod();//calling static method directly
    }
}
