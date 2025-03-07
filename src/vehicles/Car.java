package vehicles;

public class Car extends Vehicle implements Drivable {
    private int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + getYear() + ", " + doors + " doors");
    }

    @Override
    public void drive() {
        System.out.println("The car is driving.");
    }
}
