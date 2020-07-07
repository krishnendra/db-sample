package org.example.date.utils.validation;

import org.example.date.utils.model.DateTime;

public class MinuteValidator extends Validator {

    @Override
    public boolean isValid(DateTime dateTime) {
        if(dateTime.getTime().getMinute() > 59){
            return false;
        }

        if(dateTime.getTime().getMinute() < 0){
            return false;
        }
        
        return true;
    }
}
