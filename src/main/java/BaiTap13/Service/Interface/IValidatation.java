package BaiTap13.Service.Interface;

import BaiTap1.CanBo;
import BaiTap1.QLCB;
import BaiTap13.Entity.EmployeeManagement;
import BaiTap13.Exception.BirthDayException;
import BaiTap13.Exception.EmailException;
import BaiTap13.Exception.FullNameException;
import BaiTap13.Exception.PhoneException;

public interface IValidatation {
    public boolean validateID(String input, EmployeeManagement employeeManagement);

    public boolean validateNumber(String input, String typeInput, int x, int y);
    public boolean validateStringInput(String input, String typeInput, int x, int y) throws FullNameException;
    public boolean validateDateTime(String birthDay, String typeInput, int x, int y) throws BirthDayException;
    public boolean validateEmail(String email, int x, int y) throws EmailException;
    public boolean validatePhoneNumber(String phoneNumber, int x, int y) throws PhoneException;
    public int validateUserRespone(String userRespone);

}
