public class Hangar {
    public static void main(String[] args) {
        Car Clio = new Car("Clio", 12);
        Boat Titan = new Boat("Titan", -12);
        System.out.println(Clio.doStuff());
        System.out.println(Titan.doStuff());
    }
}
