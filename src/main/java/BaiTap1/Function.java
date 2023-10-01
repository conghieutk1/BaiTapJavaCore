package BaiTap1;

import BaiTap1.Interfaces.IFunction;
import BaiTap1.Interfaces.IGiaoDien;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Function implements IFunction {
    IGiaoDien giaodien = new GiaoDien();
    Scanner input = new Scanner(System.in);
    Scanner wait = new Scanner(System.in);

    boolean check = true;
    int input1 = 0;
    String result = "";
    @Override
    public char NhapChucNangMenuChinh() {
        do {
            giaodien.displayBody();
            try {
                System.out.print("Nhập chức năng: ");
                result = input.nextLine().trim();
                check = checkChonChucNang(result, 0, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!check);
        result = result.trim();
        return  result.charAt(0);

    }

    @Override
    public void ChucNang1(QLCB<CanBo> qlcb) {
        char a;
        do {
            do {
                System.out.println("Chọn đối tượng");
                System.out.println("1. Cán bộ");
                System.out.println("2. Công nhân");
                System.out.println("3. Kỹ sư");
                System.out.println("4. Nhân viên");
                System.out.println("0. Thoát");

                try {
                    System.out.print("Bạn chọn ? ");
                    result = input.nextLine().trim(); // kết hợp ký tự đầu tiên và chuỗi còn lại thành một chuỗi String
                    check = checkChonKieuThem(result, 0, 4);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!check);
            result = result.trim();
             a = result.charAt(0);
            switch (a) {
                case '1' -> {
                    CanBo canBo = new CanBo("Hieu", 20, "Male", "Ha Noi");
                    qlcb.addElement(canBo);
                    return;
                }
                case '2' -> {
                    CongNhan congNhan = new CongNhan("Hang", 18, "Female", "Ha Noi", 5);
                    qlcb.addElement(congNhan);
                    return;
                }
                case '3' -> {
                    KySu kySu = new KySu("Dung", 22, "Male", "Da Nang", "Chuan");
                    qlcb.addElement(kySu);
                    return;
                }
                case '4' -> {
                    NhanVien nhanVien = new NhanVien("Lam", 18, "Female", "Ha Noi", "Ban hang");
                    qlcb.addElement(nhanVien);
                    return;
                }

                default -> {
                }
            }
        } while (a != '0');


    }

    @Override
    public void ChucNang2(QLCB<CanBo> qlcb) {
        do {
            try {
                System.out.print("Nhập tên cán bộ cần tìm: ");
                result = input.nextLine().trim(); // kết hợp ký tự đầu tiên và chuỗi còn lại thành một chuỗi String
                check = checkTenTimKiem(result, 2, 50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!check);
        qlcb.searchName(result);
    }

    @Override
    public void ChucNang3(QLCB<CanBo> qlcb) {
        qlcb.displayList();
    }

    @Override
    public boolean checkChonChucNang(String input, int x, int y) {
        try {
            input = input.trim();
            if (input.charAt(0) == '0' && input.length() > 1) {
                giaodien.displayError("Vui lòng nhập một chức năng duy nhất");
                return false;
            }
            int num = Integer.parseInt(input);
            if (num >= x && num <= y) {
                return true;
            }
            giaodien.displayError("Chức năng không hợp lệ, vui lòng nhập lại");
        } catch (Exception ex) {
            if (input.isEmpty()) {
                giaodien.displayError("Bạn chưa nhập chức năng, vui lòng nhập lại");
                return false;
            }
            giaodien.displayError("Chức năng không hợp lệ, vui lòng nhập lại");
            return false;
        }
        return false;
    }
    @Override
    public boolean checkChonKieuThem(String input, int x, int y) {
        try {
            input = input.trim();
            if (input.charAt(0) == '0' && input.length() > 1) {
                giaodien.displayError("Vui lòng chọn một kiểu đối tượng duy nhất");
                return false;
            }
            int num = Integer.parseInt(input);
            if (num >= x && num <= y) {
                return true;
            }
            giaodien.displayError("Không hợp lệ, vui lòng nhập lại");
        } catch (Exception ex) {
            if (input.isEmpty()) {
                giaodien.displayError("Bạn chưa chọn thành công, vui lòng nhập lại");
                return false;
            }
            giaodien.displayError("Không hợp lệ, , vui lòng nhập lại");
            return false;
        }
        return false;
    }
        @Override
        public boolean checkTenTimKiem(String name, int x, int y) {
            try {
                if (name == null || name.trim().isEmpty()) {
                    giaodien.displayError("Tên không được có ký tự đặc biệt, vui lòng nhập lại");
                    return false;
                }

                // Kiểm tra xem tên có chứa số hoặc ký tự đặc biệt không
                Pattern pattern = Pattern.compile(".*[!@#$%^&*()_+=[\\\\]{};':\\\",.<>/?\\\\\\\\|0-9].*");
                Matcher matcher = pattern.matcher(name);
                if (matcher.matches()) {
                    giaodien.displayError("Tên không được có ký tự đặc biệt, vui lòng nhập lại");
                    return false;
                }

                // Kiểm tra độ dài của tên
                int nameLength = name.length();
                if (nameLength >= x && nameLength <= y) {
                    return true;
                } else {
                    giaodien.displayError("Tên phải từ " + x + " đến " + y + " ký tự, vui lòng nhập lại");
                    return false;
                }
            } catch (Exception ex) {
                if (name.isEmpty()) {
                    giaodien.displayError("Bạn chưa nhập thành công, vui lòng nhập lại");
                    return false;
                }
                giaodien.displayError("Không hợp lệ, vui lòng nhập lại");
                return false;
            }

        }
}
