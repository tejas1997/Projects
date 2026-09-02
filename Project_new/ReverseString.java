import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = scn.nextLine();
        char[] ch = str.toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--){
            rev = rev+ch[i];
        }
        System.out.println(rev);
        scn.close();
    }
}