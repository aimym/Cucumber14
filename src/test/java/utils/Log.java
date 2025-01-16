package utils;

import org.apache.log4j.*;

public class Log {

    // Initialize Log4j logs
    private static Logger Log = Logger.getLogger(Log.class.getName());

    //understand the scope
    //if my test case start
    //if my test case end
    //if any message I need in between


    // This is to print log for the beginning of the test case,
    // as we usually run so many test cases as a test suite

    public static void startTestCase(String testCaseName){
        Log.info("****************************************************************************************");
        Log.info("****************************************************************************************");
        Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+testCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
        Log.info("****************************************************************************************");
        Log.info("****************************************************************************************");

    }

    //This is to print log for the ending of the test case

    public static void endTestCase(String testCaseName){

        Log.info("########################################################");
        Log.info("#######################################################");
        Log.info("XXXXXXXXXXXXXXXXXXXXXXX     " + testCaseName + "     XXXXXXXXXXXXXXXXXXXXXX");
        Log.info("########################################################");
        Log.info("########################################################");
    }

    public static void info(String message) {
        Log.info(message);
    }

    public static void warning(String warning){
        Log.info(warning);
    }


}
