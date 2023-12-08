package Phan12_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VDHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo HashMap
        Map<Integer, String> hashMap = new HashMap<>();


        // sử dụng phương thức put()
        hashMap.put(1, "One");
        hashMap.put(0, "Zero");
        hashMap.put(2, "Two");
        hashMap.put(4, "Four");
        hashMap.put(21, "Twenty first");
        hashMap.put(5, "Five");

        //Lấy giá trị
        Set<Map.Entry<Integer, String>> setNumber = hashMap.entrySet();
        System.out.println("Các entry có trong HashMap:");
        System.out.println(setNumber);

        hashMap.forEach((keyChar, valueInt) -> System.out.println(
                "Key = " + keyChar + ", value = " + valueInt ));

        //lấy key
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key = " + key);
        }

        //lấy value
        for (String value : hashMap.values()) {
            System.out.println("Key = " + value);
        }

        //thêm dữ liệu
        hashMap.put(10,"ten");
        System.out.println("\nCác entry có trong hashMap:");
        System.out.println(setNumber);

        // láy dữ liệu khi biết khoá
        System.out.println("1: " + hashMap.get(1));

        // remove
        hashMap.remove(2);
        System.out.println("Các phần tử có trong hashMap sau khi xóa: ");
        System.out.println(hashMap);

    }
}
