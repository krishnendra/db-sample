package org.example.date.utils.validation;

import org.example.date.utils.model.DateTime;

public class MonthValidator extends Validator {

    @Override
    public boolean isValid(DateTime dateTime) {
        
        if(dateTime.getDate().getMonth() > 12){
            return false;
        }

        if(dateTime.getDate().getMonth() < 1){
            return false;
        }
        
        
        return true;
    }
}
