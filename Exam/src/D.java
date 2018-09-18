import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class D {
    public static void main(String[] args){
        System.out.println(GCD(4,6));
    }

    public static int GCD(int a, int b){
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        return GCD(b, a%b);
    }
}
