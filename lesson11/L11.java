import java.util.*;

public class L11 {
    // TODO: возвращает новый массив с
    // поэлементной суммой входных массивов
    public static int[] add(int[] a, int[] b) {
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
    }
}
