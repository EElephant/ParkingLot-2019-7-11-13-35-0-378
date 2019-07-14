package com.thoughtworks.tdd.story2;

public class ParkingBoy {

    private ParkingLot parkingLot = new ParkingLot();


    public Ticket park(Car car) {
        Ticket ticket = null;
        ticket = parkingLot.getTicketByCar(car);
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
