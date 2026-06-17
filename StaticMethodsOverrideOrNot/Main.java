package StaticMethodsOverrideOrNot;

public class Main {
    public static void main(String[] args) {
        Box box1=new BoxWeight();
        box1.run();  // static methods cant be overriden in child class
        BoxWeight boxWeight=new BoxWeight();
        Box.run();
        BoxWeight.run();  // static methods are inherited in child class but cant be overrriden
        // eg write any static method in Parent class and do not write that in child class
        // now using Child Class Name access it ; it will run.
        //

    }
}
