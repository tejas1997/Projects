import java.util.*;
public class Anagram {
    public static String sortingstring(String str) {
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            for(int j=i+1;j<ch.length;j++){
                char temp = ch[i];
                if(ch[i]>ch[j]){
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        return new String(ch);
    }
    public static boolean isAnagram(String str1, String str2){
        str1 = sortingstring(str1);
        str2 = sortingstring(str2);
        if(str1.equals(str2)){
            System.out.println("String is Anagram");
            return true;
        }
        else
        { 
            System.out.println("String is not Anagram");
            return false;
        }
    }
   public static void main(String[] args){
       System.out.println("Enter two strings to check if they are anagrams:"); 
       Scanner scn = new Scanner(System.in);
       String text1 = scn.nextLine();
       String text2 = scn.nextLine();
       isAnagram(text1,text2);
       scn.close();
   } 
}