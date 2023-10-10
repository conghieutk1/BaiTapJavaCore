package BaiTap13.Service;

import BaiTap13.Entity.*;
import BaiTap13.Service.Interface.IDisplayService;
import BaiTap13.Service.Interface.IFunctionService;
import BaiTap13.Service.Interface.IValidatation;

import java.util.Scanner;

public class FunctionService implements IFunctionService {
    IValidatation validatation = new Validation();
    IDisplayService displayService = new DisplayService();
    Scanner input = new Scanner(System.in);
    Scanner wait = new Scanner(System.in);

    boolean check = true;
    int input1 = 0;
    String result = "";
    @Override
    public char chooseFunctionMainMenu() {
        do {
            displayService.displayFormProgram();
            try {
                System.out.print("Nhập chức năng: ");
                result = input.nextLine().trim();
                check = validatation.validateNumber(result, "Chức năng",0, 4);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!check);
        result = result.trim();
        return  result.charAt(0);
    }

    @Override
    public char chooseFunctionAddEmployee() {
        do {
            displayService.displayFormAddEmployee();
            try {
                System.out.print("Nhập chức năng: ");
                result = input.nextLine().trim();
                check = validatation.validateNumber(result, "Chức năng",0, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!check);
        result = result.trim();
        return  result.charAt(0);
    }


    @Override
    public char chooseFunctionUpdateEmployee() {
        do {
            displayService.displayFormUpdateEmployee();
            try {
                System.out.print("Nhập chức năng: ");
                result = input.nextLine().trim();
                check = validatation.validateNumber(result, "Chức năng",0, 2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!check);
        result = result.trim();
        return  result.charAt(0);
    }

    @Override
    public char chooseFieldUpdate(int x, int y) {
        do {

            try {
                System.out.print("Nhập trường thay đổi: ");
                result = input.nextLine().trim();
                check = validatation.validateNumber(result, "Trường thay đổi",x, y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        return  result.charAt(0);
    }

    @Override
    public char chooseFunctionSearchEmployee() {
        do {
            displayService.displayFormSearchEmployee();
            try {
                System.out.print("Nhập chức năng: ");
                result = input.nextLine().trim();
                check = validatation.validateNumber(result, "Chức năng",0, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!check);
        result = result.trim();
        return  result.charAt(0);
    }

    @Override
    public char chooseFunctionSearchTypeEmployee() {
        do {
            displayService.displayFormSearchTypeEmployee();
            try {
                System.out.print("Nhập chức năng: ");
                result = input.nextLine().trim();
                check = validatation.validateNumber(result, "Chức năng",0, 4);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!check);
        result = result.trim();
        return  result.charAt(0);
    }

    @Override
    public char chooseFunctionSearchEmployeeByInfo() {
        do {
            displayService.displayFormSearchEmployeeByInfo();
            try {
                System.out.print("Nhập chức năng: ");
                result = input.nextLine().trim();
                check = validatation.validateNumber(result, "Chức năng",0, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!check);
        result = result.trim();
        return  result.charAt(0);
    }

    @Override
    public char chooseFunctionDeleteEmployee() {
        do {
            displayService.displayFormDeleteEmployeeByInfo();
            try {
                System.out.print("Nhập chức năng: ");
                result = input.nextLine().trim();
                check = validatation.validateNumber(result, "Chức năng",0, 5);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!check);
        result = result.trim();
        return  result.charAt(0);
    }

    @Override
    public void chucNang1(EmployeeManagement employeeManagement) {
        char b;
        do {
            b = chooseFunctionAddEmployee();
            switch (b) {
                case '1' -> {
                    chucNang11(employeeManagement);
                }
                case '2' -> {
                    chucNang12(employeeManagement);
                }
                case '3' -> {
                    chucNang13(employeeManagement);
                }
                default -> {
                }
            }
        } while (b != '0');
    }
    @Override
    public void chucNang2(EmployeeManagement employeeManagement) {
        int id = 0;
        do {
            try {
                System.out.print("Nhập id nhân viên cần chỉnh sửa: ");
                result = input.nextLine().trim();
                check = validatation.validateID(result, employeeManagement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        id = Integer.parseInt(result);
        System.out.println("Bạn vừa chọn nhân viên có id là " + id);
        employeeManagement.showEmployeeByID(id);

        char b;
        do {
            b = chooseFunctionUpdateEmployee();
            switch (b) {
                case '1' -> {
                    chucNang21(employeeManagement, id);
                }
                case '2' -> {
                    chucNang22(employeeManagement, id);
                }
                default -> {
                }
            }
        } while (b != '0');
    }
    @Override
    public void chucNang3(EmployeeManagement employeeManagement) {
        char b;
        do {
            b = chooseFunctionSearchEmployee();
            switch (b) {
                case '1' -> {
                    chucNang31(employeeManagement);
                }
                case '2' -> {
                    chucNang32(employeeManagement);
                }
                case '3' -> {
                    chucNang33(employeeManagement);
                }
                default -> {
                }
            }
        } while (b != '0');
    }
    @Override
    public void chucNang4(EmployeeManagement employeeManagement) {
        char b;
        do {
            b = chooseFunctionDeleteEmployee();
            switch (b) {
                case '1' -> {
                    chucNang41(employeeManagement);
                }
                case '2' -> {
                    chucNang42(employeeManagement);
                }
                case '3' -> {
                    chucNang43(employeeManagement);
                }
                case '4' -> {
                    chucNang44(employeeManagement);
                }
                case '5' -> {
                    chucNang45(employeeManagement);
                }
                default -> {
                }
            }
            System.out.println("Danh sách tất cả nhân viên");
            employeeManagement.showAllEmployee();
        } while (b != '0');
    }

    @Override
    public void chucNang11(EmployeeManagement employeeManagement) {
        int id = employeeManagement.getEmployeeList().size() + 1;
        String fullName = "";
        String birthDay = "";
        String phone = "";
        String email = "";
        String majors = "";
        String semester = "";
        String universityName = "";

//        Nhập họ và tên
        do {
            try {
                System.out.print("Nhập họ và tên: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Họ và tên", 0, 30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        fullName += result;

//        Nhập ngày sinh
        do {
            try {
                System.out.print("Nhập ngày sinh: ");
                result = input.nextLine().trim();
                check = validatation.validateDateTime(result, "Ngày sinh", 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        birthDay += result;

        //        Nhập số điện thoại
        do {
            try {
                System.out.print("Nhập số điện thoại: ");
                result = input.nextLine().trim();
                check = validatation.validatePhoneNumber(result, 0, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        phone += result;

//        Nhập email
        do {
            try {
                System.out.print("Nhập email: ");
                result = input.nextLine().trim();
                check = validatation.validateEmail(result, 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        email += result;

//        Nhập chuyên ngành đang học
        do {
            try {
                System.out.print("Nhập chuyên ngành đang học: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Chuyên ngành đang học", 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        majors += result;

//        Nhập học kỳ đang học
        do {
            try {
                System.out.print("Nhập học kỳ đang học: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Học kỳ đang học",0, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        semester += result;

//        Nhập tên trường đang học
        do {
            try {
                System.out.print("Nhập tên trường đang học: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Tên trường đang học", 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        universityName += result;

        employeeManagement.insertEmployee(new Intern(id, fullName, birthDay, phone, email, EmployeeType.INTERN, majors, semester, universityName));
        employeeManagement.showAMountEmployee(EmployeeType.INTERN);
        System.out.println("Thêm mới thành công thực tập sinh");
        employeeManagement.showEmployeeByID(id);

    }
    @Override
    public void chucNang12(EmployeeManagement employeeManagement) {
        int id = employeeManagement.getEmployeeList().size() + 1;
        String fullName = "";
        String birthDay = "";
        String phone = "";
        String email = "";
        String graduationDate = "";
        String graduationRank = "";
        String universityName = "";

//        Nhập họ và tên
        do {
            try {
                System.out.print("Nhập họ và tên: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Họ và tên", 0, 30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        fullName += result;

//        Nhập ngày sinh
        do {
            try {
                System.out.print("Nhập ngày sinh: ");
                result = input.nextLine().trim();
                check = validatation.validateDateTime(result, "Ngày sinh", 0, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        birthDay += result;

//        Nhập số điện thoại
        do {
            try {
                System.out.print("Nhập số điện thoại: ");
                result = input.nextLine().trim();
                check = validatation.validatePhoneNumber(result, 0, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        phone += result;

//        Nhập email
        do {
            try {
                System.out.print("Nhập email: ");
                result = input.nextLine().trim();
                check = validatation.validateEmail(result, 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        email += result;

//        Nhập thời gian tốt nghiệp
        do {
            try {
                System.out.print("Nhập thời gian tốt nghiệp: ");
                result = input.nextLine().trim();
                check = validatation.validateDateTime(result, "Thời gian tốt nghiệp", 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        graduationDate += result;

//        Nhập xếp loại tốt nghiệp
        do {
            try {
                System.out.print("Nhập xếp loại tốt nghiệp: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Xếp loại tốt nghiệp",0, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        graduationRank += result;

//        Nhập tên trường đang học
        do {
            try {
                System.out.print("Nhập tên trường tốt nghiệp: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Tên trường tốt nghiệp", 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        universityName += result;

        employeeManagement.insertEmployee(new Fresher(id, fullName, birthDay, phone, email, EmployeeType.FRESHER, graduationDate, graduationRank, universityName));
        employeeManagement.showAMountEmployee(EmployeeType.FRESHER);
        System.out.println("Thêm mới thành công nhân viên mới ra trường");
        employeeManagement.showEmployeeByID(id);

    }
    @Override
    public void chucNang13(EmployeeManagement employeeManagement) {
        int id = employeeManagement.getEmployeeList().size() + 1;
        String fullName = "";
        String birthDay = "";
        String phone = "";
        String email = "";
        int expInYear = 0;
        String proSkill = "";

//        Nhập họ và tên
        do {
            try {
                System.out.print("Nhập họ và tên: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Họ và tên", 0, 30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        fullName += result;

//        Nhập ngày sinh
        do {
            try {
                System.out.print("Nhập ngày sinh: ");
                result = input.nextLine().trim();
                check = validatation.validateDateTime(result, "Ngày sinh", 0, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        birthDay += result;

//        Nhập số điện thoại
        do {
            try {
                System.out.print("Nhập số điện thoại: ");
                result = input.nextLine().trim();
                check = validatation.validatePhoneNumber(result, 0, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        phone += result;

//        Nhập email
        do {
            try {
                System.out.print("Nhập email: ");
                result = input.nextLine().trim();
                check = validatation.validateEmail(result, 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        email += result;

//        Nhập số năm kinh nghiệm
        do {
            try {
                System.out.print("Nhập số năm kinh nghiệm: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Số năm kinh nghiệm",0, 30);
//                check = validatation.validateNumber(result, "Số năm kinh nghiệm",0, 30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        expInYear = Integer.parseInt(result);

//        Nhập kỹ năng chuyên môn
        do {
            try {
                System.out.print("Nhập kỹ năng chuyên môn: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Kỹ năng chuyên môn",0, 30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        proSkill += result;

        employeeManagement.insertEmployee(new Experience(id, fullName, birthDay, phone, email, EmployeeType.EXPERIENCE, expInYear, proSkill));
        employeeManagement.showAMountEmployee(EmployeeType.EXPERIENCE);
        System.out.println("Thêm mới thành công nhân viên có kinh nghiệm lâu năm");
        employeeManagement.showEmployeeByID(id);

    }

    @Override
    public void chucNang21(EmployeeManagement employeeManagement, int id) {
        Employee tempEmployee = employeeManagement.searchEmployeeByIdReturnObject(id);
        EmployeeType employeeType = tempEmployee.employeeType;
        String fullName = "";
        String birthDay = "";
        String phone = "";
        String email = "";

//        Nhập họ và tên
        do {
            try {
                System.out.print("Nhập họ và tên: ");
                result = input.nextLine().trim();
                check = validatation.validateStringInput(result, "Họ và tên", 0, 30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        fullName += result;

//        Nhập ngày sinh
        check = false;
        do {
            try {
                System.out.print("Nhập ngày sinh: ");
                result = input.nextLine().trim();
                check = validatation.validateDateTime(result, "Ngày sinh", 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        birthDay += result;

//        Nhập số điện thoại
        check = false;
        do {
            try {
                System.out.print("Nhập số điện thoại: ");
                result = input.nextLine().trim();
                check = validatation.validatePhoneNumber(result, 0, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        phone += result;

//        Nhập email
        check = false;
        do {
            try {
                System.out.print("Nhập email: ");
                result = input.nextLine().trim();
                check = validatation.validateEmail(result, 0, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        result = result.trim();
        email += result;

        // More information
        switch (employeeType) {
            case INTERN -> {
                String majors = "";
                String semester = "";
                String universityName = "";
//        Nhập chuyên ngành đang học
                check = false;
                do {
                    try {
                        System.out.print("Nhập chuyên ngành đang học: ");
                        result = input.nextLine().trim();
                        check = validatation.validateStringInput(result, "Chuyên ngành đang học", 0, 20);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                majors += result;

//        Nhập học kỳ đang học
                check = false;
                do {
                    try {
                        System.out.print("Nhập học kỳ đang học: ");
                        result = input.nextLine().trim();
                        check = validatation.validateStringInput(result, "Học kỳ đang học",0, 10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                semester += result;

//        Nhập tên trường đang học
                check = false;
                do {
                    try {
                        System.out.print("Nhập tên trường đang học: ");
                        result = input.nextLine().trim();
                        check = validatation.validateStringInput(result, "Tên trường đang học", 0, 20);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                universityName += result;

                employeeManagement.updateEmployee(employeeManagement.getEmployeeList().indexOf(tempEmployee), new Intern(id, fullName, birthDay, phone, email, EmployeeType.INTERN, majors, semester, universityName));
            }
            case FRESHER -> {
                String graduationDate = "";
                String graduationRank = "";
                String education = "";
//        Nhập thời gian tốt nghiệp
                check = false;
                do {
                    try {
                        System.out.print("Nhập thời gian tốt nghiệp: ");
                        result = input.nextLine().trim();
                        check = validatation.validateDateTime(result, "Thời gian tốt nghiệp", 0, 20);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                graduationDate += result;

//        Nhập xếp loại tốt nghiệp
                check = false;
                do {
                    try {
                        System.out.print("Nhập xếp loại tốt nghiệp: ");
                        result = input.nextLine().trim();
                        check = validatation.validateStringInput(result, "Xếp loại tốt nghiệp",0, 10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                graduationRank += result;

//        Nhập tên trường đang học
                check = false;
                do {
                    try {
                        System.out.print("Nhập tên trường tốt nghiệp: ");
                        result = input.nextLine().trim();
                        check = validatation.validateStringInput(result, "Tên trường tốt nghiệp", 0, 20);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                education += result;

                employeeManagement.updateEmployee(employeeManagement.getEmployeeList().indexOf(tempEmployee), new Fresher(id, fullName, birthDay, phone, email, EmployeeType.FRESHER, graduationDate, graduationRank, education));
            }
            case EXPERIENCE -> {
                int expInYear = 0;
                String proSkill = "";
//        Nhập số năm kinh nghiệm
                check = false;
                do {
                    try {
                        System.out.print("Nhập số năm kinh nghiệm: ");
                        result = input.nextLine().trim();
                        check = validatation.validateStringInput(result, "Số năm kinh nghiệm", 0, 20);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                expInYear = Integer.parseInt(result);

//        Nhập kỹ năng chuyên môn
                check = false;
                do {
                    try {
                        System.out.print("Nhập kỹ năng chuyên môn: ");
                        result = input.nextLine().trim();
                        check = validatation.validateStringInput(result, "Kỹ năng chuyên môn",0, 30);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                proSkill += result;

                employeeManagement.updateEmployee(employeeManagement.getEmployeeList().indexOf(tempEmployee), new Experience(id, fullName, birthDay, phone, email, EmployeeType.EXPERIENCE, expInYear, proSkill));
            }
        }

        System.out.println("Chỉnh sửa thông tin thành công");
        employeeManagement.showEmployeeByID(id);


    }
    @Override
    public void chucNang22(EmployeeManagement employeeManagement, int id) {
        Employee tempEmployee = employeeManagement.searchEmployeeByIdReturnObject(id);
        EmployeeType employeeType = tempEmployee.employeeType;
        char c = '1';
        do {
            if (employeeType == EmployeeType.INTERN) {
                displayService.displayFormChooseInformInternToUpdate();
                c = chooseFieldUpdate(0, 7);
                switch (c) {
                    case '5' -> {
                        String majors = "";
                        do {
                            try {
                                System.out.print("Nhập chuyên ngành đang học: ");
                                result = input.nextLine().trim();
                                check = validatation.validateStringInput(result, "Chuyên ngành đang học", 0, 20);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } while (!check);
                        result = result.trim();
                        majors += result;
                        ((Intern)tempEmployee).setSemester(majors);
                    }
                    case '6' -> {
                        String semester = "";
                        do {
                            try {
                                System.out.print("Nhập học kỳ đang học: ");
                                result = input.nextLine().trim();
                                check = validatation.validateStringInput(result, "Học kỳ đang học",0, 10);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } while (!check);
                        result = result.trim();
                        semester += result;
                        ((Intern)tempEmployee).setMajors(semester);
                    }
                    case '7' -> {
                        String universityName = "";
                        do {
                            try {
                                System.out.print("Nhập tên trường đang học: ");
                                result = input.nextLine().trim();
                                check = validatation.validateStringInput(result, "Tên trường đang học", 0, 20);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } while (!check);
                        result = result.trim();
                        universityName += result;

                        ((Intern)tempEmployee).setUniversityName(universityName);

                    }
                    default -> {
                    }
                }
            }
            if (employeeType == EmployeeType.FRESHER) {
                displayService.displayFormChooseInformFresherToUpdate();
                c = chooseFieldUpdate(0, 7);
                switch (c) {
                    case '5' -> {
                        String graduationDate = "";
                        do {
                            try {
                                System.out.print("Nhập thời gian tốt nghiệp: ");
                                result = input.nextLine().trim();
                                check = validatation.validateDateTime(result, "Thời gian tốt nghiệp", 0, 20);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } while (!check);
                        result = result.trim();
                        graduationDate += result;
                        ((Fresher)tempEmployee).setGraduationDate(graduationDate);

                    }
                    case '6' -> {
                        String graduationRank = "";
                        do {
                            try {
                                System.out.print("Nhập xếp loại tốt nghiệp: ");
                                result = input.nextLine().trim();
                                check = validatation.validateStringInput(result, "Xếp loại tốt nghiệp",0, 10);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } while (!check);
                        result = result.trim();
                        graduationRank += result;
                        ((Fresher)tempEmployee).setGraduationRank(graduationRank);

                    }
                    case '7' -> {
                        String education = "";
                        do {
                            try {
                                System.out.print("Nhập tên trường tốt nghiệp: ");
                                result = input.nextLine().trim();
                                check = validatation.validateStringInput(result, "Tên trường tốt nghiệp", 0, 20);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } while (!check);
                        result = result.trim();
                        education += result;
                        ((Fresher)tempEmployee).setEducation(education);

                    }
                    default -> {
                    }
                }
            }
            if (employeeType == EmployeeType.EXPERIENCE) {
                displayService.displayFormChooseInformExperienceToUpdate();
                c = chooseFieldUpdate(0, 6);
                switch (c) {
                    case '5' -> {
                        int expInYear = 0;
                        do {
                            try {
                                System.out.print("Nhập số năm kinh nghiệm: ");
                                result = input.nextLine().trim();
                                check = validatation.validateStringInput(result, "Số năm kinh nghiệm",0, 30);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } while (!check);
                        expInYear = Integer.parseInt(result);
                        ((Experience)tempEmployee).setExpInYear(expInYear);

                    }
                    case '6' -> {
                        String proSkill = "";
                        do {
                            try {
                                System.out.print("Nhập kỹ năng chuyên môn: ");
                                result = input.nextLine().trim();
                                check = validatation.validateStringInput(result, "Kỹ năng chuyên môn",0, 30);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } while (!check);
                        result = result.trim();
                        proSkill += result;

                        ((Experience)tempEmployee).setProSkill(proSkill);

                    }
                    default -> {
                    }
                }
            }
            if (c == '1') {
                String fullName = "";
                do {
                    try {
                        System.out.print("Nhập họ và tên: ");
                        result = input.nextLine().trim();
                        check = validatation.validateStringInput(result, "Họ và tên", 0, 30);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                fullName += result;
                (tempEmployee).setFullName(fullName);
            }
            if (c == '2') {
                String birthDay = "";
                do {
                    try {
                        System.out.print("Nhập ngày sinh: ");
                        result = input.nextLine().trim();
                        check = validatation.validateDateTime(result, "Ngày sinh", 0, 20);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                birthDay += result;
                (tempEmployee).setBirthDay(birthDay);
            }
            if (c == '3') {
                String phoneNumber = "";
                do {
                    try {
                        System.out.print("Nhập số điện thoại: ");
                        result = input.nextLine().trim();
                        check = validatation.validatePhoneNumber(result, 0, 10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                (tempEmployee).setPhone(phoneNumber);
            }
            if (c == '4') {
                String email = "";
                do {
                    try {
                        System.out.print("Nhập email: ");
                        result = input.nextLine().trim();
                        check = validatation.validateEmail(result, 0, 20);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } while (!check);
                result = result.trim();
                email += result;
                System.out.println(email);
                (tempEmployee).setEmail(email);
            }
        } while (c != '0');
    }

    @Override
    public void chucNang31(EmployeeManagement employeeManagement) {
        char b;
        do {
            b = chooseFunctionSearchTypeEmployee();
            switch (b) {
                case '1' -> {
                    employeeManagement.showAllEmployeeByType(EmployeeType.INTERN);
                }
                case '2' -> {
                    employeeManagement.showAllEmployeeByType(EmployeeType.FRESHER);
                }
                case '3' -> {
                    employeeManagement.showAllEmployeeByType(EmployeeType.EXPERIENCE);
                }
                case '4' -> {
                    employeeManagement.showAllEmployee();
                }
                default -> {
                }
            }
        } while (b != '0');
    }
    @Override
    public void chucNang32(EmployeeManagement employeeManagement) {
        int id = 0;
        do {
            try {
                System.out.print("Nhập id nhân viên cần tìm kiếm: ");
                result = input.nextLine().trim();
                check = validatation.validateID(result, employeeManagement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        id = Integer.parseInt(result);

        System.out.println("Bạn vừa chọn nhân viên có id là " + id);
        employeeManagement.showEmployeeByID(id);

    }
    @Override
    public void chucNang33(EmployeeManagement employeeManagement) {
        char b;
        do {
            b = chooseFunctionSearchEmployeeByInfo();
            switch (b) {
                case '1' -> {
                    displayService.displayFormChooseInformInternToUpdate();
                }
                case '2' -> {
                    displayService.displayFormChooseInformFresherToUpdate();
                }
                case '3' -> {
                    displayService.displayFormChooseInformExperienceToUpdate();
                }
                default -> {
                }
            }
        } while (b != '0');
    }

    @Override
    public void chucNang41(EmployeeManagement employeeManagement) {
        int id = 0;
        int checkRespone = 0;
        do {
            try {
                System.out.print("Nhập id nhân viên cần xoá: ");
                result = input.nextLine().trim();
                check = validatation.validateID(result, employeeManagement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        id = Integer.parseInt(result);

        System.out.println("Bạn vừa chọn nhân viên có id là " + id);
        employeeManagement.showEmployeeByID(id);
        do {
            System.out.println("Xác nhận xoá: Yes - Huỷ: No");
            System.out.print("Bạn chọn ? ");
            try {
                result = input.nextLine().trim();
                checkRespone = validatation.validateUserRespone(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (checkRespone == 0);
        if (checkRespone == 1) {
            employeeManagement.deleteEmployeeByID(id);
        }

    }
    @Override
    public void chucNang42(EmployeeManagement employeeManagement) {
        int checkRespone = 0;
        System.out.println("Bạn vừa chọn xoá tất cả thực tập sinh");
        do {
            System.out.println("Xác nhận xoá: Yes - Huỷ: No");
            System.out.print("Bạn chọn ? ");
            try {
                result = input.nextLine().trim();
                checkRespone = validatation.validateUserRespone(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (checkRespone == 0);
        if (checkRespone == 1) {
            employeeManagement.deleteEmployeeByType(EmployeeType.INTERN);
        }

    }
    @Override
    public void chucNang43(EmployeeManagement employeeManagement) {
        int checkRespone = 0;
        System.out.println("Bạn vừa chọn xoá tất cả nhân viên mới ra trường");
        do {
            System.out.println("Xác nhận xoá: Yes - Huỷ: No");
            System.out.print("Bạn chọn ? ");
            try {
                result = input.nextLine().trim();
                checkRespone = validatation.validateUserRespone(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (checkRespone == 0);
        if (checkRespone == 1) {
            employeeManagement.deleteEmployeeByType(EmployeeType.FRESHER);
        }
    }
    @Override
    public void chucNang44(EmployeeManagement employeeManagement) {
        int checkRespone = 0;
        System.out.println("Bạn vừa chọn xoá tất cả nhân viên có kinh nghiệm lâu năm");
        do {
            System.out.println("Xác nhận xoá: Yes - Huỷ: No");
            System.out.print("Bạn chọn ? ");
            try {
                result = input.nextLine().trim();
                checkRespone = validatation.validateUserRespone(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (checkRespone == 0);
        if (checkRespone == 1) {
            employeeManagement.deleteEmployeeByType(EmployeeType.EXPERIENCE);
        }
    }
    @Override
    public void chucNang45(EmployeeManagement employeeManagement) {
        int checkRespone = 0;
        System.out.println("Bạn vừa chọn xoá tất cả nhân viên");
        do {
            System.out.println("Xác nhận xoá: Yes - Huỷ: No");
            System.out.print("Bạn chọn ? ");
            try {
                result = input.nextLine().trim();
                checkRespone = validatation.validateUserRespone(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (checkRespone == 0);
        if (checkRespone == 1) {
            employeeManagement.deleteAllEmployee();
        }
    }


}
