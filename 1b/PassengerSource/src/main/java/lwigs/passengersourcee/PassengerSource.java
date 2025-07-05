package lwigs.passengersourcee;

import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public boolean requestPickup() {
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        Passenger passenger = new Passenger("RandomPassenger");
        int seatCount = 1 + random.nextInt(4);
        PassengerRequest request = new PassengerRequest(passenger, pickup, destination, seatCount);
        return company.scheduleVehicle(request);
    }

    
    public static void main(String[] args) {
        Company company = new CompanyImpl();  
        PassengerSource source = new PassengerSource(company);

        boolean result = source.requestPickup();
        if (result) {
            System.out.println("Vehicle successfully scheduled for pickup.");
        } else {
            System.out.println("Failed to schedule vehicle. No vehicles available.");
        }
    }
}
