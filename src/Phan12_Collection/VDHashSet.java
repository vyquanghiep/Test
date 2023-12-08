package Phan12_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class VDHashSet {

        public static void main(String[] args) {
            // khai báo 1 HashSet có tên là hashSet
            // có kiểu là String
            HashSet<String> hashSet1 = new HashSet<>();

            // thêm các phần tử vào hashSet sử dụng phương thức add()
            hashSet1.add("JAVA");
            hashSet1.add("JSP");
            hashSet1.add("STRUTS");
            hashSet1.add("HIBERNATE");
            hashSet1.add("JSP");
            hashSet1.add("JAVA");

            // hiển thị các phần tử có trong hashSet
            // trong hashSet có 2 phần tử là "JAVA"
            // mà các phần tử trong 1 HashSet là không trùng nhau
            // nên sẽ chỉ có 1 phần tử "JAVA" được hiển thị.
            System.out.println("Các phần tử có trong hashSet là: ");
            for (String str : hashSet1) {
                System.out.print(str + "\t");
            }

            // thêm
            hashSet1.add("C#");
            hashSet1.add("JAVA");
            hashSet1.add("PHP");
            hashSet1.add("JS");

            //xoá, xoá hêt .clear()
            hashSet1.remove("JAVA");

            Iterator<String> iterator = hashSet1.iterator();
            System.out.println("\nCác phần tử có trong hashSet là: ");
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + "\t");
            }

            // chuyen doi hs -> arr
            String[] array = new String[hashSet1.size()];

            // chuyển hashSetString thành mảng sử dụng toArray()
            hashSet1.toArray(array);

            System.out.println("\n Các phần tử của array: ");
            for(String temp : array){
                System.out.println(temp);
            }


        }
}
