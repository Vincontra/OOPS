package Abstract;

public abstract class Parent  {

    int age;
    public Parent(int age){
        this.age=age;
    }
    abstract void carrer(String name);

    abstract void partner(String name,int age);

    void func(){
        System.out.println("fdfd");
    }
    static void helloWorld(){
        System.out.println("Static Method in Abstract Class");
    }
}
