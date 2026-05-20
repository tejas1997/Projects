import java.util.Scanner;

public class NthMinimum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int[] a = new int[5];
        int[] b = new int[5];
        int i,j,k;
        for(i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(i=0; i<a.length; i++){
        System.out.println("The array is:" + a[i]);
        }

        for(k=0;k<a.length;k++)
        {
            for(i=0;i<a.length;i++)
            {
                min = a[i];
                for(j=0;j<a.length;j++)
                {
                    if(a[j]<min)
                    {
                        min = a[j];
                    }  
                }      
            }
            System.out.println(min);  
            b[k] = min;
            System.out.println("The sorted array is:" + b[k]);
        }
        sc.close();
    }
}