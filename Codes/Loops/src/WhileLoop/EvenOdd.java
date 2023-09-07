package WhileLoop;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        // wrp to check odd and even till user's input

        int a =1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num1= sc.nextInt();

        while (a<=num1)
        {
            if (a%2==0)
                System.out.println("even= "+a);
            else
                System.out.println("odd= "+a);

            a++;
        }
    }
}
