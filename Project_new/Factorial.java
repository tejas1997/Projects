import java.util.*;
public class Factorial {
    public int factorial(int n){
        if(n<0){
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        else if(n==0 || n==1){
            return 1;
        }
        else{
            int fact = 1;
            for(int i=2;i<=n;i++){
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int number = scn.nextInt();
        Factorial obj = new Factorial();
        int result = obj.factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
        scn.close();
    }
    
}
