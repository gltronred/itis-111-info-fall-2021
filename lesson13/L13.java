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
    public Lamp() {
        this.correct = 220;
    }
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
    public String toString() {
        return "Lamp(" + correct + ")";
    }
}

class RGBLamp extends Lamp {
    int r, g, b;
    RGBLamp(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void turnOn(int voltage) {
        super.turnOn(voltage);
        this.r = 255;
        this.g = 255;
        this.b = 255;
    }
    public int getR() { return r; }
    public int getG() { return g; }
    public int getB() { return b; }
    public String toString() {
        return "RGBLamp(" + correct + ")" +
            " r=" + getR() +
            " g=" + getG() +
            " b=" + getB();
    }
}

class WhiteLamp extends Lamp {
    public WhiteLamp() {
        super(220);
    }
}

class LampFactory {
    // возвращает лампочку со случайным
    // напряжением
    // (см. класс Random)
    Random random;
    public LampFactory() {
        this.random = new Random();
    }
    public Lamp getNewLamp() {
        return new Lamp(random.nextInt(1000));
    }
}

class Light {
    Lamp[] lamps;
    public Light(int n) {
        lamps = new Lamp[n];
        for (int i=0; i<n; i++) {
            lamps[i] = new Lamp(220);
        }
    }
    public void turnOn() {
        for (int i=0; i<lamps.length; i++) {
            lamps[i].turnOn(220);
        }
    }
    public void turnOff() {
        for (int i=0; i<lamps.length; i++) {
            lamps[i].turnOff();
        }
    }
    public int getLights() {
        int s = 0;
        // for (int i=0; i<lamps.length; i++) {
        //     if (lamps[i].isOn()) {
        //         s++;
        //     }
        // }
        for (Lamp lamp : lamps) {
            if (lamp.isOn()) {
                s++;
            }
        }
        return s;
    }
    public void change(int i, Lamp lamp) {
        lamps[i] = lamp;
    }
    public void repair(LampFactory factory) {
        turnOn();
        for (int i=0; i<lamps.length; i++) {
            if (!lamps[i].isOn()) {
                lamps[i] = factory.getNewLamp();
            }
        }
    }
    public String toString() {
        return Arrays.toString(lamps);
    }
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

        // Lamp lamp = new Lamp(220);
        // lamp.turnOn(220); // включается
        // System.out.println(lamp.isOn());
        // lamp.turnOff();   // выключается
        // System.out.println(lamp.isOn());
        // lamp.turnOn(380); // ломается
        // System.out.println(lamp.isOn());
        // lamp.turnOn(220); // не включается - сломана
        // System.out.println(lamp.isOn());

        // // лампочка l2 рассчитана на 380 В
        // Lamp l2 = new Lamp(380);
        // // поэтому не ломается
        // l2.turnOn(380);
        // System.out.println(l2.isOn());

        // // люстра на пять лампочек
        // Light light = new Light(5);
        // System.out.println(light);
        // // включаем
        // light.turnOn();
        // // проверяем, что работает
        // System.out.println(light.getLights());
        // // выключаем
        // light.turnOff();
        // // заменяем лампочку на другую
        // light.change(2, new Lamp(123));
        // System.out.println(light);
        // // включаем и проверяем
        // light.turnOn();
        // System.out.println(light.getLights());

        // LampFactory lampFactory = new LampFactory();
        // for (int i=0; i<5; i++) {
        //     System.out.println(lampFactory.getNewLamp());
        // }
        // light.repair(lampFactory);
        // System.out.println(light);
        RGBLamp l1 = new RGBLamp(100,255,0);
        System.out.println(l1.getR());
        l1.turnOn(220);
        System.out.println(l1.isOn());
        System.out.println(l1);
        Lamp l2 = new RGBLamp(255,100,0);
        System.out.println(l2);
    }
}
