package BaiTap13.Service;

import BaiTap13.Entity.EmployeeManagement;
import BaiTap13.Exception.BirthDayException;
import BaiTap13.Exception.EmailException;
import BaiTap13.Exception.FullNameException;
import BaiTap13.Exception.PhoneException;
import BaiTap13.Service.Interface.IDisplayService;
import BaiTap13.Service.Interface.IValidatation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation implements IValidatation{
    IDisplayService displayService = new DisplayService();

    @Override
    public boolean validateID(String input, EmployeeManagement employeeManagement) {
        try {
            input = input.trim();
            if (input.charAt(0) == '0' && input.length() > 1) {
                displayService.displayError("ID không hợp lệ, vui lòng nhập lại");
                return false;
            }
            int id = Integer.parseInt(input);
            if (employeeManagement.searchEmployeeById(id)) {
                return true;
            }
            displayService.displayError("ID không tồn tại, vui lòng nhập lại");
        } catch (Exception ex) {
            if (input.isEmpty()) {
                displayService.displayError("ID không được để trống, vui lòng nhập lại");
                return false;
            }
            displayService.displayError("ID không hợp lệ, vui lòng nhập lại");
            return false;
        }
        return false;
    }

    @Override
    public boolean validateNumber(String input, String typeInput, int x, int y) {
        try {
            input = input.trim();
            if (input.charAt(0) == '0' && input.length() > 1) {
                displayService.displayError("Vui lòng nhập một số duy nhất");
                return false;
            }
            int num = Integer.parseInt(input);
            if (num >= x && num <= y) {
                return true;
            }
            displayService.displayError(typeInput + " không hợp lệ, vui lòng nhập lại");
        } catch (Exception ex) {
            if (input.isEmpty()) {
                displayService.displayError(typeInput + " không được để trống, vui lòng nhập lại");
                return false;
            }
            displayService.displayError(typeInput + " không hợp lệ, vui lòng nhập lại");
            return false;
        }
        return false;
    }

    @Override
    public boolean validateStringInput(String fullName, String typeInput, int x, int y) throws FullNameException {
        try {
            fullName = fullName.trim();
            if (fullName.charAt(0) == '0') {
                displayService.displayError(typeInput + " không hợp lệ, vui lòng nhập lại");
                return false;
            }
            if (fullName.length() > y) {
                displayService.displayError(typeInput + " quá dài, vui lòng nhập dưới " + y + " ký tự");
                return false;
            }
            Pattern pattern = Pattern.compile(".*[!@#$%^&*()_+=[\\\\]{};':\\\",.<>/?\\\\\\\\|].*");
            Matcher matcher = pattern.matcher(fullName);
            if (matcher.matches()) {
                displayService.displayError(typeInput + " không được có ký tự đặc biệt, vui lòng nhập lại");
                return false;
            }
            return true;
        } catch (Exception ex) {
            if (fullName.isEmpty()) {
                throw new FullNameException(typeInput + " không thể để trống");
            }
            displayService.displayError(typeInput + " không hợp lệ, vui lòng nhập lại");
            return false;
        }

    }

    @Override
    public boolean validateDateTime(String birthDay, String typeInput, int x, int y) throws BirthDayException {
        try {
            birthDay = birthDay.trim();
            if (birthDay.charAt(1) == '0' || birthDay.charAt(4) == '0' || birthDay.charAt(6) == '0' ||
                    birthDay.charAt(2) != '/' || birthDay.charAt(5) != '/' || birthDay.length() > y) {
                displayService.displayError(typeInput + " không hợp lệ, vui lòng nhập lại");
                return false;
            }
            Pattern pattern = Pattern.compile(".*[!@#$%^&*()_+=[\\\\]{};':\\\",.<>?\\\\\\\\|a-zA-Z].*");
            Matcher matcher = pattern.matcher(birthDay);
            if (matcher.matches()) {
                displayService.displayError(typeInput + " không được chứa chữ cái, các ký tự đặc biệt trừ ký tự '/', vui lòng nhập lại");
                return false;
            }
            return true;
        } catch (Exception ex) {
            if (birthDay.isEmpty()) {
                throw new BirthDayException(typeInput + " không thể để trống");
            }
            displayService.displayError(typeInput + " không hợp lệ, vui lòng nhập lại");
            return false;
        }
    }

    @Override
    public boolean validateEmail(String email, int x, int y) throws EmailException{
        try {
            email = email.trim();
            if (email.charAt(0) == '0' || !email.contains("@")) {
                displayService.displayError("Email không hợp lệ, vui lòng nhập lại");
                return false;
            }
            if (email.length() > y) {
                displayService.displayError("Email quá dài, vui lòng nhập dưới " + y + " ký tự");
                return false;
            }
            Pattern pattern = Pattern.compile(".*[!#$%^&*()_+=[\\\\]{};':\\\",<>/?\\\\\\\\|].*");
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                displayService.displayError("Họ và tên không được có ký tự đặc biệt trừ '@' và '.', vui lòng nhập lại");
                return false;
            }
            return true;
        } catch (Exception ex) {
            if (email.isEmpty()) {
                throw new EmailException("Email không thể để trống");
            }
            displayService.displayError("Email không hợp lệ, vui lòng nhập lại");
            return false;
        }
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber, int x, int y) throws PhoneException {
        try {
            phoneNumber = phoneNumber.trim();
            if (phoneNumber.charAt(0) != '0' || phoneNumber.charAt(1) == '0' || phoneNumber.length() != 10) {
                displayService.displayError("Số điện thoại không hợp lệ, vui lòng nhập lại");
                return false;
            }
            if (phoneNumber.length() > y) {
                displayService.displayError("Số điện thoại quá dài, vui lòng nhập đủ " + y + " ký tự của số điện thoại");
                return false;
            }
            Pattern pattern = Pattern.compile(".*[!@#$%^&*()_+=[\\\\]{};':\\\",.<>/?\\\\\\\\|a-zA-Z].*");
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.matches()) {
                displayService.displayError("Số điện thoại không được chứa chữ cái hoặc ký tự đặc biệt, vui lòng nhập lại");
                return false;
            }
            return true;
        } catch (Exception ex) {
            if (phoneNumber.isEmpty()) {
                throw new PhoneException("Số điện thoại không thể để trống");
            }
            displayService.displayError("Số điện thoại không hợp lệ, vui lòng nhập lại");
            return false;
        }
    }

    @Override
    public int validateUserRespone(String userRespone) {
        try {
            userRespone = userRespone.trim();
            if (userRespone.charAt(0) == '0') {
                displayService.displayError("Yêu cầu không đúng, vui lòng nhập lại");
                return 0;
            }
            if (userRespone.length() > 3) {
                displayService.displayError("Yêu cầu không đúng, vui lòng nhập lại");
                return 0;
            }
            Pattern pattern = Pattern.compile(".*[!@#$%^&*()_+=[\\\\]{};':\\\",.<>/?\\\\\\\\|0-9].*");
            Matcher matcher = pattern.matcher(userRespone);
            if (matcher.matches()) {
                displayService.displayError("Yêu cầu không đúng, vui lòng nhập lại");
                return 0;
            }
            if (userRespone.equals("Yes") ) {
                return 1;
            } else if (userRespone.equals("No")) {
                return 2;
            }
            displayService.displayError("Yêu cầu không đúng, vui lòng nhập lại");
            return 0;
        } catch (Exception ex) {
            if (userRespone.isEmpty()) {
                displayService.displayError("Yêu cầu không thể để trống");
            }
            displayService.displayError("Yêu cầu không đúng, vui lòng nhập lại");
            return 0;
        }
    }
}
