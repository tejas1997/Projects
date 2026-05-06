import java.util.Scanner;

public class CharCount {
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        String text;
        text = scn.nextLine();
        //System.out.println("The String is: " + text);
        String text_1 = text.trim();
        char[] c = text_1.toCharArray();
        int i, n = c.length;
        for(i=0;i<=n-1;i++)
        {
          int count = 0;  
          boolean counted = false;
          for(int k=0;k<i;k++){
            if(c[k]==c[i]){
                counted = true;
                break;
            }
          }

          if(counted) continue;
          for(int j=0;j<=n-1;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                }
            }
            System.out.println(c[i] + ":" + count);
        }
    }
}