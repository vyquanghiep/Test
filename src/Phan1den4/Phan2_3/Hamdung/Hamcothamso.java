package Phan1den4.Phan2_3.Hamdung;

public class Hamcothamso {
    // Thuộc tính
    int id;
    String name;

    // Constructor có tham số
    Hamcothamso(int i, String n) {
        id = i;
        name = n;
    }

    // Phương thức
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String args[]) {
        // Tạo đối tượng
        Hamcothamso s1 = new Hamcothamso(121, "NIIT");
        Hamcothamso s2 = new Hamcothamso(232, "ICT Hà Nội");

        // Gọi phương thức
        s1.display();
        s2.display();
    }
}
