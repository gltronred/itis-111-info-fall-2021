import java.io.*;
import java.util.*;

interface Delivery {
  void deliver(String what, String where);
}

interface ISpeakable {
  void speak(String who);
}

class Living {}

class Human
        extends Living
        implements Delivery, ISpeakable
{
  String name;
  public Human(String name) {
    this.name = name;
  }
  public void deliver(String what, String where) {
    System.out.println(name + " delivers " + what + " to " + where);
  }
  public void speak(String who) {
    System.out.println(name + " speaks to " + who);
  }
}

class Robot implements Delivery, ISpeakable {
  int id;
  public Robot(int id) {
    this.id = id;
  }
  public void deliver(String what, String where) {
    System.out.println(id + " bip bop bip " + what + " bip bip " + where);
  }
  public void speak(String who) {
    System.out.println(id + " beeps to " + who);
  }
}

class SelfdrivingCar extends Robot {
  public SelfdrivingCar() { super(321); }
}

abstract class Graphic {
  int x, y;
  public void moveTo(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public abstract void draw();
}

class Circle extends Graphic {
  public void draw() {
    System.out.println("Circle(" + x + "," + y + ")");
  }
}

class Rectangle extends Graphic {
  public void draw() {
    System.out.println("Rectangle(" + x + "," + y + ")");
  }
}

public class L14 {
  public static void work(Delivery d) {
    d.deliver("something", "somewhere");
  }
  public static void main(String[] args) {
    // Human human1 = new Human("Alice");
    // Human human2 = new Human("Bob");
    // Robot robot = new Robot(123);
    // human1.deliver("pizza","home");
    // robot.deliver("byte", "home");
    // work(human2);
    // work(robot);
    // ISpeakable s;
    // s = human1;
    // s.speak("me");
    // s = robot;
    // s.speak("me");
    // work(new SelfdrivingCar());
    Graphic circle = new Circle();
    Graphic rectangle = new Rectangle();
    circle.moveTo(23,45);
    rectangle.moveTo(1,2);
    circle.draw();
    rectangle.draw();
  }
}
