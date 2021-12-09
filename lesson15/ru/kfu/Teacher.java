package ru.kfu;

public class Teacher {
    private Subject subject;
    private String controlWork;
    public Teacher() {
        subject = new Subject("info");
        controlWork = "some task";
    }
    String getControlWork() { return controlWork; }
    public String toString() {
        return "Teacher teaching " + subject;
    }
    public static void main(String[] args) {
        System.out.println("main from ru.kfu.Teacher");
    }
}
