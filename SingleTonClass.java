public class SingleTonClass {
    private SingleTonClass(){
        // private as we are not allowd any other class to acces this constructor
        // this will be only accessed in this class only

        // this constructor cant be accessed from other file then how to return object
        // even though it is created once
        // this construcotr should be called once and that can happen only in this class

        // so we make a method getinstance() which will return that object
        // but should make it static or non static
        // we have to make that only static as we cant make object of this class in other class
        // if  no object how can a non static method be called so static

        // To check that whether a object is created once or not we need variable of type this class SingleTonclass
        // so we named that as instance

        // to access that inside getInstance method which is static it has to be static only
        // hence that is also static


    }

  static SingleTonClass instance;// this is object which will be created in memory once
   static SingleTonClass getInstance(){  //
        if (instance==null){  // it will run once only for the first time
            instance=new SingleTonClass();
        }
        return instance;
    }
}
