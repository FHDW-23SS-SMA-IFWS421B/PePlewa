package fhdw_drivers_sensors.drivers;

import java.io.FileNotFoundException;

import fhdw_drivers_sensors.weatherstation.ITemperatureSensor;

public class OverrideSerialTemperatureDriver extends SerialTemperatureDriver implements ITemperatureSensor {

  public OverrideSerialTemperatureDriver(String port) throws FileNotFoundException {
    super(port);
  }

  @Override
  public String getValue() {
    return Math.round(read()) + " degree(s) Celsius";
  }

}
