package BaiTap1;
import java.util.*;

import BaiTap1.Interfaces.IFunction;
import BaiTap1.Interfaces.IGiaoDien;


public class Main {

    public static void main(String[] args) {
        QLCB<CanBo> qlcb = new QLCB<>();
        IFunction function = new Function();
        char a;
        do {
            a = function.NhapChucNangMenuChinh();
            switch (a) {
                case '1' -> {
                    function.ChucNang1(qlcb);
                }
                case '2' -> {
                    function.ChucNang2(qlcb);
                }
                case '3' -> {
                    function.ChucNang3(qlcb);
                }
                default -> {
                }
            }
        } while (a != '0');

    }
}
