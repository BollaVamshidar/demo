package com.samples;
import java.util.*;

/*
This class two int input and print resultant output
*/
public class Addition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
         int b=sc.nextInt();
         int c=a+b;
        System.out.println("result : "+c);
    }
}