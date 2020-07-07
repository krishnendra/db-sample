package org.example.date.utils.validation;

import org.example.date.utils.common.Utils;
import org.example.date.utils.model.DateTime;

public class LeapYearValidator extends Validator {

    @Override
    public boolean isValid(DateTime dateTime) {
        
        if(Utils.isLeapyear(dateTime.getDate().getYear()) && dateTime.getDate().getMonth() == 2 && dateTime.getDate().getDay() > 29){
            return false;
        }

        if(!Utils.isLeapyear(dateTime.getDate().getYear()) && dateTime.getDate().getMonth() == 2 && dateTime.getDate().getDay() > 28){
            return false;
        }
        
        return true;
    }
}
