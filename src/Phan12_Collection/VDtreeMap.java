package Phan12_Collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class VDtreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();


        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');

        // tạo 1 Set có tên là setTreeMap

        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        // các entry trong setTreeMap sẽ được sắp xếp tăng dần theo khóa
        System.out.println("Các entry có trong setTreeMap:");
        System.out.println(setTreeMap);

        //lay key
        System.out.println("\n Key của các entry trong treeMap: ");
        for (int key : treeMap.keySet()) {
            System.out.println("Key = " + key);
        }

        //lay value
        System.out.println("\n Values của các entry trong treeMap: ");
        for (int value : treeMap.values()) {
            System.out.println("value = " + value);
        }

        //lay value khi biết key
        System.out.println("3: " + treeMap.get(3));

        // xoa
        treeMap.remove(3);

        System.out.println("Các entry trong treeMap sau khi xóa: ");
        treeMap.forEach((keyInt, valueInt) -> System.out.println(
                "Key = " + keyInt + ", value = " + valueInt));
    }
}
