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
    public void turnOn() {}
    public void turnOff(){}
    public boolean isOn(){ return false; }
}

public class L13 {
    public static Counter inc(Counter c) {
        c.increment();
        return c;
    }
    public static void main(String[] args) {
        int[] x = new int[5];
        Counter c1 = new Counter();
        c1.increment();
        System.out.println(c1.getCount());
        Counter c2 = new Counter();
        c1.increment();
        System.out.println(c1.getCount());
        System.out.println(c2.getCount());
        System.out.println(inc(c1).getCount());
        System.out.println(c1);
        System.out.println(inc(c1));

        Lamp lamp = new Lamp();
        lamp.turnOn();
        System.out.println(lamp.isOn());
        lamp.turnOff();
        System.out.println(lamp.isOn());
    }
}
