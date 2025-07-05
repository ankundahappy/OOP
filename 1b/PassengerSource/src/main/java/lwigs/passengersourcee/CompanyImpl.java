/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lwigs.passengersourcee;

import java.util.Random;

public class CompanyImpl implements Company {

    @Override
    public boolean scheduleVehicle(PassengerRequest request) {
        
        boolean available = new Random().nextBoolean();
        System.out.println("Scheduling request for " + request.getPassenger().getName() +
            " from (" + request.getPickup().getX() + "," + request.getPickup().getY() +
            ") to (" + request.getDestination().getX() + "," + request.getDestination().getY() +
            ") with " + request.getSeatCount() + " seats.");
        return available;
    }
}

