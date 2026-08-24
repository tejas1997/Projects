import java.util.*;
public class ArrayElementCount {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        if(n==0)
        {
            System.out.println("The array is empty");
        }
        else if(n<0)
        {
            System.out.println("The array size cannot be negative");
        }
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        Map<Integer,Integer> sortings = new LinkedHashMap<>();
        while(n>0)
        {
            for(int i=0;i<n;i++)
            {
                sortings.put(arr[i],sortings.getOrDefault(arr[i],0)+1); 
            }
            sortings.forEach((key, value) -> {
            //System.out.println(key + "=" + value);
            if(value>1)
            {
                System.out.println("The duplicate elements are: " + key + " which appears " + value + " times");
            }    
            else if(value==1)
            {
                System.out.println("There are no duplicate elements in the array");
            }
            });    
        }
        scn.close();
    }
}