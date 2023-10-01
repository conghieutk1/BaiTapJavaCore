package BaiTap4;

import BaiTap4.Models.Family;
import BaiTap4.Models.Person;
import BaiTap4.Models.ResidentialGroup;

import java.util.Scanner;

public class Main {
    public static Scanner wait = new Scanner(System.in);

    public static boolean checkChonChucNang(String input, int x, int y) {
        try {
            input = input.trim();
            if (input.charAt(0) == '0' && input.length() > 1) {
                displayError("Vui lòng nhập một chức năng duy nhất");
                return false;
            }
            int num = Integer.parseInt(input);
            if (num >= x && num <= y) {
                return true;
            }
            displayError("Chức năng không hợp lệ, vui lòng nhập lại");
        } catch (Exception ex) {
            if (input.isEmpty()) {
                displayError("Bạn chưa nhập chức năng, vui lòng nhập lại");
                return false;
            }
            displayError("Chức năng không hợp lệ, vui lòng nhập lại");
            return false;
        }
        return false;
    }
    public static void displayError(String error) {
        System.out.println(error);
        System.out.print("Nhấn phím bất kỳ để tiếp tục...");
        wait.nextLine();
    }
    public static void main(String[] args) {
        ResidentialGroup<Family> residentialGroup = new ResidentialGroup<>();
        Family<Person> family1 = new Family<>("3 Bạch Mai");
        Family<Person> family2 = new Family<>("5 Lê Thanh Nghị");
        Family<Person> family3 = new Family<>("Tạ Quang Bửu");

        Person person1 = new Person("Nguyễn Văn A", 30, "Kỹ sư", "123456789");
        family1.addPerson(person1);
        Person person2 = new Person("Nguyễn Văn B", 22, "Sinh viên", "223456789");
        family1.addPerson(person2);
        Person person3 = new Person("Nguyễn Văn C", 28, "Bác sĩ", "323452389");
        family1.addPerson(person3);
        Person person4 = new Person("Nguyễn Thị D", 35, "Giáo viên", "423442789");
        family2.addPerson(person4);
        residentialGroup.addFamily(family1);
        residentialGroup.addFamily(family2);

        // Đối tượng mới có cùng số CMND, sẽ bị từ chối


//        System.out.println(residentialGroup);
//        Main main = new Main();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        char a;
        String result = "";
        do {
            do {
                System.out.println("+-------------------------------------------------+");
                System.out.println("|1. Thêm thành viên vào gia đình có sẵn           |");
                System.out.println("|2. Thêm thành viên vào gia đình mới              |");
                System.out.println("|3. Thêm gia đình vào khu dân cư                  |");
                System.out.println("|4. Xem danh sách các hộ dân cư                   |");
                System.out.println("|0. Thoát                                         |");
                System.out.println("+-------------------------------------------------+");
                try {
                    System.out.print("Nhập chức năng: ");
                    result = input.nextLine().trim();
                    check = checkChonChucNang(result, 0, 4);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } while (!check);
            result = result.trim();
            a = result.charAt(0);
//            a = function.NhapChucNangMenuChinh();
            switch (a) {
                case '1' -> {

                    System.out.println(residentialGroup);

                    System.out.print("Thêm thành viên vào gia đình ? : ");
                    int selectFamily = input.nextInt();
                    input.nextLine();  // Đọc dòng mới chứa Enter

                    System.out.print("Nhập tên: ");
                    String name = input.nextLine();

                    System.out.print("Nhập tuổi: ");
                    int age = input.nextInt();
                    input.nextLine();  // Đọc dòng mới chứa Enter

                    System.out.print("Nhập nghề nhiệp: ");
                    String job = input.nextLine();

                    System.out.print("Nhập số CMND: ");
                    String identityCardNumber = input.nextLine();
                    try {
                        residentialGroup.getFamily(selectFamily-1).addPerson(new Person(name, age, job, identityCardNumber));
                        System.out.println(residentialGroup.getFamily(selectFamily-1));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }

                }
                case '2' -> {
                    System.out.print("Bạn cần tạo một family mới, vui lòng nhập địa chỉ nhà: ");
                    String _address = input.nextLine();

                    Family<Person> family = new Family<>(_address);

                    System.out.println(family);
                    System.out.println("Bạn đã tạo một family mới thành công");
                    System.out.println("Tiếp theo, hãy nhập thông tin thành viên mới");

                    System.out.print("Nhập tên: ");
                    String name = input.nextLine();

                    System.out.print("Nhập tuổi: ");
                    int age = input.nextInt();
                    input.nextLine();  // Đọc dòng mới chứa Enter

                    System.out.print("Nhập nghề nhiệp: ");
                    String job = input.nextLine();

                    System.out.print("Nhập số CMND: ");
                    String identityCardNumber = input.nextLine();
                    try {
                        family.addPerson(new Person(name, age, job, identityCardNumber));
                        System.out.println(family);
                        residentialGroup.addFamily(family);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                }
                case '3' -> {
                    System.out.print("Vui lòng nhập địa chỉ nhà: ");
                    String _address = input.nextLine();

                    Family<Person> family = new Family<>(_address);

                    System.out.println(family);
                    residentialGroup.addFamily(family);
                    System.out.println("Bạn đã tạo một family mới thành công");
                }
                case '4' -> {
                    System.out.println(residentialGroup);
                }
                default -> {
                }
            }
        } while (a != '0');

    }
}
