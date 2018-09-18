import java.util.Scanner;

public class E {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = scn.nextInt();
        System.out.println("Fibonacii f("+num+"): "+fibo(num));
    }

    public static int fibo(int number){
        int[] sum = new int[number+2];
        sum[0]=0;
        sum[1]=1;
        for(int i = 2; i<= number ;i++){
            sum[i] = sum[i-1] + sum[i-2];
        }
        return sum[number];
    }

    //Time Complexity = O(n)
}
