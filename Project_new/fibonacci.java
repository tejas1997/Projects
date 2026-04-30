import java.util.*;
class Fibonacci {
    public static void main(String[] args){
        int a = 0, b = 1, c = 0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("The value of n is: " + n + " The fibonacci series for " + n + " is");
        for(int i = 0; i<=n; i++)
        {
            System.out.println("The fibonacci series is: " + a);
            c = a + b;
            a = b;
            b = c;
        }    
    }
}