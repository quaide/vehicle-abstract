public abstract class Vehicle {
    int milesPerGallon;
    int fuelTankCapacity;
    double currentFuelLevel;

    void drive(int distance) {
        System.out.println("Driving " + distance + " miles!");
        currentFuelLevel = currentFuelLevel - ((double) distance / milesPerGallon);
    }
    void refuel() {
        System.out.println("Gassing up!");
        currentFuelLevel = fuelTankCapacity;
    }

    public abstract String honk();
}
