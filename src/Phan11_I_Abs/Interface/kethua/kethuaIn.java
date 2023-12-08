package Phan11_I_Abs.Interface.kethua;

interface Inra{
    void inramanhinh();
}
interface Hienthi extends Inra{
    void hienthiramanhinh();
}
class kethuaIn implements Hienthi{

    public void inramanhinh() {
        System.out.println("Hello");
    }
    public void hienthiramanhinh() {
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        kethuaIn obj = new kethuaIn();
        obj.inramanhinh();
        obj.hienthiramanhinh();
    }
}
