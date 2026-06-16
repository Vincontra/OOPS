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
//        static String name;
        String name;
        public A(String name){
//            A.name=name;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        InnerClass obj=new InnerClass();
        InnerClass.A pqr=obj.new A("pqr");  // this is the way in which you can make inner class non static and call it like this

//       A a=new A("abcd");
//       A b=new A("xyz");
       System.out.println(pqr.name);
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
