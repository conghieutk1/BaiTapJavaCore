package BaiTap1.Interfaces;

import BaiTap1.CanBo;
import BaiTap1.QLCB;

public interface IFunction {
    public char NhapChucNangMenuChinh();
    public void ChucNang1(QLCB<CanBo> qlcb);
    public void ChucNang2(QLCB<CanBo> qlcb);
    public void ChucNang3(QLCB<CanBo> qlcb);

    public boolean checkChonChucNang(String input, int x, int y);
    public boolean checkChonKieuThem(String input, int x, int y);
    public boolean checkTenTimKiem(String name, int x, int y);

}
