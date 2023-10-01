package BaiTap13;

abstract class Employee {
    protected final int ID;
    protected final String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;
    protected EmployeeType employeeType;
//    protected static int employeeCount;

    public Employee(int ID, String fullName, String birthDay, String phone, String email, EmployeeType employeeType) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
    }
    abstract String ShowInfo();
    abstract String ShowMe();
}
