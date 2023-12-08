package Phan12_Collection;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class VDtreeSet {
    public static void main(String[] args) {

    TreeSet<Integer> treeSetInteger = new TreeSet<>();
    Scanner scanner = new Scanner(System.in);

    treeSetInteger.add(5);
    treeSetInteger.add(9);
    treeSetInteger.add(4);
    treeSetInteger.add(2);


    System.out.println("Các phần tử của treeSetInteger là: ");
    for (int number : treeSetInteger) {
        System.out.print(number + "\t");

    }

        System.out.println("\nNhập phần tử cần thêm: ");
        int number = scanner.nextInt();

        if (!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong treeSetInteger sau khi thêm: ");
            System.out.println(treeSetInteger);
        } else {
            System.out.println("Phần tử " + number + " đã tồn tại!");
        }
        //addall()

        TreeSet<Integer> treeSetInteger2 = new TreeSet<>();

        treeSetInteger2.add(10);
        treeSetInteger2.add(15);
        treeSetInteger2.add(20);

        treeSetInteger2.addAll(treeSetInteger);
        System.out.println("Các phần tử của treeSetInteger2 là: ");
        for (int number2 : treeSetInteger2) {
            System.out.print(number2 + "\t");

        }
        treeSetInteger2.remove(20);

        System.out.println("\nCác phần tử của treeSetInteger2 sau xoa là: ");
        for (int number2 : treeSetInteger2) {
            System.out.print(number2 + "\t");

        }

        // trích xuất 1 phần giá trị từ 3-7 kqua 4 5
        // ngoài ra còn tallset

        SortedSet<Integer> subset = treeSetInteger2.subSet(3, 7);
        System.out.println("\n Các phần tử có trong subset: ");
        System.out.println(subset);

        //string tương tư
        Integer phanTuLonNhat = treeSetInteger2.last();
        Integer phanTuNhoNhat = treeSetInteger2.first();

        System.out.println("\n Phần tử lớn nhất và nhỏ nhất trong"
                + " treeSetInt là " + phanTuLonNhat + " và " + phanTuNhoNhat);


    }
}