import java.util.*; 
public class OddOrEven {
    public int checkOddEven(int num){
        if(num%2==0){
            return 0; // Even
        } else {
            return 1; // Odd
        }
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check if it is odd or even: ");
        int number = scn.nextInt();
        OddOrEven obj = new OddOrEven();
        int result = obj.checkOddEven(number);
        if(result == 0){
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
