package Phan5_Loop_kdl;

import java.util.Scanner;

public class Vonglap {
    public static void main(String[] args) {

        //vong lap while
        System.out.println(" ");
        System.out.println("vong lap while ");
        int number,sum =0;
        Scanner x = new Scanner(System.in);

        //tong cac so nguyen vua nhap be hon 100
        while (sum<100){
            System.out.println("nhap so nguyen bat ky: ");
            number = x.nextInt();
            sum = sum+number;
        }
        System.out.println("tổng các số nguyên vừa nhập là: "+sum);

        //vong lap do while tong cac so be hon 100
        System.out.println(" ");
        System.out.println("vong lap while ");
        int number2, sum2 =0;
        do{
            System.out.println("nhap so nguyen bat ki: ");
            number2 = x.nextInt();
            sum2 += number2;
        }while (sum2<100);
        System.out.println("tổng các số nguyên vùa nhập là:" +sum2);

        // vòng lạp for
        System.out.println(" ");
        System.out.println("vong lap for ");
        for (int i=1; i<5; i++){
            System.out.println(i);
        }

        // break va continue
        System.out.println(" ");
        System.out.println(" từ khoá break ");
        // neu i= 5 thì dừng
        System.out.println(" vidu1 break trong vong lap for");
        for (int i1=1; i1<=10;i1++){
            if(i1==5){break;}
            System.out.println(i1);
        }
        System.out.println(" vidu2 break trong vong lap for khac");
        for (int i2=1;i2<=3;i2++){
            for(int j2=0;j2<=3;j2++){
                if(i2 ==2){
                    break;
                }
                System.out.println(i2+" "+j2);
            }
        }
        System.out.println(" ");
        System.out.println(" từ khoá continue ");

        for (int i4 = 1; i4 <= 10; i4++) {
            if (i4 == 5) {
                continue;
            }
            // Khi i4 == 5 thì không in i4 = 5 ra màn hình
            System.out.println(i4);
        }

        System.out.println(" ");
        System.out.println(" mệnh đề switch - case ");

        // đúng đk thì in ra man hinh
        System.out.println(" nhập một số bằng 10, 20, 30 hoặc 1 số bất kỳ ");
        int number3 = x.nextInt();
        switch (number3) {
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
            case 30:
                System.out.println(30);
                break;
            default:
                System.out.println("Not in 10,20 or 30");
        }



    }
}
