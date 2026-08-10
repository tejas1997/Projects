import java.util.Scanner;

public class VowelConsonant {

    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String rev = "";
        str = str.toLowerCase();
        int vCount = 0, cCount = 0, sCount = 0;
        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]== 'a' || c[i]== 'e' || c[i]== 'i' || c[i]== 'o' || c[i]== 'u'){
                vCount++;
            }
            else if(c[i]== ' '){
                sCount++;
            }
            else{
                cCount++;
            }
        }

        for(int i=c.length-1;i>=0;i--){
           rev = rev + Character.toString(c[i]); 
        }
        System.out.println("Vowel count is: " + vCount);
        System.out.println("Consonant count is: " + cCount);
        System.out.println("Space count is: " + sCount);
        System.out.println("Reverse of the string is: " + rev);
        scn.close();
    }
}