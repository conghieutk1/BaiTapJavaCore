package BaiTap6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn Văn A", 20, "Nghệ An");
        Student student2 = new Student("Nguyễn Văn B", 12, "Hà Nội");
        Student student3 = new Student("Nguyễn Văn C", 20, "Sài Gòn");
        Student student4 = new Student("Nguyễn Văn D", 23, "Hà Nội");
        Student student5 = new Student("Nguyễn Văn F", 23, "Đà Nẵng");
        Student student6 = new Student("Nguyễn Văn F", 30, "Đà Nẵng");

        System.out.println(student1.toString());


        Classroom classroom = new Classroom("12C1");
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.addStudent(student4);
        classroom.addStudent(student5);
        classroom.addStudent(student6);
        System.out.println(classroom.toString());

        System.out.println("\nCác sinh viên có tuổi là 20:");
        for (Student obj: classroom.listStudent) {
            if (obj.getAge() == 20) {

                System.out.println(obj.toString());
            }
        }
        int count = 0;
        for (Student obj: classroom.listStudent) {
            if (obj.getAge() == 23 && obj.getHomeTown().equals("Đà Nẵng")) {
                count++;
            }
        }
        System.out.println("\nSố lượng các học sinh có tuổi là 23 và quê ở Đà Nẵng: " + count);

    }
}
