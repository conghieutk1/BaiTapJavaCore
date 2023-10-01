package BaiTap1;

public class CongNhan extends CanBo{
    private int capBac;

    public CongNhan(String name, int age, String gender, String address, int capBac) {
        super(name, age, gender, address);
        this.capBac = capBac;
    }

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }
}
