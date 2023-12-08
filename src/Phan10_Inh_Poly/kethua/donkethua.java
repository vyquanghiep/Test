package Phan10_Inh_Poly.kethua;

    class Peole{
        void eat(){
            System.out.println("eating");
        }

    }
    class Student extends Peole{
        void study(){
            System.out.println("Studying");
        }
        public static void main(String[] args) {
            System.out.println("đơn kế thừa");
            Student st = new Student();
            st.study();
            st.eat();
        }
    }
