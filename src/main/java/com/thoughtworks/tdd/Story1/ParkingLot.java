package com.thoughtworks.tdd.Story1;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Ticket,Car> parkingInfo = new HashMap<>();


    public Ticket getTicketByCar(Car car) {

        Ticket ticket = new Ticket();
        parkingInfo.put(ticket,car);
        return ticket;
    }

    public Car getCarByTicket(Ticket ticket){

        Car car = parkingInfo.remove(ticket);
        return car;
    }
}
