package Phan1den4.Phan4;

public class Toantu {
    public static void main(String[] args) {
        System.out.println("toán tử số học \n");
        // cộng
        int a = 100, b = 50;
        System.out.println(a+b);

        // trừ
        System.out.println(a-b);
        //nhân
        System.out.println(a*b);
        //chia
        System.out.println(a/b);
        //chialay du
        int c = 15, d = 4;
        System.out.println(d/c);
        //tang
        c++;
        //giam
        d--;
        System.out.println(c);
        System.out.println(d);

        // Toán tử bit
        System.out.println("toán tử bit \n");

        int a1 = 60;	/* 60 = 0011 1100 */
        int b1 = 13;	/* 13 = 0000 1101 */
        int c1 = 0;

        c1 = a1 & b1;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c1 );

        c1 = a1 | b1;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c1 );

        c1 = a1 ^ b1;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c1 );

        c1 = ~a1;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c1 );

        c1 = a1 << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c1 );

        c1 = a1 >> 2;     /* 215 = 1111 */
        System.out.println("a >> 2  = " + c1 );

        c1 = a1 >>> 2;     /* 215 = 0000 1111 */
        System.out.println("a >>> 2 = " + c1 );




    }
}
