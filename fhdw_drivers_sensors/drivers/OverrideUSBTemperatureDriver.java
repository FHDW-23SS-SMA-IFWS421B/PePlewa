package fhdw_drivers_sensors.drivers;

import java.io.FileNotFoundException;

import fhdw_drivers_sensors.weatherstation.ITemperatureSensor;

public class OverrideUSBTemperatureDriver extends USBTemperatureDriver implements ITemperatureSensor {

  public OverrideUSBTemperatureDriver(String devicename) throws FileNotFoundException {
    super(devicename);
  }

  @Override
  public String getValue() {
    throw new UnsupportedOperationException("Unimplemented method 'getValue'");
  }

}
