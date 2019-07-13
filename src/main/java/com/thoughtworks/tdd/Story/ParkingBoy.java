package com.thoughtworks.tdd.Story;

public class ParkingBoy {

    private ParkingLot parkingLot = new ParkingLot();
    private ParkingLot secondParkingLot = new ParkingLot();

    public Ticket park(Car car) {
        Ticket ticket = null;
        if(!parkingLot.isFull())
            ticket = parkingLot.getTicketByCar(car);
        else
            ticket = secondParkingLot.getTicketByCar(car);
        return ticket;
    }

    public Car fetch(Ticket ticket) {
        Car car = parkingLot.getCarByTicket(ticket);
        return car;
    }

    public String query() {
        return parkingLot.queryMessage();
    }
}
