import java.util.Scanner;

class Add {
    int a,b,sum;
    public int Add(int a, int b) {
        sum = a+b;
        return sum;
    }
}

class Calc extends Add { 

    public static void main(String[] args) {
    int c,d,sum1;
    Scanner scn = new Scanner(System.in);
    c = scn.nextInt();
    d = scn.nextInt();
    Add s = new Add(); 
    sum1 = s.Add(c,d);
    System.out.println("The sum is: " + sum1);
    }
}
