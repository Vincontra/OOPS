package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class MAin {
    public static void main(String[] args) {
        Student vinay=new Student(37,95);
        Student mohak=new Student(35,94);
        Student avinash=new Student(8,99);
        Student manas=new Student(40,97);

//        if (vinay>mohak){
//            System.out.println("what to check java is confused as there are two fields");
//            // like what to compare
//            // so we use Comparable interface
//
//        }
//        if (vinay.compareTo(mohak)<0){
//            System.out.println("Mohak has more marks");
//        }
//        else if (vinay.compareTo(mohak)==0){
//            System.out.println("Equal marks");
//        }
//        else{
//            System.out.println("Vinay has more marks");
//        }


        Student arr[]={vinay,mohak,avinash,manas};
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);                           // sort depends upon the compareTo
       // System.out.println(Arrays.toString(arr));  // print depends upon the toString mehtod like what we want to print

        // now that compareTo is written there in Student class like we overide as we have to since it is abstract method in Comparable interface
        // we can write here also like
//        Arrays.sort(arr, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.marks-o2.marks;
//            }
//        });
//
        // this whole thing can be written as lambda expression kind of arrow in js
//        Arrays.sort(arr, (o1, o2) -> o1.marks-o2.marks);

        System.out.println(Arrays.toString(arr));







    }
}
