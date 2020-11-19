//Написать класс «автомобиль», который должен уметь заводится, глушить мотор,
// ехать и держать необходимую скорость.
public class Car {
    private String brand;
    private int passengerCapacity;
    private double maxSpeed;
    private double currentSpeed;
    private boolean isStarted;

    public Car(String brand, int passengerCapacity, double maxSpeed) {
        this.brand = brand;
        this.passengerCapacity = passengerCapacity;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0.0;
        this.isStarted = false;
    }

    public boolean start() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("The engine is started.");
            return isStarted;
        } else {
            System.out.println("The engine's already started. You can't turn the key twice.");
            return isStarted;
        }
    }

    public boolean stop() {
        if (isStarted) {
            isStarted = false;
            currentSpeed = 0.0;
            System.out.println("The engine is stopped.");
            return isStarted;
        } else {
            System.out.println("The engine's already stopped.");
            return isStarted;
        }
    }

    public void accelerate(double speed){
        if(!checkStarter()){
            return;
        }

        if((speed > 0) && ((currentSpeed+speed) < maxSpeed)){
            currentSpeed += speed;
            System.out.println("\tCurrent speed is "+this.currentSpeed);

        }else {
            System.out.println("Invalid data.");
        }
    }

    public void decelerate(double speed){
        if(!checkStarter()){
            return;
        }
        if((speed > 0) && ((currentSpeed-speed) > 0)){
            currentSpeed -= speed;
            System.out.println("\tCurrent speed is "+this.currentSpeed);
        }else {
            System.out.println("Invalid data.");
        }

    }


    private boolean checkStarter(){
        if(isStarted){
            System.out.println(brand+" is being driven.");
            return true;
        }else{
            System.out.println(brand+" is parked.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                ", isStarted=" + isStarted +
                '}';
    }
}
