//Im Package Service befindet sich die Gescahaeftslogik der Anwendung!

package edu.fra.uas.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
import edu.fra.uas.BeanExampleApplication;

@Component
public class MessageService {

    private static final Logger log = (Logger) LoggerFactory.getLogger(BeanExampleApplication.class);
    private String message;
    
    public String getMessage() {
        log.debug("Returing message: " + message);
        return message;
    }

    public void setMessage(String message) {
        log.debug("Updating message from '{}' to '{}'", this.message, message);
        this.message = message;
    }
}