import java.util.Scanner;

public class Palindrome{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        String text, rev = "";
        text = scn.nextLine();
        char[] c = text.toCharArray();
        int i;
        for(i=c.length-1;i>=0;i--)
        {
            rev = rev+c[i];
        }
        if(rev.equals(text)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not plaindrome");
        }
    }
}