package com.report;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Logs {
    private static final Logger Log = LoggerFactory.getLogger(Logs.class.getName());

    // This is to print log for the beginning of the test case.
    public static void startTestCase() {

        Log.info("###########################         START OF TEST CASE        ###########################");
    }

    public static void endTestCase() {

        Log.info("###########################         END OF TEST CASE          ###########################");
    }

    public static void info(String message) {
        Log.info("-------------------------->         " + message);
    }

    public static void warn(String message) {
        Log.warn("**************************          " + message.toUpperCase());
    }
}

