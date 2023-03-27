package fhdw_drivers_sensors.weatherstation;

import fhdw_drivers_sensors.drivers.SerialPressureSensor;
import fhdw_drivers_sensors.drivers.SerialRainSensor;
import fhdw_drivers_sensors.drivers.SerialTemperatureDriver;
import fhdw_drivers_sensors.drivers.SerialWindspeedDriver;
import fhdw_drivers_sensors.drivers.USBTemperatureDriver;

public class Conversion implements Measurable {

  private final SerialTemperatureDriver serialTemperatureSensor;
  private final USBTemperatureDriver usbTemperatureSensor;
  private final SerialWindspeedDriver windSensor;
  private final SerialPressureSensor pressureSensor;
  private final SerialRainSensor rainSensor;

  public Conversion(SerialTemperatureDriver serialTemperatureSensor, USBTemperatureDriver usbTemperatureSensor,
      SerialWindspeedDriver windSensor,
      SerialPressureSensor pressureSensor, SerialRainSensor rainSensor) {
    this.serialTemperatureSensor = serialTemperatureSensor;
    this.usbTemperatureSensor = usbTemperatureSensor;
    this.windSensor = windSensor;
    this.pressureSensor = pressureSensor;
    this.rainSensor = rainSensor;
  }

  @Override
  public double getTemperature() throws SeonsorNotAvailableException {
    if (serialTemperatureSensor != null) {
      return serialTemperatureSensor.read() - 273.15;
    } else if (usbTemperatureSensor != null) {
      return usbTemperatureSensor.getTemperatureValue() / 100;
    }
    throw new SeonsorNotAvailableException();
  }

  @Override
  public double getWindspeed() {
    return windSensor.currentWindspeed() / 3.6;
  }

  @Override
  public double getPressureLevel() {
    return pressureSensor.getSensorValue();
  }

  @Override
  public double getAmountOfRain() {
    return rainSensor.getSensorValue();
  }

  @Override
  public double getWindSpeed() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWindSpeed'");
  }

  @Override
  public double getTemperatureValue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTemperatureValue'");
  }
}