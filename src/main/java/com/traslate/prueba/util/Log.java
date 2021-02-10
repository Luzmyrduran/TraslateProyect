package com.traslate.prueba.util;

import org.slf4j.Logger;

public class Log {
	public static void print(Logger logger, String message) {

		logger.info("======= " + message + " =======");

	}
}
