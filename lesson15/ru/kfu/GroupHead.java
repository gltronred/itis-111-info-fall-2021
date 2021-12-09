package ru.kfu;

public class GroupHead extends Student {
    public boolean getPresence(Student student) {
        return student.isPresent();
    }
}
