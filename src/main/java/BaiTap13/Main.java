package BaiTap13;

import BaiTap13.Entity.*;
import BaiTap13.Service.FunctionService;
import BaiTap13.Service.Interface.IFunctionService;
import BaiTap13.Service.Interface.IValidatation;
import BaiTap13.Service.Validation;

public class Main {

    public static void main(String[] args) {
        IFunctionService functionService = new FunctionService();
        Intern intern1 = new Intern(1, "intern1", "05/05/2003", "0922122321", "kan@gmail.com", EmployeeType.INTERN, "Electronic", "20221", "HUST");
        Intern intern2 = new Intern(2, "intern2", "12/09/2002", "0123322321", "asfasc@gmail.com", EmployeeType.INTERN, "IT", "20231", "HUST");
        Fresher fresher = new Fresher(3, "fresher", "17/01/2006", "0823322321", "asdec@gmail.com", EmployeeType.FRESHER, "15/8/2023", "Giỏi", "NEU");
        Experience experience = new Experience(4, "experience", "17/03/2000", "0723322321", "vsdg@gmail.com", EmployeeType.EXPERIENCE, 5, "Lập trình Web");

        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.insertEmployee(intern1);
        employeeManagement.insertEmployee(intern2);
        employeeManagement.insertEmployee(fresher);
        employeeManagement.insertEmployee(experience);
//        employeeManagement.showAllEmployeeByType(EmployeeType.INTERN);
//        employeeManagement.deleteEmployeeByType(EmployeeType.INTERN);
//        employeeManagement.showAllEmployee();
        char a;
        do {
            a = functionService.chooseFunctionMainMenu();
            switch (a) {
                case '1' -> {
                    functionService.chucNang1(employeeManagement);
                }
                case '2' -> {
                    functionService.chucNang2(employeeManagement);
                }
                case '3' -> {
                    functionService.chucNang3(employeeManagement);
                }
                case '4' -> {
                    functionService.chucNang4(employeeManagement);
                }
                default -> {
                }
            }
        } while (a != '0');
    }
}
