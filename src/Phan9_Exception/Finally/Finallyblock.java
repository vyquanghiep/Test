package Phan9_Exception.Finally;

public class Finallyblock {
    public static void main(String args[]) {
        try{
            int a[]=new int[10];
            //Array has only 10 elements
            a[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Phần tử ko nằm trong mảng");
        }
        /* Finally block sẽ luôn được thực thi
         * dù có exception hay không
         */
        finally{
            System.out.println("Đây là finally block");
        }
        System.out.println("Ra khỏi try-catch-finally");
    }
}
