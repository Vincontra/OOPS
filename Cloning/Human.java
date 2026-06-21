package Cloning;

public class Human implements Cloneable {

    // Cloneable has no method still we have to implements it by
    // whose clone we want to create to tell jvm that
    // we are cloning object of that class

    int age;
    String name;

    int arr[];
    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
        arr=new int[age];
    }

    public Human(int age,String name){
        this.age=age;
        this.name=name;
        arr=new int[age];
    }
//    public Object clone() throws CloneNotSupportedException{
//        // if any method may throw any exception then we have to specified that
//        // just after the method name with throws
//
//        // this Shallow Copy
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
        // this is how we can do Deep Copy

        Human twin=(Human) super.clone(); // this is shallow by the way
        int len=twin.arr.length;
        twin.arr=new int[len];
        for (int i=0;i<len;i++){
            twin.arr[i]=this.arr[i];
        }
        twin.age= this.age;
        twin.name=this.name;
        return twin;

        // basically we tried to change the reference variable for
        // every one in that object whose clone we want to make
    }
}
