package org.historyresearchenvironment.usergui;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;

public class HRELogger {
	static private FileHandler handler;
	static private SimpleFormatter formatter;

	static public void setup() throws IOException {
		IEclipsePreferences iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");
		Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

		String levelName = iep.get("LOGLEVEL", "INFO");

		if (levelName.equals("OFF")) {
			LOGGER.setLevel(Level.OFF);
		} else if (levelName.equals("SEVERE")) {
			LOGGER.setLevel(Level.SEVERE);
		} else if (levelName.equals("WARNING")) {
			LOGGER.setLevel(Level.WARNING);
		} else if (levelName.equals("CONFIG")) {
			LOGGER.setLevel(Level.CONFIG);
		} else if (levelName.equals("FINE")) {
			LOGGER.setLevel(Level.FINE);
		} else if (levelName.equals("FINER")) {
			LOGGER.setLevel(Level.FINER);
		} else if (levelName.equals("FINEST")) {
			LOGGER.setLevel(Level.FINEST);
		} else if (levelName.equals("ALL")) {
			LOGGER.setLevel(Level.ALL);
		} else
			LOGGER.setLevel(Level.INFO);

		String logFilePath = iep.get("LOGFILEPATH", "c:/temp");

		if (logFilePath.endsWith(";")) {
			logFilePath = logFilePath.substring(0, logFilePath.length() - 1);
		}

		System.out.println("Log file path: " + logFilePath);

		handler = new FileHandler(logFilePath + "/hre-log.%u.%g.txt", 1024 * 1024, 10, true);

		formatter = new SimpleFormatter();
		handler.setFormatter(formatter);
		LOGGER.addHandler(handler);
	}
}