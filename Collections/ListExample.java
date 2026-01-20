import java.util.ArrayList;
 import java.util.List;

 public class ListExample {
     public static void main(String[] args) {
         // Create a list
         List<String> list = new ArrayList<>();

         // add(E element)
         list.add("Apple");
         list.add("Banana");
         list.add("Cherry");

         // get(int index)
         String secondElement = list.get(1); // "Banana"

         // set(int index, E element)
         list.set(1, "Blueberry");

         // remove(int index)
         list.remove(0); // Removes "Apple"

         // size()
         int size = list.size(); // 2

         // Print the list
         System.out.println(list); // Output: [Blueberry, Cherry]

         // Print the size of the list
         System.out.println(size); // Output: 2
     }
 }
