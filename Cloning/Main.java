package Cloning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Human vinay=new Human(22,"Vinay");
//        Human twin=new Human(vinay);
//        System.out.println(twin.age);
        // So basically when we want the exact copy of the object we can
        // do like this but the thing is even though it is copy this takes
        // more time on runtime like new is again used to it is overhead
        // what we can do is we can use clone method from interface Clonable
        // that method must be implemented by the class whose clone we want to make

        //Human twin=(Human)vinay.clone();

        // ex for Shallow Copy
        // Primitive value copied not referenced
        //Non Primitives (objects) refer to the original
//        // so any change there or anywhere everyone get change
//        System.out.println(twin.name);
//        vinay.age=55;
//        vinay.name="BS";
//        System.out.println(twin.age);
//        System.out.println(twin.name);
//
//        System.out.println(vinay.name);
//        twin.name="Bhakti";
//        System.out.println(vinay.name);


        //Deep copy
//
//        Human vinay=new Human(22,"Vinay");
////        System.out.println(vinay.name);
////        System.out.println(vinay.age);
////        System.out.println(Arrays.toString(vinay.arr));
//
//        Human twin=(Human)vinay.clone();
//
//        System.out.println(twin.name);
//        System.out.println(twin.age);
//        System.out.println(Arrays.toString(twin.arr));
//
//        twin.arr[0]=15;
//        twin.name="BS";
//        twin.age=21;
//        System.out.println("==================");
//        System.out.println(twin.name);
//        System.out.println(twin.age);
//        System.out.println(Arrays.toString(twin.arr));
//
//
//        System.out.println(vinay.name);
//        System.out.println(vinay.age);
//        System.out.println(Arrays.toString(vinay.arr));


    }
}
