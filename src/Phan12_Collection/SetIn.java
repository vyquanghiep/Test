package Phan12_Collection;

import java.util.*;
import java.util.stream.Collectors;

public class SetIn {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        Set<Integer> setInteger = new TreeSet<>();

        // thêm các phần tử vào listInteger
        listInteger.add(0);
        listInteger.add(3);
        listInteger.add(1);
        listInteger.add(4);
        listInteger.add(2);
        listInteger.add(8);

        // lọc các phần tử là số chẵn trong listInteger
        // và thêm vào trong setInteger
        setInteger = listInteger.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toSet());

        // hiển thị các phần tử trong setInteger
        System.out.println("Các phần tử trong setInteger: ");
        for (int numbers : setInteger) {
            System.out.println(numbers);
        }
    }
}
