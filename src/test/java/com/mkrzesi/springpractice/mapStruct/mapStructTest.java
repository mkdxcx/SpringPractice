package com.mkrzesi.springpractice.mapStruct;

import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class mapStructTest {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void shouldMapCarToCarDto(){
        //given
        Car car = new Car("Fiat","Sedan",5);

        //when
        CarDto carDto = Mapper.INSTANCE.carToCarDto(car);

        //then
        logger.info(carDto.getNameMapped());
        logger.info(""+carDto.getSeatsMapped());
        assertNotNull(carDto);
    }
}
