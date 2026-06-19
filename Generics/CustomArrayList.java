package Generics;
import java.util.*;
public class CustomArrayList {
    private int [] data;
    private static int DEFAULT_SIZE=10;
    private int size=0; // acts as index value;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }
    boolean isFull(){
        return this.size==data.length;
    }
    void resize(){
        int temp[]=new int[data.length*2];
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        size=size-1;
        int val=data[size];
        return val;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int val){
        this.data[index]=val;
    }
    @Override
    public String toString() {
        return Arrays.toString(data)+" And the Size is: "+size+" And the actual size ="+data.length;
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        System.out.println(list.size());
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        //System.out.println(list.size());
       // System.out.println(list);
        list.remove();
        System.out.println(list);
        list.set(0,25);
        System.out.println(list);

    }


}
