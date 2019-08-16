package com.amydegregorio.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
   private Logger logger = LoggerFactory.getLogger(LoggingController.class);

   @GetMapping("/")
   public String defaultLogging() {
      logger.trace("Trace message with SLF4j");
      logger.debug("Debug message with SLF4j");
      logger.info("Info message with SLF4j");
      logger.warn("Warn message with SLF4j");
      logger.error("Error message with SLF4j");
      
      return "Successfully logged messages";
   }
}
