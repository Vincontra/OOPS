package Collections;

public class Enums  {

    enum Week implements Cloneable{
        Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday,Sunday;
        // these are enum constants
        // public static and final in nature
        // since static and final we can not create child enums
        // and type for this is Week as enum Week

        Week(){
            System.out.println("Constructor for this object : "+this);
            // Constuctor here are only private or default
            // reason is we dont want to create new objects
            // this
        }

    }
    public static void main(String[] args) {
        //enums means fix count for the fields like variable ,objects and all

//        Week week;  /// this is how we acess them
//        week=Week.Sunday;
//        System.out.println(Week.Monday);
//
//        for (Week i:Week.values()){
//            System.out.println(i);
//        }

//        System.out.println(Week.Sunday.ordinal());
        // ordinal gives the position like indec nothing else

//        Week week=Week.Sunday;
//        Week week1=Week.Monday;

        // when constructor is called all objects in enum will be printed
        // or accessed

        // i guess enum class not inherited so any nethod we write
        // that need to have body

        // enums can implements as many interfaces we want

        // if needed read it later












    }
}
