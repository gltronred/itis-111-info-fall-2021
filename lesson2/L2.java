
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
        // int a = sc.nextInt();
        // if (a % 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }
        /////////////////////////////////////
        // Вводятся координаты точки,
        // проверить, что она ниже прямой
        // через (0,5) и (4,0)
        //
        // Уравнение прямой через эти точки?
        // y = kx + b
        // Система уравнений
        // 5 = b
        // 0 = 4k + 5
        // k = -1.25
        // Уравнение:
        // y = -1.25x + 5
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // if (y <= -1.25*x + 5) {
        //     if (y >= 0) {
        //         if (x >= 0) {
        //             System.out.println("Inside");
        //         } else {
        //             System.out.println("Outside");
        //         }
        //     } else {
        //         System.out.println("Outside");
        //     }
        // } else {
        //     System.out.println("Outside");
        // }
        if (y <= -1.25*x + 5 && y >= 0 && x >= 0) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
