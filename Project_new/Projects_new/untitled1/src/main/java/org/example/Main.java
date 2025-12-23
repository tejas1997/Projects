package org.example;

import java.util.Scanner;

class Add{
public int Add()
        {
            int a, b;
            Scanner scn = new Scanner(System.in);
            a = scn.nextInt();
            Scanner scn1 = new Scanner(System.in);
            b = scn1.nextInt();
            int sum;
            sum = a+b;
            return sum;
        }
}
public class Main extends Add {
    public static void main(String[] args)
    {
        int m;
        Add sum = new Add();
        m = sum.Add();
    }
}