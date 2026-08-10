import java.util.*;
public class ArrayElementCount {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i] = scn.nextInt();
        }
        Map<Integer,Integer> sortings = new LinkedHashMap<>();
        for(int sorting:arr)
        {
            sortings.put(sorting,sortings.getOrDefault(sorting,0)+1); 
        }
        sortings.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
        scn.close();
    }
}