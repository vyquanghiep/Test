package Phan6_Character_String_Arr;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {

        //nhap chuoi xem trong chuoi co ky tu gi charAt
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi ");
        chuoi = sc.nextLine();
        System.out.println("cac ky tu co trong chuoi");
        //char kyTu = chuoi.charAt(i); để trả về ký tự tại vị trí i trong chuỗi
        for (int i=0; i<chuoi.length();i++){
            kytu=chuoi.charAt(i);
            System.out.println(kytu);
        }

        // phương thức toUpperCase và toLowerCase
        System.out.println(" ");
        System.out.println("toUpperCase và toLowerCase ");
        System.out.println(" ");
        System.out.println("chuoi khi dang chu hoa ");
        System.out.println(chuoi.toUpperCase());
        System.out.println(" ");
        System.out.println("chuoi khi dang chu thuong ");
        System.out.println(chuoi.toLowerCase());

        // nối chuỗi
        System.out.println(" ");
        String string2 = "world";
        System.out.println("chuoi ky tu sau khi noi: ");
        System.out.println(chuoi.concat(string2));

        // phương thức trim xoá khoảng trắng ở đầu và cuối của chuỗi
        System.out.println(" ");
        System.out.println("Phương thức Trim ");
        String s = "    java    ";
        System.out.println(s);
        System.out.println(s.trim());

        System.out.println(" ");
        String loinoi ="Toi se lam duoc";
        System.out.println(loinoi);
        //đếm số ký tự length
        System.out.println(" ");
        System.out.println("Phương thức length ");
        int len = loinoi.length();
        System.out.println("String length is: " +len);

        // phương thức contains tìm kiêm chuoi ky tu
        System.out.println(" ");
        System.out.println("Phương thức contains ");
        System.out.println(loinoi.startsWith("He"));

        // phương thức startsWith() và endsWith()
        System.out.println(" ");
        System.out.println("Phương thức startsWith và endsWith");
        System.out.println(loinoi.startsWith("He"));
        System.out.println(loinoi.endsWith("c"));

        // phuong thuc replace, thay the chuoi khac
        System.out.println(" ");
        System.out.println("Phương thức replace");
        String replaceloinoi = loinoi.replace("Toi","Ban");
        System.out.println("chuoi thay the");
        System.out.println(replaceloinoi);

        // Phương thức equals so sanh 2 chuoi
        System.out.println(" ");
        System.out.println("Phương thức equals");
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = "python";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        // phương thức indexOf trả về giá trị chuỗi con hoặc hoạc ký tự đã cho
        System.out.println(" ");
        System.out.println("Phương thức indexOf");
        String s5 = "this is index of example";

        //xác định vị trí đầu tiên

        System.out.println(s5.indexOf("is"));


        //Tìm kiếm vị tri xuat hien dau tien bat dau tu vt 5
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("e", 5));

        // value of cuyển đổi dữ liệu thành chuỗi
        int value = 30;
        String cd = String.valueOf(value);
        System.out.println(cd + 10);


        //
    }
}
