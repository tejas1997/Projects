import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int i, n, sum = 10, max;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int a[] = new int [10];
        for(i=0;i<=n;i++){
           Scanner scn1 = new Scanner(System.in);
           a[i] = scn1.nextInt(); 
        }

        for(i=0;i<=n;i++){
            System.out.println("The array elements are:" + a[i]);
        }

        for(i=0;i<=n;i++){
            if(sum!=0){
            max = Arrays.stream(a).max.getAsInt;
            
            sum = sum-max;
            int count = indexofmax;
            System.out.println("The indices are: " + count, indexofmax); 
            }   
        }
    }
}