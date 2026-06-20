package Generics.Comparing;

import Generics.GenericInterface;

public class Student implements Comparable<Student>{
    int roll;
    int marks;
    public Student(int roll,int marks){
        this.marks=marks;
        this.roll=roll;
    }
    @Override
    public int compareTo(Student o){
        //return this.marks-o.marks; // ascending
        // ==0 means same marks
        // <0 means o is bigger else smaller

        return -(this.marks-o.marks);  // decending

    }
    @Override
    public String toString(){
        return marks+" ";
    }
}
