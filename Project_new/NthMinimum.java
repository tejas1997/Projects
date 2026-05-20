import java.util.Scanner;

public class NthMinimum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int i,k;
        for(i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(i=0; i<a.length; i++){
        System.out.println("The array is:" + a[i]);
        }

        for(k=0;k<a.length;k++)
        {
            int minpos = k;
            for(i=k+1;i<a.length;i++)
            {
                if(a[i]<a[minpos])
                {
                    minpos = i;
                }
            }
            int temp = a[k];
            a[k] = a[minpos];
            a[minpos] = temp;
            System.out.println("The sorted array is:" + a[k]);
        }
        System.out.println("The 2nd minimum is:" + a[1]);
        sc.close();
    }
}