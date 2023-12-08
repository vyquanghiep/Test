package Phan12_Collection;


import java.util.LinkedList;
import java.util.List;
public class ListIn {
    public static void main(String[] args) {
        // khai báo List Interface có tên là listString
        // kiểu dữ liệu là String
        List<String> listString = new LinkedList<String>();

        // thêm các phần tử
        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        listString.add("Four");

        // duyệt theo kích thước của listString
        // và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        // sau đó hiển thị giá trị phần tử đó ra
        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }
    }
}
