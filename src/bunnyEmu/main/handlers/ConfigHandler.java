package bunnyEmu.main.handlers;

import java.io.FileInputStream;
import java.util.Properties;

import bunnyEmu.main.enums.LogType;
import bunnyEmu.main.utils.Logger;

/**
 * Manages assets/server.conf
 * 
 * @author Wazy
 *
 */
public class ConfigHandler {

	/* load properties and return them */
	public static Properties loadProperties() {
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("assets/server.conf"));
			return prop;
		}
		catch (Exception e) {
			Logger.writeLog("Unable to load configuration file 'server.conf' from assets folder... terminating.", LogType.ERROR);
			System.exit(0);
		}

		return null;
	}
}
