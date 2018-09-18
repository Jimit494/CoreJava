import java.util.Scanner;

public class Bonus {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scn.next();
        if(isPalindrome(str))
            System.out.println("Given String is Palindrome");
        else
            System.out.println("Given String is Not Palindrome");
    }
    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed String: "+ reverse);
        if (reverse.equals(str))
            return true;
        else
            return false;
    }
}
