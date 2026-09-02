import java.util.*;
public class Prime {
    public int is_Prime(int num){
        if(num<=1){
            System.out.println(num + " is not a prime number.");
            return 0;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(num + " is not a prime number.");
                return 0;
            }
        }
        System.out.println(num + " is a prime number.");
        return 1;

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int number = scn.nextInt();
        Prime obj = new Prime();
        obj.is_Prime(number);
        scn.close();
    }
    
}
