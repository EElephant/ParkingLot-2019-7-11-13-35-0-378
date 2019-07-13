package com.thoughtworks.tdd.tdd_parkingLot;

import com.thoughtworks.tdd.Story.ParkingBoy;
import com.thoughtworks.tdd.Story.Ticket;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Story2Test {

    @Test
    public void should_return_unrecognized_parking_ticket_when_call_fetch_given_null_and_query_message(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = new Ticket();
        parkingBoy.fetch(ticket);

        String message = parkingBoy.query();
        assertThat(message, is("Unrecognized parking ticket."));
    }

    @Test
    public void should_return_unrecognized_parking_ticket_when_call_fetch_given_used_ticket_and_query_message(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = new Ticket();
        parkingBoy.fetch(ticket);
        parkingBoy.fetch(ticket);
        String message = parkingBoy.query();
        assertThat(message, is("Unrecognized parking ticket."));
    }

    @Test
    public void should_return_please_provide_your_parking_ticket_when_call_fetch_given_null_and_query_message(){
        ParkingBoy parkingBoy = new ParkingBoy();
        parkingBoy.fetch(null);
        String message = parkingBoy.query();
        assertThat(message, is("Please provide your parking ticket."));
    }
    
}
