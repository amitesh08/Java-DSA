public class Addnum {
    public static void main(String[] args) {
        int res=sum(24,34);
        System.out.println("the sum is "+res);

        /*
        //public method
        Methods1 obj1 = new Methods1();       //here the class was public so we can use it is accessible from anywhere.
        obj1.name();
        */

        //Private method                   to check private method only accessible within same class
        /*
        Modifierstest obj = new Modifierstest();
        obj.print();                     // true not accessible
         */
    }
    public static int sum(int a,int b)
    {
        int res=a+b;
        return res;
    }
}
