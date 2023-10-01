package BaiTap13;

public class Main {
    public static void main(String[] args) {
        Intern intern1 = new Intern(12, "Hiếu Đặng", "12/09/2002", "0123322321", "hieu@gmail.com", EmployeeType.INTERN, "IT", "20231", "HUST");
        Intern intern2 = new Intern(12, "Hiếu Đặng", "12/09/2002", "0123322321", "hieu@gmail.com", EmployeeType.INTERN, "IT", "20231", "HUST");
        Fresher fresher = new Fresher(12, "Hiếu Đặng", "12/09/2002", "0123322321", "hieu@gmail.com", EmployeeType.FRESHER, "15/8/2023", "Giỏi", "HUST");
        Experience experience = new Experience(12, "Hiếu Đặng", "12/09/2002", "0123322321", "hieu@gmail.com", EmployeeType.INTERN, 5, "Lập trình Web");

        System.out.println(intern1.ShowInfo());
        System.out.println(intern2.ShowInfo());
        System.out.println(intern2.ShowMe());
        System.out.println("a");
        System.out.println(fresher.ShowInfo());
        System.out.println(fresher.ShowMe());

        System.out.println(experience.ShowInfo());
        System.out.println(experience.ShowMe());



    }
}
