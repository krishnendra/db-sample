package org.example.date.utils.validation;

import org.example.date.utils.model.DateTime;

public class YearValidator extends Validator {

    @Override
    protected boolean isValid(DateTime dateTime) {
        if(dateTime.getDate().getYear() < 0){
            return false;
        }
        return true;
    }
}
