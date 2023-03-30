package fhdw_drivers_sensors.factories;

import java.io.FileNotFoundException;
import fhdw_drivers_sensors.weatherstation.ITemperatureSensor;

public abstract class TemperatureSensorFactory {

  private String _port;

  public TemperatureSensorFactory(String port) {
    _port = port;
  }

  public abstract ITemperatureSensor create() throws FileNotFoundException;

}
