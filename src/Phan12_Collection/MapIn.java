package Phan12_Collection;

import java.util.*;

public class MapIn {
    public static void main(String[] args) {

        // Khai báo HashMap
        // Khai báo HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        // Thêm value vào trong hashMap với key tương ứng
        // sử dụng phương thức put()
        // đối số thứ nhất trong put là key có kiểu là Integer
        // và đối số thứ hai là value có kiểu là String
        hashMap.put(1, "One");
        hashMap.put(0, "Zero");
        hashMap.put(2, "Two");
        hashMap.put(4, "Four");
        hashMap.put(21, "Twenty first");
        hashMap.put(5, "Five");

        // khai báo Map Interface tên linkedHashMap
        // và sử dụng Class là LinkedHashMap để triển khai
        // LinkedHashMap là 1 Class Collection
        // mỗi phần tử trong linkedHashMap bao gồm 2 phần
        // key (Integer) và value (String)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Thêm value vào trong linkedHashMap với key tương ứng
        linkedHashMap.put(1, "One");
        linkedHashMap.put(0, "Zero");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(21, "Twenty first");

        // khai báo Map Interface tên treeMap


        Map<Integer, String> treeMap = new TreeMap<>();

        // Thêm value vào trong treeMap với key tương ứng
        treeMap.put(1, "One");
        treeMap.put(0, "Zero");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(21, "Twenty first");
        treeMap.put(5, "Five");

        System.out.println("Các phần tử có trong hashMap: ");
        System.out.println(hashMap);
        System.out.println("Các phần tử có trong linkedHashMap: ");
        System.out.println(linkedHashMap);
        System.out.println("Các phần tử có trong treeMap: ");
        System.out.println(treeMap);



    }

}
