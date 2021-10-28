import java.util.*;

public class L10 {
    public static int f(int x) {
        if (x % 2 == 0) {
            return x/2;
        }
        return 3*x+1;
    }
    public static int f1(int x, int y) {
        return x + y;
    }
    public static void print(int[] a) {
        if (a.length > 10) {
            System.out.println("[...]");
            return;
        }
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // return; // можно не писать (для void)
    }
    public static void main(String[] args) {
        System.out.println(f(2+1));
        int x = 12;
        System.out.println(f1(x*x,f(32)));
        int[] a = {1,2,3};
        int[] b = {4,3,2,1};
        int[] c = new int[100];
        print(a);
        print(b);
        print(c);
    }
}
