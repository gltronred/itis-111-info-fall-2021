import java.util.*;

public class L11 {
    // DONE: возвращает новый массив с
    // поэлементной суммой входных массивов
    // (длина такая же, как у самого короткого)
    public static int[] add(int[] a, int[] b) {
        int n = Math.min(a.length, b.length);
        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
    public static int get(int[] a, int i) {
        if (i >= a.length)
            return 0;
        return a[i];
    }
    // DONE: возвращает новый массив с
    // поэлементной суммой входных массивов
    // (длина - как у самого длинного, вместо
    // отсутствующих элементов - 0)
    public static int[] add2(int[] a, int[] b) {
        int n = Math.max(a.length, b.length);
        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            c[i] = get(a,i) + get(b,i);
        }
        return c;
    }
    // TODO: в массиве хранятся цифры числа
    // в q-ичной системе счисления. Младшая
    // цифра хранится в первом элементе.
    // Все цифры - от 0 до q-1.
    // Старшая цифра - не 0.
    //    convert(10, {3,2,1}) == 123
    //    convert(16, {14,15}) == 254 (FE) == 15*16+14
    //    convert(2, {0,0,1}) == 4
    // Вернуть само число
    //
    // a[4]     a[3]     a[2]      a[1] a[0]
    //   1       2        3         4    5
    // 1*10^4 + 2*10^3 + 3*10^2 + 4*10 + 5  == 12345
    public static int convert(int q, int[] a) {
        int s = 0;
        for (int i=0; i<n; i++) {
            s *= q;
            s += a[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {9,9,7,1,1};
        int[] r = add(a,b);
        // 10, 11, 10, 5, 6
        System.out.println(Arrays.toString(r));
        // a и b должны остаться теми же
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        // дальше тоже должно работать
        int[] c = {9,9,7,1};
        int[] p = add(a,c); // 10,11,10,5
        int[] q = add(c,b); // 18,18,14,2
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(q));
        int[] p2 = add2(a,c); // 10,11,10,5,5
        int[] q2 = add2(c,b); // 18,18,14,2,1
        System.out.println(Arrays.toString(p2));
        System.out.println(Arrays.toString(q2));

        System.out.println(convert(10,new int[]{3,2,1})); // 123
        System.out.println(convert(16,new int[]{14,15})); // 254
        System.out.println(convert(2,new int[]{0,0,1})); // 4
    }
}
