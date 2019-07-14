package com.thoughtworks.tdd.story1;

public class ParkingBoy {

    private ParkingLot parkingLot = new ParkingLot();


    public Ticket park(Car car) {
        Ticket ticket = null;
        if (parkingLot.getAvalidPositionCount() > 0)
            ticket = parkingLot.getTicketByCar(car);
        return ticket;
    }

    public Car fetch(Ticket ticket) {
        Car car = parkingLot.getCarByTicket(ticket);
        return car;
    }


}
