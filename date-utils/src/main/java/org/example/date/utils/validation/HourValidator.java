package org.example.date.utils.validation;

import org.example.date.utils.model.DateTime;

public class HourValidator extends Validator {

    @Override
    public boolean isValid(DateTime dateTime) {
        if(dateTime.getTime().getHour() > 12){
            return false;
        }

        if(dateTime.getTime().getHour() < 1){
            return false;
        }
        
        return true;
    }
}
