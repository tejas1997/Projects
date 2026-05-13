import java.util.Scanner;

public class IgnorePunctuation{
    public static void main(String []args){
        String text, result = "";
        Scanner scn = new Scanner(System.in);
        text = scn.nextLine();
        char[] c = text.toCharArray();
        int i, count = 0;;
        for(i=0;i<c.length;i++){
            boolean res = Character.isAlphabetic(c[i]);
            if(res==true)
            {
                result = result+c[i];
            }
            else
            {
                count++;
            }
        }
        System.out.println("The string without puntuation is : " + result);
    }
}