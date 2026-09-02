import java.util.*;

public class CharCount {
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        String text;
        text = scn.nextLine();
        String text1 = text.toLowerCase();
        //String[] words = text.split("\\s+");
        char [] c = new char[text1.length()];
        c = text1.toCharArray();
        Map<String, Integer> charcounts = new LinkedHashMap<String, Integer>();
        for(char ch : c)
        {
            charcounts.put(String.valueOf(ch), charcounts.getOrDefault(String.valueOf(ch), 0) + 1);
        }
        /*for(String word : words)
        {
            charcounts.put(word, charcounts.getOrDefault(word, 0) + 1);
        }*/
        StringBuilder sb = new StringBuilder();
        charcounts.forEach((key, val)->{
            sb.append(key).append("=").append(val).append("\n");
        });
        System.out.println(sb.toString());
        //System.out.println("The String is: " + text);
        /*String text_1 = text.trim();
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
            //System.out.println(c[i] + ":" + count);
            System.out.print(c[i] + "" + count);*/
        //}
        scn.close();    
    }
}