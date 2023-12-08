package Phan1den4.Phan4.PVHD;

public class Person {
    public String name;
    public int age; // trong class
    float height; // trong parkit

    protected String name2;
    protected int age2;
    protected float height2;

    public Person(String name, int age, float height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    //truy cập trong ngoài parkit nhưng phải qua tính kế thừa// pthuc chỉ c thể bên trong class
   protected void eat(String foodName) {
        System.out.println(name + " is eating "+ foodName);
    }

    public int getAge() {
        return age;
    }
}
