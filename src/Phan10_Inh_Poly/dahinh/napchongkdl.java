package Phan10_Inh_Poly.dahinh;
class Cong{
    static double phepcong(double a, double b){return a+b;}
    static int phepcong(int a, int b){return a+b;}
}
public class napchongkdl {
    public static void main(String[] args){
        System.out.println(Cong.phepcong(7,9));
        System.out.println(Cong.phepcong(7.0,8.0));
    }
}
