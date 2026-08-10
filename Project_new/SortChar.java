import java.util.*;
public class SortChar{ 
    public static void main(String[] args) {
        String str = "badcegf";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            for(int j=i+1;j<ch.length;j++){
                char temp = ch[i];
                if(ch[i]>ch[j]){
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println(new String(ch));
    }
}

