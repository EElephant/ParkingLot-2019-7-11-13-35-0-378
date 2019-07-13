package com.thoughtworks.tdd.Story1;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Ticket,Car> parkingInfo = new HashMap<>();
    private final int POSITIONCOUNT = 10;


    public Ticket getTicketByCar(Car car) {
        if(POSITIONCOUNT == parkingInfo.size())
            return null;
        if(parkingInfo.values().contains(car))
            return null;
        Ticket ticket = new Ticket();
        parkingInfo.put(ticket,car);
        return ticket;
    }

    public Car getCarByTicket(Ticket ticket){

        Car car = parkingInfo.remove(ticket);
        return car;
    }
}
