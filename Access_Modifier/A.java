package Access_Modifier;

import StaticMethodsOverrideOrNot.Box;
import StaticMethodsOverrideOrNot.BoxWeight;

public class A extends Box {
    private int num;

    protected int Protected;

    // private are only accessible anywhere in that file only
    // this is known as data hiding
    // but if we want to use them outside this class
    // then we use getters to get the value
    // setters to set the value
    // these are methods which we kept public
    // so these methods are also in this class only
    // so they can use private stuff of this class
    // and since these methods are public we can access them
    // through object of this class out side this class
    // via these methods we access indirectly these private stuff
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }
    public String name; // public can be access anywhere
    int arr[];

    int age;
    public A(int num,String name){
        this.Protected=50;
        this.arr=new int[num];
        this.num=num;
        this.name=name;
        this.age=num;
    }

    public static void main(String[] args) {
//        A box=new A(22,"abcd");
//        int num=box.Num;
//        System.out.println(num);




    }
}
