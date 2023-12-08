package Phan10_Inh_Poly.kethua;

class Animal1 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog1 extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat1 extends Animal {
    void meow() {

        System.out.println("meowing...");
    }
    public static void main(String[] args) {
        System.out.println("kế thừa thứ bậc");
        Cat1 c = new Cat1();
        c.meow();
        c.eat();
    }
}

