package fhdw_drivers_sensors.drivers;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Fictional driver to represent a serial rain sensor
 * 
 * @author Matthias Füller
 *
 */
public class SerialRainSensor {

	/**
	 * Init SerialDriver with given serial device
	 * 
	 * @param devicename
	 * @throws FileNotFoundException
	 */
	public SerialRainSensor(String devicename) throws FileNotFoundException {
		if (devicename.startsWith("/dev/tty") == false) {
			throw new FileNotFoundException("Wrong serial device given " + devicename);
		}
	}

	/**
	 * Return the current amount of rain in mm/h
	 * 
	 * @return current rain in mm/h
	 */
	public double getSensorValue() {
		Random rnd = new Random();

		return 10 * rnd.nextDouble();
	}
}
