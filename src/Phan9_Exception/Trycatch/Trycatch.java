package Phan9_Exception.Trycatch;

public class Trycatch {

        public static void main(String args[]) {
            int so1, so2;
            try {

                so1 = 0;
                so2 = 62 / so1;
                System.out.println(so2);
                System.out.println("Kết thúc try block.");
            }
            catch (ArithmeticException e) {
                /* Catch block này sẽ chỉ thực hiện nếu có ngoại lệ số học
                 * xảy ra trong try block
                 */
                System.out.println(" Lỗi: Số bị chia không thể là số 0");
            }
            catch (Exception e) {

                System.out.println("Lỗi: một ngoại lệ đã xảy ra");
            }
            System.out.println("Ra khỏi try catch block.");
        }

}
