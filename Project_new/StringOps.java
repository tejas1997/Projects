import java.util.Scanner;

public class StringOps {

    public static void main(String []args){
        String message;
        Scanner scn = new Scanner(System.in);
        message = scn.nextLine();
        String trimmed = message.replace(" ", "");
        String [] words = message.trim().split("\\s+");
        char[] c = trimmed.toCharArray();
        int n = trimmed.length(), word_count;
        word_count = words.length;
        System.out.println("The total characters in string is: " + n);
        System.out.println("String in uppercase: " + message.toLowerCase());
        System.out.println("String in uppercase: " + message.toUpperCase());
        System.out.println("First Letter is: " + c[0]);
        System.out.println("Last Letter is: " + c[n-1]);
        System.out.println("Word count is: " + word_count);
    }
}