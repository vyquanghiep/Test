package Phan1den4.Phan2_3.Bien;

public class HocVien {
    public String ten;
    // biến instance "tuoi" kiểu Integer, có giá trị mặc định là 0
    private int tuoi;
    // sử dụng biến ten trong một constructor
    public HocVien(String ten) {
        this.ten = ten;
    }
    // sử dụng biến tuoi trong phương thức setTuoi
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void showStudent() {
        System.out.println("Ten  : " + ten);
        System.out.println("Tuoi : " + tuoi);
    }
    public static void main(String args[]) {
        HocVien sv = new HocVien("Quang hiep");
        sv.setTuoi(21);
        sv.showStudent();
    }
}
