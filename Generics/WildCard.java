package Generics;

import Polymorphism.Numbers;

import java.util.Arrays;
import java.util.List;

public class WildCard <T extends Number>{
    private Object[]data;
    private static int DEFAULT_SIZE=10;
    private int size=0; // acts as index value;
    public WildCard(){
        this.data=new Object[DEFAULT_SIZE];
        // At compile time T may any generic but since it does not as
        // of now what kind of object we are creating as it will be done
        // during run time so it will give error
        // but if we use type as Object type like parent for all
        // it works
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }
    boolean isFull(){
        return this.size==data.length;
    }
    void resize(){
        Object temp[]=new Object[data.length*2];
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        size=size-1;
        T val=(T)data[size];  // T is small and we are passing Object so it should be typecast
        // always larger to smaller typecast required
        return val;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T val){
        this.data[index]=val;
        // here no need for type cast as
        // smaller(T) to larger(data array of type Object)
        //
    }
    public void getList(List<? extends Number> list){
        // what ever stuff

    }
    @Override
    public String toString() {
        return Arrays.toString(data)+" And the Size is: "+size+" And the actual size ="+data.length;
    }
    public static void main(String[] args) {
        WildCard<Integer>l1=new WildCard<>();
        l1.add(2);
        System.out.println(l1);
        // wildcard means we can have all classes which are subclasses
        // to that class and also that class as well
        // that is it
        // like Integer class extends Number so
        // as Generic we can have All classes who extends Number
        // and That class Number as well
        // this is kind of easier way to write more such classes

        // eg is written method name is getList


    }

}
