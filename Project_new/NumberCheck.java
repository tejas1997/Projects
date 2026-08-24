import java.util.*;
public class NumberCheck {
    public int checkNumber(int num){
        if(num>0){
            return 1;
        }
        else if(num<0){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check if it is positive, negative or zero: ");
        int number = scn.nextInt();
        NumberCheck obj = new NumberCheck();
        int result = obj.checkNumber(number);
        if(result == 1){
            System.out.println(number + " is a Positive number.");
        } else if(result == -1){
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println(number + " is Zero.");
        }
    }
    
}
