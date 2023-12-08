package Phan11_I_Abs.Interface.dakethua;

interface ILoichao {
    void inloichao();
}

interface ILoitambiet{
    void inloitambiet();
}

class dakethua implements ILoichao,ILoitambiet {

    public void inloichao() {
        System.out.println("Hello");
    }
    public void inloitambiet() {
        System.out.println("Good bye");
    }

    public static void main(String args[]){
        dakethua obj = new dakethua();
        obj.inloichao();
        obj.inloitambiet();
    }
}
