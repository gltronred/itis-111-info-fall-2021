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
    boolean broken;
    int correct;
    public Lamp(int correct) {
        this.correct = correct;
    }
    // если включили не в 220 вольт,
    // лампочка сломается и больше
    // не будет включаться
    public void turnOn(int voltage) {
        if (voltage > this.correct) {
            broken = true;
            on = false;
        } else if (!broken){
            on = true;
        }
    }
    public void turnOff(){ on = false; }
    public boolean isOn(){ return on; }
}

class Light {
    public Light(int n) {}
    public void turnOn() {}
    public void turnOff() {}
    public int getLights() { return 0; }
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

        Lamp lamp = new Lamp(220);
        lamp.turnOn(220); // включается
        System.out.println(lamp.isOn());
        lamp.turnOff();   // выключается
        System.out.println(lamp.isOn());
        lamp.turnOn(380); // ломается
        System.out.println(lamp.isOn());
        lamp.turnOn(220); // не включается - сломана
        System.out.println(lamp.isOn());

        // лампочка l2 рассчитана на 380 В
        Lamp l2 = new Lamp(380);
        // поэтому не ломается
        l2.turnOn(380);
        System.out.println(l2.isOn());
    }
}
