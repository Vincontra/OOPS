package inheritance;

public class Main {
    public static void main(String[] args) {
//        BoxWeight box1=new BoxWeight(4,5,6,7);
//        Box box=new Box(4,5,6);
//        System.out.println(box1.h);  // error as h is private and since we cant access it outside that class
//        System.out.println(box.h);

        // not only varibles we cant accesss private methods as well

        Box box=new BoxWeight(3,4,5,6);
        System.out.println(box.l); // Parents can refer to objects of type Child

//        BoxWeight boxWeight=new Box(3,4,5);
        //Child can not refer to the object of type parent
        // Error id due to we are calling par ka constructor to initialize varibles but
        // it has no idea about the child ke varibles
        // since we are creating ref var of child they must be initialized and here we are not
        // hence error




    }

}
