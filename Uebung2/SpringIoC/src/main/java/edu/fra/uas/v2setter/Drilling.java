package edu.fra.uas.v2setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//Drilling erbt vom Interface Work!!
public class Drilling implements Work {

    private static final Logger LOGGER = LoggerFactory.getLogger(Drilling.class);


    //Diese Methode wird ausm Interface gezogen und nun aufgebaut
    public void doWork() {
        LOGGER.info(" --> drill a hole into the wall");
    }
}
