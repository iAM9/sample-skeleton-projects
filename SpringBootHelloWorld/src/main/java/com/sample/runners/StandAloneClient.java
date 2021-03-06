package com.sample.runners;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;

import com.sample.services.MyRestServicesController;

/**
 * Standalone runner. Will be responsible for exposing the web services in an embedded jetty 
 * server. <br><br>This will serve as the entry point of the application when the command<br> <code>[~]$ mvn spring-boot:run</code>
 * will be executed
 * 
 * @author saifasif
 *
 */
public class StandAloneClient {

    public static void main(String[] args) {
        // I need some logging here
        BasicConfigurator.configure();

        // Fire the controller
        SpringApplication.run(MyRestServicesController.class, args);
    }

}
