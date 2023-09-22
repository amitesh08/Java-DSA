import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = "Amitesh";
        char target = 'w';
        System.out.println("the string array is : "+ Arrays.toString(name.toCharArray()));  //to print string as a array {A, m, i, t, e, s, h}

        boolean ans = search(name,target);      //calling the method.
        if (ans) {
            System.out.println("character is in the string ");
        }
        else {
            System.out.println("character not found ");
        }

    }
    static boolean search(String name, char target) {
        if (name.isEmpty()) {       //basically it means [name.length() == 0 ]
            return false;
        }
        for (int i =0 ; i<name.length(); i++) {     //name.length used to return length of the string.
            if ( target == name.charAt(i)) {  //charAt is used traverse char in string.
                return true;
            }
        }
        return false;
    }
}
