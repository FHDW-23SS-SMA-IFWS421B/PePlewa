package fhdw_drivers_sensors.drivers;

import java.io.FileNotFoundException;

import fhdw_drivers_sensors.weatherstation.ITemperatureSensor;

public class OverrideUSBTemperatureDriver extends USBTemperatureDriver implements ITemperatureSensor {

  public OverrideUSBTemperatureDriver(String port) throws FileNotFoundException {
    super(port);
  }

  @Override
  public String getValue() {
    return Math.round(getTemperatureValue()) + " degree(s) Celsius";
  }

}
