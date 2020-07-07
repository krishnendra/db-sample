package org.example.date.utils.validation;

import org.example.date.utils.model.DateTime;

public abstract class Validator {

    private Validator next;

    protected abstract boolean isValid(DateTime dateTime);

    public void addValidator(Validator next){
        if(this.next == null){
            this.next = next;
        }else{
            this.next.addValidator(next);
        }
    }

    public boolean validate(DateTime dateTime){
        boolean isValid = false;
        if(this.isValid(dateTime)){
            isValid = this.next != null ? this.next.validate(dateTime):true;
        }
        return isValid;
    }
}
