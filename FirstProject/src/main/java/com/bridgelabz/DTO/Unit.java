package com.bridgelabz.DTO;

public enum Unit {
        //Unit for Length
        FEET(12.0, MeasurementUnit.LENGTH,0.0), INCH(1.0, MeasurementUnit.LENGTH, 0.0),
        YARD(36.0, MeasurementUnit.LENGTH, 0.0), CM(0.4, MeasurementUnit.LENGTH, 0.0),

        //Unit for Volume
        LITRE(1.0, MeasurementUnit.VOLUME, 0.0), GALLON(3.78, MeasurementUnit.VOLUME, 0.0),
        ML(0.001, MeasurementUnit.VOLUME, 0.0),

        //Unit for Mass
        GRAM(0.001, MeasurementUnit.MASS, 0.0),
        KG(1.0, MeasurementUnit.MASS, 0.0), TONNE(1000.0, MeasurementUnit.MASS, 0.0),

        //Unit for Temperature
        FAHRENHEIT(1.0, MeasurementUnit.TEMPERATURE, 0.0), CELSIUS(2.12, MeasurementUnit.TEMPERATURE, 32.0);

        public double baseUnit;
        public MeasurementUnit quantityName;
        public double additionConstant;

        Unit(double baseUnit, MeasurementUnit quantityName, double additionConstant) {
            this.baseUnit = baseUnit;
            this.quantityName = quantityName;
            this.additionConstant = additionConstant;
        }
}
