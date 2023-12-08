package Phan1den4.Phan2_3.Kieudulieu;

public class VDcackieudl {
    public static void main(String[] args) {

        //byte
        byte a = 30;
        byte b = 40;
        byte c = (byte) (a + b);
        System.out.println("\n Kieu byte = " + c);
        System.out.println("Ket qua = " + c);

        //char
        char ch = 'a';
        System.out.println(" \n Ki tu = " + ch);

        //boolean Đây là kiểu dữ liệu có bộ nhớ lưu trữ nhỏ nhất
        boolean troiMua = true;
        System.out.println("Kieu boolean = " + c);
        if (troiMua) {
            System.out.println("Trời đang mưa");
        }
        else
        {
            System.out.println("Trời không mưa");
        }

        //short
        short t = 50, z = -50;
        System.out.println("\n kiểu short" +t + z);
        //int

        int so1 = 100, so2 = 50;
        System.out.println("\n kiểu int" +so1 +so2);

        //long
        long l1 = 100000L, l2 = -100000L;
        System.out.println("\n kiểu long" +l1 +l2);

        //float
        float jpy = 22.2f;
        System.out.println("\n kiểu float" +  jpy);

        //double so thực >float
        double ct = 676.7;
        System.out.println("\n kiểu float" +  ct);

        // ép kiểu
        float c1 = 35.8f;
        int b1 = (int)c1 + 1;
        System.out.println("Ép kiểu"+b1);

    }
}
