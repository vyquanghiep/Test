package Phan9_Exception.Throw;

public class Ktradatchuan {
        // ktra xem có đủ 18 và 40 kg không
        static void validate(int tuoi, int cannang) {

                if (tuoi < 18 || cannang < 40)
                    throw new ArithmeticException("Không đạt yêu câ");
                else
                    System.out.println("Đạt yêu cầu tham gia");

        }

        public static void main(String args[]) {
            validate(13, 35);
            System.out.println("rest of the code...");
        }

}
