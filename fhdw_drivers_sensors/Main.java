package fhdw_drivers_sensors;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        SerialWindspeedDriver windDriver = new SerialWindspeedDriver("/dev/tty1");
        SerialTemperatureDriver tempDriver = new SerialTemperatureDriver("/dev/tty0");
        USBTemperatureDriver usbTempDriver = new USBTemperatureDriver("/dev/ttyUSB");
        SerialPressureSensor pressureSensor = new SerialPressureSensor("/dev/tty");
        SerialRainSensor rainSensor = new SerialRainSensor("/dev/tty");

        PrintAdapter.print(Converter.convertInKmh(windDriver.currentWindspeed())+" km/h");
        PrintAdapter.print(Converter.convertInK(tempDriver.read())+" K");
        PrintAdapter.print(Converter.convertUSB(usbTempDriver.getTemperatureValue())+"");
        PrintAdapter.print(pressureSensor.getSensorValue()+"hPa");
        PrintAdapter.print(rainSensor.getSensorValue()+"mm/h");
    }
    
}