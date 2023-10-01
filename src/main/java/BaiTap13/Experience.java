package BaiTap13;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;
    private static int employeeCount = 0;

    public Experience(int ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType) {
        super(ID, fullName, birthDay, phone, email, employeeType);
    }

    public Experience(int ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        employeeCount++;
    }
    @Override
    String ShowInfo() {
        return "\nExperience { " +
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
        return "\nExperience { " +
                "Số năm kinh nghiệm: " + expInYear +
                ", Kỹ năng chuyên môn: " + proSkill + " }";
    }


}
