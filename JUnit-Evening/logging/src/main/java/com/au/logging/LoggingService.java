package com.au.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingService {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingService.class);

	public void logInfo(String message) {
		LOGGER.info("Log " + message);
	}
	
	public void logTrace(String message) {
		LOGGER.trace("Log " + message);
	}
	
	public void logDebug(String message) {
		LOGGER.debug("Log " + message);
	}
	
	public void logWarn(String message) {
		LOGGER.warn("Log " + message);
	}
	
	public void logError(String message) {
		LOGGER.error("Log " + message);
	}
	
}

