package com.bridgelabz.Serivces;

import com.bridgelabz.DTO.MeasurementUnit;
import com.bridgelabz.DTO.QuantityUnits;
import com.bridgelabz.DTO.Unit;

import java.util.List;

public interface QuantityServices {
    List<String> getQuantity();
    List<Unit> getMeasurementUnit(MeasurementUnit quantityName);
    QuantityUnits results(QuantityUnits quantityUnits, Unit unit);
}
