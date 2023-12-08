package Phan6_Character_String_Arr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Testmang {
    public static void main(String[] args) {

        //nhập mảng
        System.out.println(" " );
        System.out.println(" Nhập số phần tử của mảng " );
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int [] arrnhap= new int[n];
        System.out.print("Nhập các phần tử của mảng: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arrnhap[i] = sc.nextInt();
        }

        sortDESC(arrnhap);
        System.out.println("Dãy số được sắp xếp giảm dần: ");
        for (Integer arrnhaps : arrnhap){
            System.out.println(arrnhaps);
        }

        String[] car={"BMW","Honda","Ford","Mazda" };

        // car = new String[] { "Honda", "BMW", "Ford" };
        //
        System.out.println(car[0]);

        //thay the phan tu dau tien
        car[0]= "Vinfast";
        System.out.println("phan tu dau tien la: "+car[0]);

        // dem so phan tu
        System.out.println("Độ dai của mản car là: " +car.length);

        //Dyet cac phan tu cua mang for
        for (int i =0; i<car.length;i++){
            System.out.println(car[i]);
        }
        System.out.println(" " );

        //Dyet cac phan tu cua mang foreach
        for (String cars : car){
            System.out.println(cars);
        }

        // sap xep mang tang dan Sort()
        System.out.println(" " );
        Arrays.sort(car);
        System.out.println("Mảng sau khi được sắp xếp tăng dần " );
        for (String cars : car){
            System.out.println(cars);
        }


        /*cu phap public static void arraycopy(
        Object src, int srcPos,Object dest, int destPos, int length
        )  */
        System.out.println(" " );
        System.out.println("Copy mảng " );
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f',
                'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(new String(copyTo));

        //mảng hai va đa chiều
        System.out.println(" " );
        System.out.println("Mảng đa chiều " );
        int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };

        // in mảng 2 chiều r màn hình
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //cong 2 ma tran cung kieu
        System.out.println(" " );
        System.out.println("Cộng 2 mảng đa chiều " );
        int arr2[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
        int c[][] = new int[3][3];
        System.out.println("ket qua la " );
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }



    }

    public static void sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

