package Interfaces;

public interface A {
    default void func(){
        System.out.println("From Java 8 onwards we can have default body to interfaces" +
                "again if we any other interface with same name there will be same problem if these two different interface" +
                " would have been implemented by same class so it should be avoided");
    }
    static void hello(){
        System.out.println("Static method in interface must have body as static does not depends on object hence can t be overidden and hence need to implement here only Can be access throught Interface name. methodName");
    }
}
