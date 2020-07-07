package org.example.date.utils.validation;

import org.example.date.utils.model.DateTime;
import org.example.date.utils.model.Month;

public class MaxDaysValidator extends Validator {

    @Override
    public boolean isValid(DateTime dateTime) {
        if(dateTime.getDate().getDay() > Month.of(dateTime.getDate().getMonth()).maxLength()){
            return false;
        }

        return true;
    }
}
