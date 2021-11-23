import java.util.*;

class Alphabet_finder {
    public static void main(String[] args) {
        char c;
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter: ");  
        c = in.next().charAt(0);     

        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is an alphabet.");
        }
        else {
            System.out.println(c + " is not an alphabet.");
        }
    }
}