public class Human {
    int age;
    int sal;
    String name;
    static int population; // common to all Humans hence static

    public Human(int age,int sal,String name){
        this.age=age;
        this.sal=sal;
        this.name=name;
        Human.population+=1;   // can also be write as  this.population+=1;

        // but when we do like this.population it is like does this object has population as variblr
        // no it does not then does this class has it ?
        // yes it has then just do that increment
        // so that is why 'this' works
    }

    public static void main(String[] args) {
        Human rahul=new Human(21,22,"B");
//        System.out.println(rahul.population);  this can be done but it is population for
        // but any object of class Human it should be same and hence we write like below line:
        System.out.println(Human.population);
        Human vinrar=new Human(21,22,"B");



    }

}
