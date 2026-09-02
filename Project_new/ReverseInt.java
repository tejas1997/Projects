import java.util.*;
public class ReverseInt {
    public int reverseint(int x){
        int rev = 0;
        while(x!=0){
            int num = x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev*10 + num;
            x = x/10;
        }
        return rev;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int number = scn.nextInt();
        ReverseInt obj = new ReverseInt();
        int result = obj.reverseint(number);
        if(number == result){
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
        System.out.println("The reversed number is: " + result);
        scn.close();
    }
}
