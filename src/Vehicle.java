public abstract class Vehicle {
    int milesPerGallon;
    int fuelTankCapacity;
    protected double currentFuelLevel;

    public  void drive(int distance) {
        System.out.println("Driving " + distance + " miles!");
        currentFuelLevel = currentFuelLevel - distance;
    }
    public  void refuel() {
        System.out.println("Gassing up!");
        currentFuelLevel = fuelTankCapacity*milesPerGallon;
    }

    public abstract String honk();
}
