package hu.iit.me.controller;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestController
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ConversionFailedException.class)
    public Map<String, String> conversionExceptionHandler(
            ConversionFailedException cfe
    ){
        Map<String, String> message = new HashMap<>();
        message.put("Description", cfe.getMessage());
        message.put("Value", cfe.getValue().toString());
        message.put("Error", "Conversion failed!");
        return message;
    }


    @ExceptionHandler(java.lang.NumberFormatException.class)
    public Map<String, String> numberFormatExceptionHandler(NumberFormatException nfe) {
        Map<String, String> message = new HashMap<>();
        message.put("Description", nfe.getMessage());
        message.put("Error", "Number conversion failed!");
        return message;
    }

}
