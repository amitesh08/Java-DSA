import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int res = addnum();
        System.out.println("the sum of a and b is "+res);
    }

    public static int addnum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first number: ");
        int a=sc.nextInt();
        System.out.print("enter your second number: ");
        int b=sc.nextInt();
        int add= a+b;
        return add;
    }
}
