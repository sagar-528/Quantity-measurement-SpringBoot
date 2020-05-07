package com.bridgelabz.Serivces;

import com.bridgelabz.DTO.MeasurementUnit;
import com.bridgelabz.DTO.QuantityUnits;
import com.bridgelabz.DTO.Unit;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class QuantityImpl implements QuantityServices{
    @Override
    public List<String> getQuantity() {
        return Stream.of(MeasurementUnit.values()).map(MeasurementUnit::name)
                .collect(Collectors.toList());
    }

    @Override
    public List<Unit> getMeasurementUnit(MeasurementUnit quantity) {
        return Arrays.stream(Unit.values()).filter(unit -> unit.quantityName.equals(quantity))
                .collect(Collectors.toList());
    }

    @Override
    public QuantityUnits results(QuantityUnits quantityUnits, Unit userunit) {
       double value = quantityUnits.getValue() * quantityUnits.getUnit().baseUnit
               + quantityUnits.getUnit().additionConstant;
        return new QuantityUnits( userunit, value);
    }
}
