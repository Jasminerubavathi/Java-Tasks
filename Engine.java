 
interface Engine {
    void start();
    void stop();
}

interface Features {
    void playMusic();
    void navigation();
}

abstract class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Car extends Vehicle implements Engine, Features {
    public Car(String model) {
        super(model);
    }

   // @Override
    public void start() {
        System.out.println("Starting the car engine of " + getModel());
    }

   // @Override
    public void stop() {
        System.out.println("Stopping the car engine of " + getModel());
    }

   // @Override
    public void playMusic() {
        System.out.println("Playing music in the car " + getModel());
    }

   /// @Override
    public void navigation() {
        System.out.println("Using navigation system in the car " + getModel());
    }
}

  class VehicleManagement {
    public static void main(String[] args) {
        Car car = new Car( "Toyota Camry");

        car.start();
        car.playMusic();
        car.navigation();
        car.stop();
    }
}
