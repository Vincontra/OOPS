package inheritance;
public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight=-1;
    }
    public BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
        // what is happening is we pass the object of type BoxWeight
        // in super;but there cant be anytype in parent then
        //still it is not error as  some thing like this Box box=new BoxWeight(3,4,5,6);
        // Reference type is Box but object thype is BoxWeight
        // and it is always decided from the reference type and not the type of object being created
        // although it has access here box to the property only in class Box and not individual property
        // of class BoxWeight here weight
        // super is written only to initialize properties of Class Box
        // as that BoxWeight ka reference other contains all properties of class Box
        // as inheritance
    }
    public BoxWeight(double l,double w,double h,double weight) {
        super(l,w,h);

        // initializes the parent constructor of this type jisme 3 parameter ho
        // Box me h is private so one doubt may be arise that how we are accesing it here
        // we are not
        // super keyword initializes the parent ka construtor infact super is Box class here
        // and within the class we can do anything with private

        this.weight=weight;
    }
}
