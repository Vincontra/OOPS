//public class Main {
//    public static void main(String[] args) {
//        vinay o = new vinay();
//
//        // this issue can be resolve by like this
////        Main m = new Main();
////        Main.vinay v = m.new vinay();
//
//        System.out.println(vinay.wow);
//        System.out.println(o.wow);
//        System.out.println(o.x);
//        System.out.println(vinay.x);
//        Node newnodew = new Node();
//
//    }
//
//    public void s() {
//        vinay o = new vinay();
//        System.out.println(vinay.x);
//        System.out.println(vinay.wow);
//        System.out.println(o.x);
//        System.out.println(o.wow);
//
//
//    }
//
//     class vinay {
//        int wow = 44;
//        static int x = 99;
//        static int prasanna = 10;
//
//    }
//}

// static and non static my understandings:
// there will be only 1 public class
// there must a one main method for each class
// if we want nested class that class properties we want to access say in another method which is static
// then two options all properties in that nested wala class must be static
// if not we have to create object
// but if we are creating for any class which is non static in static method it will give error
// so either make the class static if not all properties static if not
// do not create it s object inside static method if still not
// create it as separate class and not as a nested one

// I need to check for more like this but ya as of now it is fine even though i was just trying to play
// but this my pure observation






//gpt ne diya almost sahi hai matlab
//Static and Non-Static — My Understanding
//
//        * There will be only 1 public class in a Java file.
//
//        * There does NOT need to be one main method for each class. A class can exist without a main method. We only need a main method in the class we want to run.
//
//        * If we want to access properties of a nested class inside a static method:
//
//        * Option 1: Make those properties static.
//        * Option 2: Create an object of that class and access the non-static properties through the object.
//
//        * If the nested class itself is declared static, we can create its object inside a static method without any issue.
//
//        * If the nested class is non-static (inner class), then creating its object directly inside a static method will give an error because it needs an object of the outer class first.
//
//        * So either:
//
//        * Make the nested class static, or
//        * Use an outer class object to create the inner class object, or
//  * Create it as a separate top-level class.
//
//        * Static variables belong to the class.
//
//        * Non-static variables belong to the object.
//
//        * Static methods can directly access only static members.
//
//        * To access non-static members inside a static method, an object is required.
//
//        I need to check more cases like this, but as of now this is what I observed while playing around with static and non-static concepts. These are my current observations and understanding.


// then why does it eun when i declare that class out side the class even if it is non static still we can create the object insdie static method?

//class Outer {
//    class Inner {
//        void display() {
//            System.out.println("Hello");
//        }
//    }
//
//    public static void main(String[] args) {
//        Inner obj = new Inner(); // Error
//    }
//}
//
//
//    Outer outer = new Outer();
//    Outer.Inner inner = outer.new Inner();

//    When main() starts, there is no Outer object yet. But Inner is attached to an Outer object, so Java doesn't know which Outer instance the Inner should belong to.
