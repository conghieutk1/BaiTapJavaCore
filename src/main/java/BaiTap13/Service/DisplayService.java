package BaiTap13.Service;

import BaiTap13.Service.Interface.IDisplayService;

import java.util.Scanner;

public class DisplayService implements IDisplayService {
    Scanner wait = new Scanner(System.in);
    @Override
    public void displayFormProgram() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Thêm mới nhân viên                            |");
        System.out.println("|2. Chỉnh sửa thông tin nhân viên                 |");
        System.out.println("|3. Tìm kiếm nhân viên                            |");
        System.out.println("|4. Xoá nhân viên                                 |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }
    @Override
    public void displayFormAddEmployee() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Thêm mới thực tập sinh                        |");
        System.out.println("|2. Thêm mới nhân viên mới ra trường              |");
        System.out.println("|3. Thêm mới nhân viên có kinh nghiệm lâu năm     |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }
    @Override
    public void displayFormUpdateEmployee() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Cập nhật tất cả thông tin nhân viên theo id   |");
        System.out.println("|2. Cập nhật một thông tin nhân viên theo id      |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }

    @Override
    public void displayFormChooseInformInternToUpdate() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Họ và tên                                     |");
        System.out.println("|2. Ngày sinh                                     |");
        System.out.println("|3. Số điện thoại                                 |");
        System.out.println("|4. Địa chỉ email                                 |");
        System.out.println("|5. Chuyên ngành đang học                         |");
        System.out.println("|6. Học kì đang học                               |");
        System.out.println("|7. Tên trường đang học                           |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }

    @Override
    public void displayFormChooseInformFresherToUpdate() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Họ và tên                                     |");
        System.out.println("|2. Ngày sinh                                     |");
        System.out.println("|3. Số điện thoại                                 |");
        System.out.println("|4. Địa chỉ email                                 |");
        System.out.println("|5. Thời gian tốt nghiệp                          |");
        System.out.println("|6. Xếp loại tốt nghiệp                           |");
        System.out.println("|7. Trường tốt nghiệp                             |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }

    @Override
    public void displayFormChooseInformExperienceToUpdate() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Họ và tên                                     |");
        System.out.println("|2. Ngày sinh                                     |");
        System.out.println("|3. Số điện thoại                                 |");
        System.out.println("|4. Địa chỉ email                                 |");
        System.out.println("|5. Số năm kinh nghiệm                            |");
        System.out.println("|6. Kỹ năng chuyên môn                            |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }

    @Override
    public void displayFormSearchEmployee() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Tìm kiếm theo loại nhân viên                  |");
        System.out.println("|2. Tìm kiếm theo ID                              |");
        System.out.println("|3. Tìm kiếm theo thông tin cá nhân               |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }

    @Override
    public void displayFormSearchTypeEmployee() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Tìm kiếm tất cả thực tập sinh                 |");
        System.out.println("|2. Tìm kiếm tất cả nhân viên mới ra trường       |");
        System.out.println("|3. Tìm kiếm tất cả nhân viên nhiều kinh nghiệm   |");
        System.out.println("|4. Tìm kiếm tất cả nhân viên                     |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }

    @Override
    public void displayFormSearchEmployeeByInfo() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Thực tập sinh                                 |");
        System.out.println("|2. Nhân viên mới ra trường                       |");
        System.out.println("|3. Nhân viên nhiều kinh nghiệm                   |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }

    @Override
    public void displayFormDeleteEmployeeByInfo() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Xoá nhân viên theo ID                         |");
        System.out.println("|2. Xoá tất cả thực tập sinh                      |");
        System.out.println("|3. Xoá tất cả nhân viên mới ra trường            |");
        System.out.println("|4. Xoá tất cả nhân viên nhiều kinh nghiệm        |");
        System.out.println("|5. Xoá tất cả nhân viên                          |");
        System.out.println("|0. Thoát                                         |");
        System.out.println("+-------------------------------------------------+");
    }


    @Override
    public void displayError(String error) {
        System.out.println(error);
        System.out.print("Nhấn phím bất kỳ để tiếp tục...");
        wait.nextLine();
    }
}
