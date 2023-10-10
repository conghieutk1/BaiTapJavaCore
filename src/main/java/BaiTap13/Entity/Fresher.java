package BaiTap13.Entity;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;
    private static int employeeCount = 0;

    public Fresher(Integer ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType) {
        super(ID, fullName, birthDay, phone, email, employeeType);
    }

    public Fresher(Integer ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType, String graduationDate, String graduationRank, String education) {
        super(ID, fullName, birthDay, phone, email, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
        employeeCount++;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
    @Override
    String ShowInfo() {
        return "\nFresher { " +
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
        return "\nFresher { " +
                "ID: " + ID +
                ", Họ tên: " + fullName +
                ", Ngày sinh: " + birthDay +
                ", Số điện thoại: " + phone +
                ", Email: " + email +
                ", Loại nhân viên: " + employeeType +
                ", Số lượng nhân viên: " + employeeCount +
                ", Thời gian tốt nghiệp: " + graduationDate +
                ", Xếp loại tốt nghiệp : " + graduationRank +
                ", Trường tốt nghiệp: " + education + " }";
    }


}
