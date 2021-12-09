package ru.kfu;

public class Student {
    public Student() {
    }
    public void writeControlWork(Teacher teacher) {
        System.out.println(teacher.getControlWork());
    }
    protected boolean isPresent() {
        return true;
    }
}
