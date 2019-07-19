public class Main {

    public static void main(String[] args) {
        Car Sonata = new Car(25, 16);
        Truck F150 = new Truck(20, 30);

        Sonata.refuel();
        F150.refuel();

        Sonata.drive(15);
        F150.drive(13);

        String honk = Sonata.honk();
        String honk2 = F150.honk();
        System.out.println(honk);
        System.out.println(honk2);

        double currentTank = Sonata.currentFuelLevel;
        System.out.println(currentTank);
        double currentTank2 = F150.currentFuelLevel;
        System.out.println(currentTank2);
    }
}
