
// Код для Teams: heh735e

import java.util.*;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int d = a*b*c;
        // System.out.println(d);
        //
        /////////////////////////////////////
        //
        // Ввод вещественных чисел зависит
        // от настроек локали:
        // double a = sc.nextDouble();
        // double b = sc.nextDouble();
        // System.out.println(a+b);
        //
        // $ java L2
        // 1,2 3,4
        // 4.6
        //
        // $ LC_ALL=C java L2
        // 1.2 3.4
        // 4.6
        //
        /////////////////////////////////////
        //
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
