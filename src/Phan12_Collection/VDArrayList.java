package Phan12_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class VDArrayList {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là arrListInteger
        // có kiểu là Integer
        ArrayList<Integer> arrListInteger = new ArrayList<>();

        // thêm các phần tử sử dụng phương thức add()
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);
        arrListInteger.add(1);

        // sử dụng vòng lặp for duyệt theo đối tượng
        System.out.println("Các phần tử có trong arrListInteger là: ");
        for (int number : arrListInteger) {
            System.out.print(number + "\t");
        }

        // khai báo một Iterator có kiểu là Interger
        System.out.println("\nIterator ");
        Iterator<Integer> iterator = arrListInteger.iterator();

        System.out.println("Các phần tử có trong arrListInteger là: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }

        // tương tác với ArrList
        //Đếm số phần tử .size()
        System.out.print("\nSố phần tử của arrListInteger ban đầu = " + arrListInteger.size());

        // thêm phần tử
        arrListInteger.add(3, 10);

        //truy cập đến phan tu
        int ch = arrListInteger.get(2);
        System.out.print("\nPhần tử có chỉ số 2 trong arrListInteger là " + ch);

        //Cập nhật gia tri
        arrListInteger.set(3, 204);
        System.out.println("\nCác phần tử của arrListInteger sau khi cập nhật: ");
        System.out.println(arrListInteger);

        // tạo bản sao
        ArrayList<Integer> arrListIntegerCopy = (ArrayList<Integer>) arrListInteger.clone();

        // xoá giá trị
        arrListIntegerCopy.remove(1);
        System.out.println("Các phần tử của arrListIntegerCopy sau khi xóa phần tử : ");
        System.out.println(arrListIntegerCopy);

        //tìm kiếm
        boolean resultCheck = arrListInteger.contains(2);
        if (resultCheck == true) {
            System.out.println("Có phần tử 2 trong arrListInteger.");
        } else {
            System.out.println("Không tìm thấy phần tử 2.");
        }

        //tìm kiếm vị trí xuất hiện đầu tiên
        int position1 = arrListInteger.indexOf(1);
        System.out.println("Vị trí xuất hiện đầu tiên của phần tử 1 trong ArrayList là "
                + position1);

        //tìm kiếm vị trí xuất hiện cuối cùng
        int position2 = arrListInteger.lastIndexOf(1);
        System.out.println("Vị trí xuất hiện đầu tiên của phần tử 1 trong ArrayList là "
                + position2);

        // chuyen arr list sang arr mảng
        Object[] arr = arrListInteger.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử tại vị trí " + i + " trong arr là " + arr[i]);
        }

    }
}
