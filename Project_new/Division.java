import java.util.*;
public class Division {
    public static void main(String[] args) {
       int a = 0, b = 0, div = 0;
       Scanner sc = new Scanner(System.in);
       try
       {
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        if(b<=0)
        {
            throw new ArithmeticException("Invalid divisor");
        }
        div = a/b;
        System.out.println("The result of division is: " + div);
        }catch(ArithmeticException e)
        {
            System.out.println("Invalid input" + e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter only numbers.");
        }
        finally
        {
            sc.close();
        }
    }
}
