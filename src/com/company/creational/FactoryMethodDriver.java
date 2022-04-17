package com.company.creational;

import com.company.creational.Factory.AppLogger;
import com.company.creational.Factory.LoggerFactory;
import com.company.creational.Factory.LoggerType;

public class FactoryMethodDriver {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();

        AppLogger fileLogger = loggerFactory.getLogger(LoggerType.FILE.toString());
        fileLogger.log("Hi from file logger");

        AppLogger databaseLogger = loggerFactory.getLogger(LoggerType.DATABASE.label);
        databaseLogger.log("Hi from db logger");

        AppLogger consoleLogger = loggerFactory.getLogger(LoggerType.CONSOLE.label);
        consoleLogger.log("Hi from console logger");


    }
}
