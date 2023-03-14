/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication and division methods
 * all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)
 */
package homeworkWeek6;
public class Prog5Calculator
{
    public static void main(String[] args)//main method
    {
        addition(10, 20);// calling static method directly
        subtration(30, 10);// calling static method directly
        Prog5Calculator obj = new Prog5Calculator();//object creation
        obj.multiplication(5, 7);// calling instance method with an object
        obj.division(100, 5);//calling instance method with an object
    }
    public static void addition(int a, int b)// static method with two parameter
    {
        int ans1 = (a + b);
        System.out.println("Addition is : " + ans1);
    }
    public static void subtration(int c, int d)// static method with two parameter
    {
        int ans2 = (c - d);
        System.out.println("Subtraction is : " + ans2);
    }
    public void multiplication(int x, int y)//instance method with two parameter
    {
        int ans3 = (x * y);
        System.out.println("Multiplication is : " + ans3);
    }
    public void division(int v, int w)// instance method with two parameter
    {
        int ans4 = (v / w);
        System.out.println("Division is : " + ans4);
    }
}
