package com.au.logging;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogProducer.class);

	private LoggingService service = new LoggingService();

	@BeforeEach
	public void clearLoggingStatements() {
		AddLog.clearEvents();
	}

	@Test
	public void testAssertingLoggingStatementsA() {
		service.logInfo("first log");
		
		service.logTrace("second log");
		
		service.logDebug("third log");
		
		service.logWarn("forth log");
		
		service.logError("fifth log");
	}

	@Test
	public void testAssertingLoggingStatementsB() {
		service.logInfo("First log");
	}
}