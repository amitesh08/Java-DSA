package Loopsquestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number = ");    //taking input from user
        int num= s.nextInt();

        long res=factor(num);                //storing the return value into res
        System.out.println("the factorial of "+num+" is "+res);

    }
    public static long factor(int n)           //method for factorial of number
    {
        long fact=1;
        for(int i = n; i>=1; i--)
        {
            fact*=i;

        }
        return fact;
    }
}
