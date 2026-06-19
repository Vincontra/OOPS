package Interfaces;
public class NiceCar {
    private Engine engine;
    private Media player;
    public NiceCar(){
        engine=new PowerEngine();
        player=new CDPlayer();
    }
    public NiceCar(Engine engine,Media player){
        this.engine=engine;
        this.player=player;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void startMusic(){
        player.start();
    }
    public void upGradeEngine(Engine engine){
        this.engine=engine;
    }
}
