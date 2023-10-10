package BaiTap13.Service.Interface;

import BaiTap1.CanBo;
import BaiTap1.QLCB;
import BaiTap13.Entity.Employee;
import BaiTap13.Entity.EmployeeManagement;
import BaiTap13.Entity.EmployeeType;

public interface IFunctionService {
    public char chooseFunctionMainMenu();
    public char chooseFunctionAddEmployee();
    public char chooseFunctionUpdateEmployee();
    public char chooseFieldUpdate(int x, int y);
    public char chooseFunctionSearchEmployee();
    public char chooseFunctionSearchTypeEmployee();
    public char chooseFunctionSearchEmployeeByInfo();
    public char chooseFunctionDeleteEmployee();
    public void chucNang1(EmployeeManagement employeeManagement);
    public void chucNang2(EmployeeManagement employeeManagement);
    public void chucNang3(EmployeeManagement employeeManagement);
    public void chucNang4(EmployeeManagement employeeManagement);

    public void chucNang11(EmployeeManagement employeeManagement);
    public void chucNang12(EmployeeManagement employeeManagement);
    public void chucNang13(EmployeeManagement employeeManagement);

    public void chucNang21(EmployeeManagement employeeManagement, int id);
    public void chucNang22(EmployeeManagement employeeManagement, int id);

    public void chucNang31(EmployeeManagement employeeManagement);
    public void chucNang32(EmployeeManagement employeeManagement);
    public void chucNang33(EmployeeManagement employeeManagement);

    public void chucNang41(EmployeeManagement employeeManagement);
    public void chucNang42(EmployeeManagement employeeManagement);
    public void chucNang43(EmployeeManagement employeeManagement);
    public void chucNang44(EmployeeManagement employeeManagement);
    public void chucNang45(EmployeeManagement employeeManagement);

}
