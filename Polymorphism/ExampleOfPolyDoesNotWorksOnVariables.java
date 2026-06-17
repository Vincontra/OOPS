package Polymorphism;


class Parent {
    int x = 10;

    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    int x = 20;

    @Override
    void show() {
        System.out.println("Child show");
    }
}
public class ExampleOfPolyDoesNotWorksOnVariables {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x);
        p.show();
    }
}

//Polymorphism in Java primarily works with methods, not with variables
//Variables  are resolved using the reference type, not the object type.
//        p.x → uses the reference type (Parent) → 10
//        p.show() → uses the actual object type (Child) → Child show
//
//        No, runtime polymorphism does not work on variables (fields) in Java.
//        Methods → dynamically bound (runtime polymorphism).
//        Variables/fields → statically bound (compile-time resolution based on the reference type).
//        A common interview statement is:
//        "Methods are overridden; fields are hidden."