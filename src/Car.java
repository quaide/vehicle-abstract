public class Car extends Vehicle {
    private String name;

    public Car(int mpg, int tankCapacity) {
        this.milesPerGallon = mpg;
        this.fuelTankCapacity = tankCapacity;
        this.name = "Quaide";
    }

    public String honk() {
        return "Beep!";
    }
}
