import java.util.Scanner;
import java.util.ArrayList; 

public class BrowserList {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> browsers = new ArrayList<>();
        int browserListSize = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<browserListSize;i++){
            String input = sc.nextLine();
            browsers.add(input);
        }
        System.out.println(browsers);
        int index = sc.nextInt();
        System.out.println("Browser at index " + index + ": " + browsers.get(index));
        browsers.remove(index);
        System.out.println("Updated browser list: " + browsers);
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("Enter a browser to search for: " + str);
        //boolean found = false;
        for(int i=0;i<browsers.size();i++){
            if(browsers.get(i).equals(str)){
                System.out.println("Browser is in the list at index: " + i);
                //found = true;
            }
        }
        if(!browsers.contains(str)){
            System.out.println("Browser is not in the list.");
        }
        sc.close();
    }
}