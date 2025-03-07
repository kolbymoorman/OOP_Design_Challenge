package vehicles;

public class Main {
    // Data Coupling Example
    static void showVehicleAge(int year) {
        int age = 2025 - year; // Assume current year
        System.out.println("Vehicle is " + age + " years old.");
    }

    // Stamp Coupling Example
    static void showVehicleDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020, 4);
        Motorcycle myBike = new Motorcycle("Honda", "CB500F", 2018, false);

        myCar.displayInfo();
        myCar.drive();

        myBike.displayInfo();
        myBike.drive();

        // Demonstrating polymorphism (method overriding)
        showVehicleDetails(myCar);
        showVehicleDetails(myBike);

        // Demonstrating polymorphism (method overloading)
        showVehicleAge(myCar.getYear());
        showVehicleAge(myBike.getYear());
    }
}
