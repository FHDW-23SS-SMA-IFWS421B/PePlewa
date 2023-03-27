package fhdw_drivers_sensors;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        SerialWindspeedDriver windDriver = new SerialWindspeedDriver("/dev/tty1");
        SerialTemperatureDriver tempDriver = new SerialTemperatureDriver("/dev/tty0");

        System.out.println(Converter.convertInKmh(windDriver.currentWindspeed())+" km/h");
        System.out.println(Converter.convertInK(tempDriver.read())+" K");
        //lol
        
    }
}