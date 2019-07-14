package com.thoughtworks.tdd.tdd_parkingLot;

import com.thoughtworks.tdd.story5.Car;
import com.thoughtworks.tdd.story5.ParkingBoy;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Story5Test {
    @Test
    public void should_return_9_18_when_call_get_lot_position_count_given_three_car_in_10_and_20_position_parkingLot(){
        ParkingBoy smartParkingBoy = new ParkingBoy();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        smartParkingBoy.park(car1);
        smartParkingBoy.park(car2);
        smartParkingBoy.park(car3);

        assertThat(smartParkingBoy.getLotPositionCountByLot(1), is(9));
        assertThat(smartParkingBoy.getLotPositionCountByLot(2), is(18));
    }
}
