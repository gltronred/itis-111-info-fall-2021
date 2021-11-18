import java.io.*;
import java.util.*;

class Counter {
    int counter;
    public void increment() {
        counter++;
    }
    public int getCount() {
        return counter;
    }
}

public class L13 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.increment();
        System.out.println(c1.getCount());
        Counter c2 = new Counter();
        c1.increment();
        System.out.println(c1.getCount());
        System.out.println(c2.getCount());

    }
}
