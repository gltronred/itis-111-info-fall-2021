import java.io.*;
import java.util.*;

import ru.kfu.*;
import com.company.Carry;
import com.other.Other;

public class L15 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        Teacher teacher = new Teacher();
        System.out.println(teacher);
        Carry carry = new Carry();
        System.out.println(carry);
        // Subject - не public class,
        // ошибка компиляции!
        // Subject subject = new Subject();
        // System.out.println(subject);
        Student student = new Student();
        student.writeControlWork(teacher);
        // getControlWork - не public,
        // ошибка компиляции!
        // System.out.println(teacher.getControlWork());
        GroupHead head = new GroupHead();
        System.out.println(head.getPresence(student));
        // isPresent - не public,
        // ошибка компиляции!
        // System.out.println(student.isPresent());
        carry.selfTest();

        Other o1 = new Other(1);
        Other o2 = new Other(2);
        System.out.println(o1.getId());
        System.out.println(o2.getId());

        o1.increase();
        o2.increase();
        System.out.println(o1.getCount());
        System.out.println(o2.getCount());
        System.out.println(Other.getCount());
    }
}
