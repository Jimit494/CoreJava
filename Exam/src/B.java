import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scn.nextInt();
        System.out.println("Square Root of "+ i + " is: " + root(i));
        System.out.println("Square Root of "+ i + " is: " + customRoot((i)));
    }
    public static double root(int i){
        return Math.sqrt(i);
    }

    public static double customRoot(int i){
        double approx = 0.000001;
        double r = i;
        while (r * r - i > approx) {
            r = 0.5 * (r + i / r);
        }
        return r;
    }

}
