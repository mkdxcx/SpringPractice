package com.mkrzesi.springpractice.mapStruct;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface Mapper {

    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

    @Mapping(source = "seats", target = "seatsMapped")
    @Mapping(source = "name", target = "nameMapped")
    CarDto carToCarDto(Car car);

}
