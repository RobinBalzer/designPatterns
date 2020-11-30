public class TransportService {

    public static void main(String[] args){
        AirTransport plane = new AirTransport();
        SeaTransport ship = new SeaTransport();
        LandTransport truck = new LandTransport();

        System.out.println("Plane: I am made for " + plane.typeOfTransport() + ". " + plane.soundOfTransport());
        System.out.println("Ship:  I am made for " + ship.typeOfTransport() + ". " + ship.soundOfTransport());
        System.out.println("Truck: I am made for " + truck.typeOfTransport() + ". " + truck.soundOfTransport());
    }
}
