package com.bridgelabz.DTO;

public class QuantityUnits {
    public final Unit unit;
    public final double value;

    public QuantityUnits(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }
}
