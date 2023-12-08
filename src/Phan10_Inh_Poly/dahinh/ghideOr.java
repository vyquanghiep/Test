package Phan10_Inh_Poly.dahinh;

class Phuongtien {

    public void hienThi() {
        System.out.println("Phương tiện chạy");
    }
}
class Xedap extends Phuongtien {

    @Override
    public void hienThi() {
        System.out.println("Xe đạp chạy rất an toàn");
    }

}
public class ghideOr {
    public static void main(String[] args) {

        // khai báo đối tượng của lớp Superclass
        Phuongtien pt = new Phuongtien();
        Xedap xd = new Xedap();

        // gọi phương thức hienThi() của lớp cha
        pt.hienThi();

        // gọi phương thức hienThi() của lớp con
        xd.hienThi();
    }
}
