public class DefaultMethod {
    public static void main(String[] args) {
        Default objdefault= new Default();
        objdefault.test();            // it is also accessible within same package

    }
}

class Default {
    void test(){
        System.out.println("thus is default method");
    }
        }
