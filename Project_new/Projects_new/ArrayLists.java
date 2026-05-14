import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<>();
        for(int i=0; i<10; i++){
        list.add(sc.nextInt());
        sc.nextLine();
        list.add(sc.nextLine());
        }
        System.out.println(list);
    }
}