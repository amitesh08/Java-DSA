public class Methods1 {

    public static void main(String[] args) {
                 // DIRect calling
                //name();
        // we can only call by the class name when the function is static else the following method is used.

        Methods1 obj1 = new Methods1();
        obj1.name();

        //creating object
        Method2 obj2 = new Method2();
        obj2.name2();

    }
            // METHODS EXAMPLES
    /*static*/ void name()
    {
        System.out.println("Hello! this is Amitesh");
    }
}
class Method2{
    public void name2()
    {
        System.out.println("hi! this is aniket");
    }
}
