import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int input = scn.nextInt();
        System.out.println("Reversed Number is: "+ reverse(input));

    }

    public static int reverse(int num){
        String n = Integer.toString(num);
        String rev ="";
        int len = n.length();
        for(int i = len-1; i>=0; i--){
            rev = rev + n.charAt(i);
        }
        return Integer.parseInt(rev);
    }
}
