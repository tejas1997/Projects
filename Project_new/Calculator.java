import java.util.Scanner;

public class Calculator
{
    public static void main(String []args)
    {
        int a,b,sum,diff,prod;
        double div;
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        sum = a+b;
        diff = a-b;
        prod = a*b;
        div = a%b;
        System.out.println("Sum is:" + sum);
        System.out.println("Difference is:" + diff);
        System.out.println("Product is:" + prod);
        System.out.println("Divided value is:" + div);    
    }
}