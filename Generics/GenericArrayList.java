package Generics;
import java.util.Arrays;
public class GenericArrayList<T> {
    private Object[]data;
    private static int DEFAULT_SIZE=10;
    private int size=0; // acts as index value;
    public GenericArrayList(){
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
    @Override
    public String toString() {
        return Arrays.toString(data)+" And the Size is: "+size+" And the actual size ="+data.length;
    }

    public static void main(String[] args) {
        GenericArrayList<Integer>l1=new GenericArrayList<>();
        l1.add(55);
        System.out.println(l1);
    }
}
