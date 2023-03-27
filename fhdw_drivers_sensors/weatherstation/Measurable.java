package fhdw_drivers_sensors.weatherstation;

public interface Measurable {
  double getWindspeed();

  double getTemperature() throws SeonsorNotAvailableException;

  double getTemperatureValue();

  double getWindSpeed();

  double getPressureLevel();

  double getAmountOfRain();
}
