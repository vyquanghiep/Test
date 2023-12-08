package Phan12_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class VDLinkList {
    public static void main(String[] args) {

        // khai báo 1 danh sách liên kết đơn có tên là linkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // thêm các phần tử sử dụng phương thức add()
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(3);
        linkedList.add(9);

        //duyệt
        System.out.println("Các phần tử có trong linkedList là: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + "\t");
        }

        // thêm
        linkedList.add(6);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(20);

        // thêm vào vị trí 3
        linkedList.add(3, 56);

        // thêm vào đầu cuối ds
        linkedList.addFirst(4);
        linkedList.addLast(6);

        System.out.println("\n Các phần tử có trong linkedList sau khi thêm là: ");
        for (int node : linkedList) {
            System.out.print(node + "\t");
        }

        // khai báo 1 danh sách liên kết đơn có tên là linkedList2
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(90);

        //AddAll khi 2 list cùng kiểu dữ liệu
        linkedList.addAll(linkedList2);

        System.out.println("\n Các phần tử có trong linkedList là: ");
        for (int node : linkedList) {
            System.out.print(node + "\t");
        }

        //truy cập
        int x = linkedList.getFirst();
        int y = linkedList.getLast();
        int z = linkedList.get(4);

        System.out.println("\n Phần tử đầu tiên trong danh sách là " + x +
                "\n phần tử cuối cùng trong danh sách là " + y + "\n Phần tử có trị số 4 trong dánh sách là "+ z);

        // cập nhật
        linkedList.set(4, 200);

        // remove
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(4);

        Iterator<Integer> iterator = linkedList.iterator();
        System.out.println("Các phần tử có trong linkedList là: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }


    }
}
