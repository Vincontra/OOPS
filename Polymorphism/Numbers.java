package Polymorphism;

public class Numbers {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        System.out.println(obj.add(2,2,2));
        System.out.println(obj.add(2,1));
        // this is method overloading/static/compile time poly
        // what if the parameter is of type int and we pass argument as float
        // so type casting works in java refer to Kunal Video on type casting
    }
}
