package org.example.date.utils.exceptions;

public class DateUtilException extends RuntimeException {

    public DateUtilException(String message){
        super(message);
    }


    public DateUtilException(String message, Throwable error){
        super(message,error);
    }
}

