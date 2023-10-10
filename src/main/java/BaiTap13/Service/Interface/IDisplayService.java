package BaiTap13.Service.Interface;

public interface IDisplayService {
    public void displayFormProgram();
    public void displayFormAddEmployee();

    public void displayFormUpdateEmployee();
    public void displayFormChooseInformInternToUpdate();
    public void displayFormChooseInformFresherToUpdate();
    public void displayFormChooseInformExperienceToUpdate();
    public void displayFormSearchEmployee();
    public void displayFormSearchTypeEmployee();
    public void displayFormSearchEmployeeByInfo();
    public void displayFormDeleteEmployeeByInfo();
    public void displayError(String error);
}
