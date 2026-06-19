package Abstract;

public  class Son extends Parent{

    int salary;
    public Son(int age,int salary){
        super(age);
        this.salary=salary;
    }
    @Override
    void carrer(String name){
        System.out.println("Welcome to "+name);
    }
    @Override
    void partner(String name, int age) {

    }

    @Override
    void func() {
        helloWorld();
    }
}
