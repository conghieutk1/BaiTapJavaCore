package BaiTap13.Entity;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;
    private static int employeeCount = 0;

    public Experience(Integer ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType) {
        super(ID, fullName, birthDay, phone, email, employeeType);
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public Experience(Integer ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        employeeCount++;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    String ShowInfo() {
        return "\nExperience { " +
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
        return "\nExperience { " +
                "ID: " + ID +
                ", Họ tên: " + fullName +
                ", Ngày sinh: " + birthDay +
                ", Số điện thoại: " + phone +
                ", Email: " + email +
                ", Loại nhân viên: " + employeeType +
                ", Số lượng nhân viên: " + employeeCount +
                ", Số năm kinh nghiệm: " + expInYear +
                ", Kỹ năng chuyên môn: " + proSkill + " }";
    }


}
