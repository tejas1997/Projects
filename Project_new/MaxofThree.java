import java.util.*;
public class MaxofThree {
    public int maxofthree(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers to find the maximum: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        MaxofThree obj = new MaxofThree();
        int result = obj.maxofthree(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + result);
        scn.close();
    }
    
}
