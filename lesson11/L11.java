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
    // TODO: возвращает новый массив с
    // поэлементной суммой входных массивов
    // (длина - как у самого длинного, вместо
    // отсутствующих элементов - 0)
    public static int[] add2(int[] a, int[] b) {
        return a;
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
        int[] p2 = add(a,c); // 10,11,10,5,5
        int[] q2 = add(c,b); // 18,18,14,2,1
        System.out.println(Arrays.toString(p2));
        System.out.println(Arrays.toString(q2));
    }
}
