package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes shape=new Shapes();
//        Square square=new Square();
//        Circles circles=new Circles();
//        Triangle triangle=new Triangle();

        Shapes obj=new Square();
        Square o=new Square();
        // Child ka object and since both Shapes and Square has same methods child ki methods get high priority hence method overriding
//           obj.area();
//           obj.wow();

           // in short in Method Overiding same exact method just different classses and if inheritance
        // whatever type of object is created then uski hi method run hogi no matter what
        // it does not matter ki reference variable konse type ka haii

        o.area();


    }
}
