package ObjectClass;

public class ObjectDemo {

    // basically we can make our own methods by overidign this:
   int num;
   ObjectDemo(int num){
      this.num=num;
   }
    public int hashCode(){
        // unique rerpresentation of object via a number
        // that value is not address it is just value form by some algo
        // internally
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        // equals() method is originally present in Object class as:
        // public boolean equals(Object obj)
        // Therefore while overriding, parameter type must remain Object.
        // If we write:
        // public boolean equals(ObjectDemo obj)
        // then it becomes method overloading, not overriding,
        // and @Override will give an error.

        // Suppose:
        // Object obj = new ObjectDemo();
        //
        // Reference type = Object
        // Actual object = ObjectDemo
        //
        // Since the reference type is Object, the compiler only knows
        // members present inside Object class.
        // It does NOT know about variables specific to ObjectDemo,
        // therefore obj.num is invalid.

        // To access child-specific members, we must downcast:
        // (ObjectDemo)obj
        //
        // After typecasting, the compiler now treats obj as an
        // ObjectDemo reference and allows access to num.

        // We are comparing num variable of current object (this)
        // with num variable of the object passed as argument.
        return this.num == ((ObjectDemo)obj).num;

        // Safer version should first check:
        // 1. if both references are same
        // 2. if obj is null
        // 3. if obj actually belongs to ObjectDemo class

        // otherwise a ClassCastException may occur when some other
        // type of object is passed.
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
         ObjectDemo objectDemo = new ObjectDemo(15);
         ObjectDemo objectDemo1 = new ObjectDemo(15);
//        System.out.println(objectDemo.hashCode())
//        System.out.println(objectDemo1.hashCode());
//
//        System.out.println(objectDemo instanceof ObjectDemo);
//        System.out.println(objectDemo instanceof Object);
        // check whether that object is instance of Object class or not
//        System.out.println(objectDemo1.equals(objectDemo));

//        Object object=new Object();
//        System.out.println(objectDemo.getClass());
//        System.out.println(object.getClass()); // to get the complete class Name like its package and then name


    }
}
