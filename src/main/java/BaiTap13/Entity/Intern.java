package BaiTap13.Entity;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;
    private static int employeeCount = 0;

    public Intern(Integer ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType) {
        super(ID, fullName, birthDay, phone, email, employeeType);
    }
    public Intern(Integer ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType, String majors, String semester, String universityName) {
        super(ID, fullName, birthDay, phone, email, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
        employeeCount++;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
    @Override
    String ShowInfo() {
        return "\nIntern { " +
            "ID: " + ID +
            ", Họ tên: " + fullName +
            ", Ngày sinh: " + birthDay +
            ", Số điện thoại: " + phone +
            ", Email: " + email +
            ", Loại nhân viên: " + employeeType +
            ", Số lượng nhân viên: " + employeeCount + " }";
    }

    @Override
    String ShowMe() {
        return "\nIntern { " +
                "ID: " + ID +
                ", Họ tên: " + fullName +
                ", Ngày sinh: " + birthDay +
                ", Số điện thoại: " + phone +
                ", Email: " + email +
                ", Loại nhân viên: " + employeeType +
                ", Số lượng nhân viên: " + employeeCount +
                ", Chuyên ngành đang học: " + majors +
                ", Học kì đang học: " + semester +
                ", Tên trường đang học: " + universityName +" }";
    }


}
