public class Car extends Vehicle {

    public Car(int mpg, int tankCapacity) {
        this.milesPerGallon = mpg;
        this.fuelTankCapacity = tankCapacity;
    }

    public String honk() {
        return "Beep!";
    }
}
