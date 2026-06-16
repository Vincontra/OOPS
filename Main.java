public class Main{
    public static void main(String[] args) {
//        SingleTonClass obj=new SingleTonClass(); // will give error as it must not acces since it is prvivate

        SingleTonClass obj1=SingleTonClass.getInstance(); // abhi for the first time obj created
        SingleTonClass obj2=SingleTonClass.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        // will point to same object in memory


    }
}
