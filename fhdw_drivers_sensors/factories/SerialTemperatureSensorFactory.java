package fhdw_drivers_sensors.factories;

import java.io.FileNotFoundException;
import fhdw_drivers_sensors.drivers.OverrideSerialTemperatureDriver;
import fhdw_drivers_sensors.weatherstation.ITemperatureSensor;

public class SerialTemperatureSensorFactory extends TemperatureSensorFactory {

  private String _port;

  public SerialTemperatureSensorFactory(String port) {
    super(port);
    _port = port;
  }

  public ITemperatureSensor create() throws FileNotFoundException {
    OverrideSerialTemperatureDriver _driver = new OverrideSerialTemperatureDriver(_port);

    return _driver;
  }

}
