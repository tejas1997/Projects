import java.util.Scanner;   
public class DuplicateChar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char duplicate = ' ';
        int count = 0;
        char[] charArray = str.toCharArray();
        for(int i=0;i<charArray.length;i++){
            for(int j=i+1;j<charArray.length;j++){
                if(charArray[i] == charArray[j]){
                    count++;
                    duplicate = charArray[i];
                    break;
                }
            }
        }
        System.out.println("The number of duplicate characters is: " + count);
        System.out.println("The duplicate character is: " + duplicate);
        sc.close();
    }
}