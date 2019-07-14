package com.thoughtworks.tdd.story3;

public class ParkingBoy {

    private ParkingLot parkingLot = new ParkingLot(10);
    private ParkingLot secondParkingLot = new ParkingLot(20);


    public Ticket park(Car car) {
        Ticket ticket = null;
        if (getParkingLotPositionRate(parkingLot) >= getParkingLotPositionRate(secondParkingLot)) {
            if (parkingLot.getAvalidPositionCount() != 0) {
                return ticket = parkingLot.getTicketByCar(car);
            }
        }if(getParkingLotPositionRate(parkingLot) < getParkingLotPositionRate(secondParkingLot)) {
            if (secondParkingLot.getAvalidPositionCount() != 0)
                return ticket = secondParkingLot.getTicketByCar(car);
        }
        return secondParkingLot.getTicketByCar(car);
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

    public int getAllParkingLotPositionSum(ParkingLot p1, ParkingLot p2){
        return p1.getPosition()+p2.getPosition();
    }

    public float getParkingLotPositionRate(ParkingLot p){
        float rate =  ((float)p.getAvalidPositionCount()/(float)p.getPosition());
        return rate;
    }

}
