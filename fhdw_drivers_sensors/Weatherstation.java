package fhdw_drivers_sensors;

import java.io.FileNotFoundException;

import fhdw_drivers_sensors.drivers.SerialPressureSensor;
import fhdw_drivers_sensors.drivers.SerialRainSensor;
import fhdw_drivers_sensors.drivers.SerialTemperatureDriver;
import fhdw_drivers_sensors.drivers.SerialWindspeedDriver;
import fhdw_drivers_sensors.drivers.USBTemperatureDriver;
import fhdw_drivers_sensors.factories.TemperatureSensorFactory;
import fhdw_drivers_sensors.weatherstation.Conversion;
import fhdw_drivers_sensors.weatherstation.SeonsorNotAvailableException;
import fhdw_drivers_sensors.factories.*;

public class Weatherstation {
  public static void main(String[] args) throws FileNotFoundException, SeonsorNotAvailableException {
    String tempDevice = "/dev/tty0";
    String usbTempDevice = "/dev/ttyUSB";
    String windDevice = "/dev/tty1";
    String pressureDevice = "/dev/tty2";
    String rainDevice = "/dev/tty3";
    /*
     * SerialTemperatureDriver serialTemperatureSensor = new
     * SerialTemperatureDriver(tempDevice);
     * USBTemperatureDriver usbTemperatureDriver = new
     * USBTemperatureDriver(usbTempDevice);
     * SerialWindspeedDriver windSensor = new SerialWindspeedDriver(windDevice);
     * SerialPressureSensor pressureSensor = new
     * SerialPressureSensor(pressureDevice);
     * SerialRainSensor rainSensor = new SerialRainSensor(rainDevice);
     * 
     * 
     * Conversion conversion = new Conversion(serialTemperatureSensor,
     * usbTemperatureDriver, windSensor, pressureSensor,
     * rainSensor);
     */
    /*
     * System.out.println(Math.round(conversion.getTemperature()) +
     * " degree(s) Celsius");
     * System.out.println(Math.round(conversion.getWindspeed()) + " km/h");
     * System.out.println(Math.round(conversion.getPressureLevel()) + " hPa");
     * System.out.println(Math.round(conversion.getAmountOfRain()) + " mm/h");
     */
    SerialTemperatureSensorFactory tempSensor = new SerialTemperatureSensorFactory(tempDevice);
    var serialTemSensor = tempSensor.create();
    System.out.println(serialTemSensor.getValue());

    USBTemperatureSensorFactory tempSensor2 = new USBTemperatureSensorFactory(usbTempDevice);
    var usbTemSensor = tempSensor2.create();
    System.out.println(usbTemSensor.getValue());
  }
}
