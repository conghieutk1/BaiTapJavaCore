package BaiTap6;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final int age;
    private final String homeTown;

    public Student(String name, int age, String homeTown) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    @Override
    public String toString() {
        return "\nPerson { " +
                "Ho ten = " + name +
                ", Tuoi = " + age +
                ", Nghe nghiep = " + homeTown + " }";
    }
}
