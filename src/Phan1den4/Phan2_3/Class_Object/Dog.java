package Phan1den4.Phan2_3.Class_Object;

public class Dog {

    // Tạo các biến
    String breed;
    String size;
    int age;
    String color;


    public String getInfo() {
        return ("Breed is: "+breed+" Size is: "+size+" Age is: "+age+" Color is: "+color);
    }


    public static void main(String[] args) {


        Dog maltese = new Dog();


        maltese.breed = "Maltese";
        maltese.size = "Small";
        maltese.age = 2;
        maltese.color = "white";


        System.out.println(maltese.getInfo());
    }
}