package com.other;

import java.util.*;

// class Another extends Other {
//     public int getId() { return 132; }
// }

public class Other {
    private final int id;
    public Other(int id) { this.id = id; }
    public final int getId() { return id; }

    public static double getSomething() { return Math.PI; }

    private static int count;
    public static int getCount() { return count; }
    public void increase() { count++; }
}
