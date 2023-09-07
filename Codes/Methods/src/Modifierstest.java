public class Modifierstest {
    public static void main(String[] args) {
        //creating obj for private method as it is in same class
        Modifierstest obj = new Modifierstest();
        obj.print();

    }
    //private method
    private void print()
    {
        System.out.println("hi! how are you?");
    }
}


