public class StaticBlock {
    static int a=10;
    static int b;
    static {
        System.out.println("I m inside sttaic block runs exactly once ; used to initialize for the static variables" +
                "");
        b=a*a;
    }
    public static void main(String[] args) {
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);
        StaticBlock.b=99;
        System.out.println(StaticBlock.b);
    }
}
