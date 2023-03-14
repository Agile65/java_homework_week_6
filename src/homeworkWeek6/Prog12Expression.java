/**  12. Write a Java program to compute the specified expressions and print the output.
 *Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) Expected Output : 2.138888888888889
 */
package homeworkWeek6;
public class Prog12Expression
{
    public static void main(String[] args)//main method
    {
        double x=25.5;//all variables are in double datatype
        double y=3.5;
        double z=40.5;
        double u=4.5;
        Ans(x,y,z,u);//calling static method
    }
    public static void Ans(double a,double b,double c,double d)//static method with parameter no return value
    {
        double ans=((a*b-b*b)/(c-d));//calculating and storing the value
        System.out.println("Test Data:\n \t((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))");
        System.out.print("Expected Output : ");
        System.out.println(ans);//displaying the answer
    }
}
