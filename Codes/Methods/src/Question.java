import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter the number: ");
//        int n = in.nextInt();


        for (int i = 100; i < 1000; i++) {
            if (isarmstrong(i)){
                System.out.println(i);
            }
        }
    }

     static boolean isarmstrong(int n) {
        int original =n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            int cube=rem*rem*rem;
            sum+=cube;
        }
        return sum==original;


    }
}
