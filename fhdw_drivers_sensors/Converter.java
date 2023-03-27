package fhdw_drivers_sensors;
public class Converter{

    public static double convertInKmh(double windSpeedInMs) { return windSpeedInMs/3.6; }
    public static double convertInK(double temperatureInC) { return temperatureInC+273.15; }
    public static double convertUSB(int temp) { return temp * 10; }
    
}