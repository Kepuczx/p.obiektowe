public class Car extends Vehicle {
    int numberOfDoors;
    Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }
}
