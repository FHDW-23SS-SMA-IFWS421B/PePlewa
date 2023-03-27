package fhdw_drivers_sensors;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        SerialWindspeedDriver windDriver = new SerialWindspeedDriver("/dev/tty1");
        SerialTemperatureDriver tempDriver = new SerialTemperatureDriver("/dev/tty0");

        PrintAdapter.print(Converter.convertInKmh(windDriver.currentWindspeed())+" km/h");
        PrintAdapter.print(Converter.convertInK(tempDriver.read())+" K");
    }
}