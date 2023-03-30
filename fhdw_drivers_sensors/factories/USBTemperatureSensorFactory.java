package fhdw_drivers_sensors.factories;

import java.io.FileNotFoundException;
import fhdw_drivers_sensors.drivers.OverrideUSBTemperatureDriver;
import fhdw_drivers_sensors.weatherstation.ITemperatureSensor;

public class USBTemperatureSensorFactory extends TemperatureSensorFactory {

  private String _port;

  public USBTemperatureSensorFactory(String port) {
    super(port);
    _port = port;
  }

  public ITemperatureSensor create() throws FileNotFoundException {
    OverrideUSBTemperatureDriver _driver = new OverrideUSBTemperatureDriver(_port);

    return _driver;
  }

}
