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
    public String toString() {
        return "Counter:" + counter;
    }
}

class Lamp {
    boolean on;
    // если включили не в 220 вольт,
    // лампочка сломается и больше
    // не будет включаться
    public void turnOn(int voltage) {
        on = true;
    }
    public void turnOff(){ on = false; }
    public boolean isOn(){ return on; }
}

public class L13 {
    // public static Counter inc(Counter c) {
    //     c.increment();
    //     return c;
    // }
    public static void main(String[] args) {
        // int[] x = new int[5];
        // Counter c1 = new Counter();
        // c1.increment();
        // System.out.println(c1.getCount());
        // Counter c2 = new Counter();
        // c1.increment();
        // System.out.println(c1.getCount());
        // System.out.println(c2.getCount());
        // System.out.println(inc(c1).getCount());
        // System.out.println(c1);
        // System.out.println(inc(c1));

        Lamp lamp = new Lamp();
        lamp.turnOn(220); // включается
        System.out.println(lamp.isOn());
        lamp.turnOff();   // выключается
        System.out.println(lamp.isOn());
        lamp.turnOn(380); // ломается
        System.out.println(lamp.isOn());
        lamp.turnOn(220); // не включается - сломана
        System.out.println(lamp.isOn());
    }
}
