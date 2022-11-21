package com.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        logger1.info("Text from first logger");
        logger2.info("Text from second logger");
        logger3.info("Text from third logger");
    }
}
