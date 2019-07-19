public class Truck extends Vehicle {

    public Truck(int mpg, int tankCapacity) {
        this.milesPerGallon = mpg;
        this.fuelTankCapacity = tankCapacity;
    }

    public String honk() {
        return "HONK HONK I'M A TRUCK!";
    }
}
