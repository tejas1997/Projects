import java.util.*;   
public class DuplicateChar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        Map <Character, Integer> charCountMap = new HashMap<>();
        for(char c: str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
        }
        StringBuilder res = new StringBuilder();
        charCountMap.forEach((key,val)->{
            if(val>1){
                res.append(key);
            }
        });
        System.out.println("The duplicate characters are: " + res.toString());
        sc.close();
    }
}

