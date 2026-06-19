package Interfaces;

import java.util.Queue;

public class Car implements Engine,Brake,Media,A{

    @Override
    public void brake() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void acc() {

    }

    public static void main(String[] args) {

//        Brake o=new Car();
//        Engine o1=new Car();
//        System.out.println(o1.PRICE);
//        System.out.println(o.PRICE);

//        NiceCar car = new NiceCar();
//        car.start();
//        car.startMusic();
//
//        NiceCar niceCar=new NiceCar(new ElectricEngine(),new CDPlayer());
//        niceCar.start();
//        niceCar.startMusic();
//        niceCar.upGradeEngine(new PowerEngine());
//        niceCar.start();


        Car car=new Car();
        car.func();
        A.hello();




    }

}
