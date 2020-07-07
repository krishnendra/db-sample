package org.example.date.utils.validation;

import org.example.date.utils.model.DateTime;

public class DayValidator extends Validator {

    @Override
    public boolean isValid(DateTime dateTime) {
        
        if(dateTime.getDate().getDay() > 31){
            return false;
        }

        if(dateTime.getDate().getDay() <= 0){
            return false;
        }

        return true;
    }
}
