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
    public static int f2(int s) {
        s = 123456;
        return s;
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
        System.out.println(Arrays.toString(args));
        System.out.println(f(2+1));
        int x = 12;
        System.out.println(f1(x*x,f(32)));
        int[] a = {1,2,3};
        int[] b = {4,3,2,1};
        int[] c = new int[100];
        print(a);
        print(b);
        print(c);
        x = 123;
        System.out.println(x);
        System.out.println(f2(x));
        System.out.println(x);
        int[] d = new int[4];
        // не сработает: меняем сам указатель
        input1(d);
        print(d);
        // сработает: меняем элементы, но не указатель
        input2(d);
        print(d);
        // сработает: возвращаем массив
        d = input3(5);
        print(d);
        // Проверка isPrime
        for (int i=1; i<=20; i++) {
            System.out.print(i + " ");
            if (isPrime(i)) {
                System.out.println("prime");
            } else {
                System.out.println("composite");
            }
        }
    }
    public static void input1(int[] a) {
        a = new int[3];
        for (int i=0; i<a.length; i++) {
            a[i] = i+1;
        }
    }
    public static void input2(int[] a) {
        for (int i=0; i<a.length; i++) {
            a[i] = i+1;
        }
    }
    public static int[] input3(int n) {
        int[] a = new int[n];
        for (int i=0; i<a.length; i++) {
            a[i] = i+1;
        }
        return a;
    }
    // Возвращает, является ли n простым числом
    public static boolean isPrime(int n) {
        return false;
    }
}
