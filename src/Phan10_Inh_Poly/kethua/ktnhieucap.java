package Phan10_Inh_Poly.kethua;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
    public static void main(String[] args) {
        System.out.println("kế thừa nhiều cấp");
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}

