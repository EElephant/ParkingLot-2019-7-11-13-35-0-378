package com.thoughtworks.tdd.story1;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Ticket, Car> parkingInfo = new HashMap<>();
    private static final int POSITIONCOUNT = 30;
    private String message;

    public Ticket getTicketByCar(Car car) {
        if(parkingInfo.values().contains(car))
            return null;
        if(car == null)
            return null;
        Ticket ticket = new Ticket();
        parkingInfo.put(ticket,car);
        return ticket;
    }

    public Car getCarByTicket(Ticket ticket){
        Car car = parkingInfo.remove(ticket);
        return car;
    }


    public int getAvalidPositionCount(){
        return POSITIONCOUNT - parkingInfo.size();
    }
}
