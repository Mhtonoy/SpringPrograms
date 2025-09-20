/**
 * Loosely coupled classes minimize dependencies and make the code more maintainable and flexible.
 */

public interface Engine{
    void start();
}

class ElectricEngine implements Engine{
    public void start(){
        // Start an electric engine
    }
}

class PetrolEngine implements Engine{
    public void start(){
        // Start a petrol engine
    }
}

class Car{
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine // Loosely coupled to Engine class
    }

    public void start(){
        engine.start();
    }
}