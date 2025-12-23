import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
       int n=0;
       int [] a = new int[10];
       int min = 0, i, j, max = 0;
       System.out.println("Enter the number of array elements to input:" + " " + n);
       Scanner scn = new Scanner(System.in);
       n = scn.nextInt();
       System.out.println("The array size is:" + " " + n);
       System.out.println("Enter the array elements:");
       for(i=0; i<=n; i++)
       {
           Scanner scn1 = new Scanner(System.in);
           a[i] = scn1.nextInt();
       }
       for(i=0; i<=n; i++)
        {
            System.out.println("The array elements are:" + " " + a[i]);
        }
        min = a[0];
        for(i=0; i<=n; i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("Minimum Value in a array is:" + " " + min);
        max = a[0];
        for(j=0; j<=n; j++)
        {
            if(a[j]>max)
            {
                max = a[j];
            }
        }
        System.out.println("Maximum Value in a array is:" + " " + max);
    }
}