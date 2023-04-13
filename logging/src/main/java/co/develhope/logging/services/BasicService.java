package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class BasicService {
    Logger logger= LoggerFactory.getLogger(BasicController.class);

    @Value("${customVar1}")
    int envVar1;

    @Value("${customVar2}")
    int envVar2;

    public String welcome(){
        logger.info("This is a Welcome message");
        return "Welcome User";
    }

    public String power(){
        logger.debug("The calculation is starting...");
        long result = (long)Math.pow(envVar1, envVar2);
        logger.debug("Calculation Done!");
        return "the result is "+ result;
    }

    public void errors() {
        logger.error("Custom error..");
    }
}