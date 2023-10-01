package BaiTap1;

import BaiTap1.Interfaces.IGiaoDien;

import java.util.Scanner;

public class GiaoDien implements IGiaoDien {

    Scanner wait = new Scanner(System.in);
    @Override
    public void displayAdd() {

    }

    @Override
    public void displayBody() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|1. Thêm mới cán bộ                               |");
        System.out.println("|2. Tìm kiếm theo họ tên                          |");
        System.out.println("|3. Hiện thị thông tin danh sách các cán bộ       |");
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
