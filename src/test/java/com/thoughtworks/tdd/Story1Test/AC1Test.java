package com.thoughtworks.tdd.Story1Test;

import com.thoughtworks.tdd.Story1.Car;
import com.thoughtworks.tdd.Story1.ParkingBoy;
import com.thoughtworks.tdd.Story1.Ticket;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class AC1Test {
    @Test
    public void should_return_ticket_when_call_park_given_car(){
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = parkingBoy.park(car);
        assertThat(ticket, notNullValue());
    }

    @Test
    public void should_return_car_when_call_fetch_given_ticket(){
        Ticket ticket = new Ticket();
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = parkingBoy.fecth(ticket);
        assertThat(car,notNullValue());
    }
}
