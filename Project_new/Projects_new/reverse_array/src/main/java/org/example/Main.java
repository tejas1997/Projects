package org.example;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String s;
        Scanner scn = new Scanner(System.in);
        s = scn.nextLine();
        String s2 = "";
        char [] c = s.toCharArray();
        int i=0;
        for(i = s.length()-1; i>=0 ; i--)
        {
           s2 = s2+c[i];
        }
        System.out.println("Reversed String is" + " "+s2);
        if(s.equals(s2))
        {
            System.out.println("String is palindrome");
        }
        else
    {
        System.out.println("String is not a palindrome");
    }
    }
}