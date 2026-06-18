package Access_Modifier;

public class Main extends A{
    public Main(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
//        A obj=new A(33,"Vinay");
//        System.out.println(obj.Protected);
//        obj.setNum(440);
//        System.out.println(obj.getNum());
//        System.out.println(obj.name); // name was public so yeah can be accessed
//        System.out.println(obj.age);
        // age was not private not public so it is default
        // defaults can be acessed anywhere but in same package

        //Main obj=new Main(33,"contra");
        //System.out.println(obj.Protected);
//        A obj1=new A(22,"vinrira");
//        System.out.println(obj1.Protected);

    }
}
