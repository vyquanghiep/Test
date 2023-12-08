package Phan1den4.Phan4.PVHD;

import Phan1den4.Phan4.PVHD.Person;
public class Test2 extends Person{

    protected Test2(String name2, int age2, float height2){
        super(name2, age2,height2);

    }
    public static void main(String[] args) {
        Test2 a = new Test2("Chau", 21, 1.7f);
        a.eat("Rice");
    }

}
