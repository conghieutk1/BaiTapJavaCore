package BaiTap13.Entity;

public abstract class Employee {
    protected final Integer ID;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;
    public EmployeeType employeeType;

    public Employee(Integer ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
    }
    abstract String ShowInfo();
    abstract String ShowMe();

    public Integer getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
