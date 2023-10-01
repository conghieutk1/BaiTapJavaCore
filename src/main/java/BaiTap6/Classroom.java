package BaiTap6;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    List<Student> listStudent = new ArrayList<>();
    private String nameClassroom;

    public Classroom(String nameClassroom) {
        this.nameClassroom = nameClassroom;
    }

    public String getNameClassroom() {
        return nameClassroom;
    }

    public void setNameClassroom(String nameClassroom) {
        this.nameClassroom = nameClassroom;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
    public void addStudent(Student student) {
        listStudent.add(student);
    }
    @Override
    public String toString() {
        return "listStudent { "+ "\nLớp: " + nameClassroom + "\nBao gồm\n" + listStudent + " \n}";
    }
}
