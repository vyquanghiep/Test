package Phan11_I_Abs.Interface.vidu;

interface Loichao {
    void inloichao();
}

public class VD implements Loichao {
    public void inloichao() {
        System.out.println("Hello");
    }
    public static void main(String args[]){
        VD obj = new VD();
        obj.inloichao();
    }

}
