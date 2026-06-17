package inheritance;

public class Box {

    private double h;
    double l;
    double w;

    public Box(){
        System.out.println("Construcitr with no parameter");
    }
    public Box(double h,double l, double w){
        this.h=h;
        this.w=w;
        this.l=l;
    }
    private void print(){
        System.out.println("Vinrar");
    }
    public Box(Box other){
        this.h=other.h;
        this.w=other.w;
        this.l=other.l;

    }
}
