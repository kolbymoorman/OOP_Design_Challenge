package vehicles;

public class Motorcycle extends Vehicle implements Drivable {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        String sidecarText = hasSidecar ? "with sidecar" : "without sidecar";
        System.out.println("Motorcycle: " + getYear() + ", " + sidecarText);
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle is driving.");
    }
}
