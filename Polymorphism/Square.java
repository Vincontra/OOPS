package Polymorphism;
public class Square extends Shapes{
//    @Override  // it is to check whether this method is overriden here or not so if no erro below this annotation that means yes
    // we are overiding this and yes that is true as we have same method in Shapes which is parent

    void area(){
        System.out.println("side*side");
    }
    void wow(){
        System.out.println("This is amazing but i m in child");
    }
}
