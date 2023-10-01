package BaiTap13;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;
    private static int employeeCount = 0;

    public Intern(int ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType) {
        super(ID, fullName, birthDay, phone, email, employeeType);
    }
    public Intern(int ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType, String majors, String semester, String universityName) {
        super(ID, fullName, birthDay, phone, email, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
        employeeCount++;
    }
    @Override
    String ShowInfo() {
        return "\nIntern { " +
            "ID: " + ID +
            ", Họ tên: " + fullName +
            ", Ngày sinh: " + birthDay +
            ", Số điện thoại: " + phone +
            ", Email: " + fullName +
            ", Loại nhân viên: " + employeeType +
            ", Số lượng nhân viên: " + employeeCount + " }";
    }

    @Override
    String ShowMe() {
        return "\nIntern { " +
            "Chuyên ngành đang học: " + majors +
            ", Học kì đang học: " + semester +
            ", Tên trường đang học: " + universityName +" }";
    }


}
