package com.thoughtworks.tdd.story6;

public class ParkingBoy {

    private ParkingLot parkingLot = new ParkingLot();
    private ParkingLot secondParkingLot = new ParkingLot();

    public Ticket park(Car car) {
        Ticket ticket = null;
        if (parkingLot.getAvalidPositionCount() > secondParkingLot.getAvalidPositionCount())
            ticket = parkingLot.getTicketByCar(car);
        else
            ticket = secondParkingLot.getTicketByCar(car);
        return ticket;
    }

    public Car fetch(Ticket ticket) {
        Car car = parkingLot.getCarByTicket(ticket);
        if(car == null)
            car = secondParkingLot.getCarByTicket(ticket);
        return car;
    }

    public String query() {

            return secondParkingLot.queryMessage();
    }

    public int getLotPositionCountByLot(int i) {
        if(i == 1)
            return parkingLot.getAvalidPositionCount();
        if(i == 2)
            return secondParkingLot.getAvalidPositionCount();
        return 0;
    }
}
