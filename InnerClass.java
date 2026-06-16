public class InnerClass {

//   static class A{
//        static String name;
//        String name;
//        public A(String name){
//            this.name=name;
//            A.name=name;
//        }
//    }
    class A{
        // if this is static then not dependable upon the objects of outer class and hence we can make it's object which are
        // acts as individual then like if two objects are created with two different names then that two names will be printed
//        static String name;
        String name;
        public A(String name){
//            A.name=name;
            this.name = name;
        }
        public String toString(){
            return "wow";
        }
    }

    public static void main(String[] args) {

        InnerClass obj=new InnerClass();
        InnerClass.A pqr=obj.new A("pqr");  // this is the way in which you can make inner class non static and call it like this

//       A a=new A("abcd");
//       A b=new A("xyz");
       System.out.println(pqr);
      // System.out.println(b.name);

    }

}
//class A{
//    static String name;
//    String name;
//    public A(String name){
//        A.name=name;
//        this.name=name;
//    }
//}
