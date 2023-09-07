package Loopsquestions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num= sc.nextInt();
        print(num);


    }

    public static void print(int n)
    {
        if (n%2==0)
            System.out.println(n+" is even.");
        else
            System.out.println(n+" is odd");
    }
}
