/**
 * Tightly coupled classes have a strong dependency, where one class directly depends on another.
 */
class Engine{
    public void start(){
        // Start the engine
    }
}

class Car{
    private Engine engine;

    public Car(){
        engine = new Engine() // Tightly coupled to Engine class
    }

    public void start(){
        engine.start();
    }
}