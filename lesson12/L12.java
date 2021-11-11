import java.util.*;

public class L12 {
    public static double[] solve(double[][] a, double[] b) {
        return b;
    }
    public static void main(String[] args) {
        double[][] a = {
            {1,2,3},
            {2,4,7},
            {4,9,5}
        };
        double[] b = {14,31,37};
        double[] x = solve(a,b);
        System.out.println(Arrays.toString(x));
    }
}
