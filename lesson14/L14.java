import java.io.*;
import java.util.*;

interface Delivery {
  void deliver(String what, String where);
}

class Living {}

class Human
        extends Living
        implements Delivery
{
  String name;
  public Human(String name) {
    this.name = name;
  }
  public void deliver(String what, String where) {
    System.out.println(name + " delivers " + what + " to " + where);
  }
}

class Robot implements Delivery {
  int id;
  public Robot(int id) {
    this.id = id;
  }
  public void deliver(String what, String where) {
    System.out.println(id + " bip bop bip " + what + " bip bip " + where);
  }
}

public class L14 {
  public static void work(Delivery d) {
    d.deliver("something", "somewhere");
  }
  public static void main(String[] args) {
    Human human1 = new Human("Alice");
    Human human2 = new Human("Bob");
    Robot robot = new Robot(123);
    human1.deliver("pizza","home");
    robot.deliver("byte", "home");
    work(human2);
    work(robot);
  }
}
