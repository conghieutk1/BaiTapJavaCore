package BaiTap4.Models;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private String fullName;
    private int age;
    private String job;
    private String identityCardNumber;

    private static Set<String> uniqueCMNDs = new HashSet<>();

    public Person(String fullName, int age, String job, String identityCardNumber) {
        this.fullName = fullName;
        this.age = age;
        this.job = job;

        // Kiểm tra số CMND là duy nhất
        if (!isCMNDUnique(identityCardNumber)) {
            throw new IllegalArgumentException("Số CMND đã tồn tại cho một người khác.");
        }
        this.identityCardNumber = identityCardNumber;
        uniqueCMNDs.add(identityCardNumber);
    }

    public static boolean isCMNDUnique(String cmnd) {
        return !uniqueCMNDs.contains(cmnd);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public static Set<String> getUniqueCMNDs() {
        return uniqueCMNDs;
    }

    public static void setUniqueCMNDs(Set<String> uniqueCMNDs) {
        Person.uniqueCMNDs = uniqueCMNDs;
    }
    @Override
    public String toString() {
        return "\nPerson { " +
                "Ho ten = " + fullName +
                ", Tuoi = " + age +
                ", Nghe nghiep = " + job +
                ", So CMND = " + identityCardNumber  + " }";
    }
}

