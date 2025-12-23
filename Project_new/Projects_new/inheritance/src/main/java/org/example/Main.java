package org.example;

import java.util.Scanner;
class Add {
    public int add(int a, int b) {
        return a + b;
    }
}
public class Main extends Add{

    public int add(int x, int y)//method overriding
    {
        int res = super.add(x,y);
        System.out.println("Sum using super class is"+ res);
        return x*y;
    }
    public static void main(String[] args)
    {
        int m,n,sum;
        Scanner scn = new Scanner(System.in);
        m = scn.nextInt();
        Scanner scn1 = new Scanner(System.in);
        n = scn1.nextInt();
        Main sum1 = new Main();
        sum = sum1.add(m,n);
        System.out.println("sum using method overloading is"+ sum);
    }
}