import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class ArrayLists{

    public static void StringArrayList(Scanner sc)
    {
        ArrayList<String> stringlist = new ArrayList<>();
        int stringListSize = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<stringListSize; i++){
            String input = sc.nextLine();
            stringlist.add(input);
        }
        System.out.println(stringlist);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<>();
        int listSize = sc.nextInt();
        int sum = 0;
        System.out.println("Enter " + listSize + " elements: ");
        for(int i=0; i<listSize; i++){
        list.add(sc.nextInt());
        }
        System.out.println(list);
        for(int i=0; i<listSize; i++){
            sum += (int) list.get(i);
        }
        System.out.println("Sum: " + sum);
        StringArrayList(sc);
        sc.close();
    }
}