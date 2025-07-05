/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lwigs.passengersourcee;

/**
 *
 * @author Lwigs
 */
public class PassengerRequest {
    private Passenger passenger;
    private Location pickup;
    private Location destination;
    private int seatCount;

    public PassengerRequest(Passenger passenger, Location pickup, Location destination, int seatCount) {
        this.passenger = passenger;
        this.pickup = pickup;
        this.destination = destination;
        this.seatCount = seatCount;
    }

    public Passenger getPassenger() { return passenger; }
    public Location getPickup() { return pickup; }
    public Location getDestination() { return destination; }
    public int getSeatCount() { return seatCount; }
}

