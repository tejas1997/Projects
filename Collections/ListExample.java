import java.util.ArrayList;
 import java.util.List;
import java.util.Scanner;

 public class ListExample {
     public static void main(String[] args) {
         // Create a list
         List<String> list = new ArrayList<>();
            String str;
            Scanner scn = new Scanner(System.in);
            str = scn.nextLine();
         List<Integer> listInt = new ArrayList<>();
         int i;
         Scanner scn1 = new Scanner(System.in);
            i = scn1.nextInt();
         
         // set(int index, E element)
            list.add(str);
            listInt.add(i);

         // size()
         int size = list.size(); // 2

         // Print the list
         System.out.println(list); 
         // Print the size of the list
         System.out.println(size); // Output: 1
         System.out.println(listInt);
     }
 }
