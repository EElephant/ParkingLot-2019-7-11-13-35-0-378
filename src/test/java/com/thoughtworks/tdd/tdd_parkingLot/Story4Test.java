package com.thoughtworks.tdd.tdd_parkingLot;

import com.thoughtworks.tdd.Story.Car;
import com.thoughtworks.tdd.Story.ParkingBoy;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Story4Test {

    @Test
    public void should_return_9_9_when_call_get_lot_position_count_given_two_car(){
        ParkingBoy smartParkingBoy = new ParkingBoy();
        Car car1 = new Car();
        Car car2 = new Car();

        smartParkingBoy.park(car1);
        smartParkingBoy.park(car2);

        assertThat(smartParkingBoy.getLotPositionCountByLot(1), is(9));
        assertThat(smartParkingBoy.getLotPositionCountByLot(2), is(9));
    }
}
