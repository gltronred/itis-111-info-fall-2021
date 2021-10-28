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
    }
}
