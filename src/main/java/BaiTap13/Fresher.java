package BaiTap13;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;
    private static int employeeCount = 0;

    public Fresher(int ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType) {
        super(ID, fullName, birthDay, phone, email, employeeType);
    }

    public Fresher(int ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType, String graduationDate, String graduationRank, String education) {
        super(ID, fullName, birthDay, phone, email, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
        employeeCount++;
    }
    @Override
    String ShowInfo() {
        return "\nFresher { " +
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
        return "\nFresher { " +
                "Thời gian tốt nghiệp: " + graduationDate +
                ", Xếp loại tốt nghiệp : " + graduationRank +
                ", Trường tốt nghiệp: " + education + " }";
    }


}
