package Phan10_Inh_Poly.dahinh;

class Cong1{
    static int phepcong1(int a, int b){return a+b;}
    static int phepcong1(int a, int b, int c){return a+b+c;}
}

public class napchongts {
    public static void main(String[] args){
        System.out.println(Cong1.phepcong1(7,9));
        System.out.println(Cong1.phepcong1(7,8,9));
    }
}
