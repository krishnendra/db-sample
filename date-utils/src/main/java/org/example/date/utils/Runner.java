package org.example.date.utils;

import org.example.date.utils.model.Date;
import org.example.date.utils.model.DateTime;
import org.example.date.utils.model.Meridian;
import org.example.date.utils.model.Time;
import org.example.date.utils.validation.*;

public class Runner {

    public String execute(String value){

        String response = "";

        try{
            String day = value.substring(0,2);
            String month = value.substring(3,5);
            String year = value.substring(6,10);
            String hour = value.substring(11,13);
            String minute = value.substring(14,16);
            String sec = value.substring(17,19);
            String ampm = value.substring(20,22);

            short dayValue = Short.valueOf(day);
            short monthValue = Short.valueOf(month);
            int yearValue = Integer.valueOf(year);
            byte hourValue = Byte.valueOf(hour);
            byte minuteValue = Byte.valueOf(minute);
            byte secValue = Byte.valueOf(sec);

            DateTime dateTime = new DateTime(new Date(dayValue,monthValue,yearValue),new Time(hourValue,minuteValue,secValue, Meridian.valueOf(ampm)));
            Validator dateValidator = new DayValidator();
            dateValidator.addValidator(new MonthValidator());
            dateValidator.addValidator(new YearValidator());
            dateValidator.addValidator(new LeapYearValidator());
            dateValidator.addValidator(new HourValidator());
            dateValidator.addValidator(new MinuteValidator());
            dateValidator.addValidator(new SecondValidator());
            dateValidator.addValidator(new MaxDaysValidator());
            if(!dateValidator.validate(dateTime)){
                response = "Invalid Date :"+value;
            }else{
                response = dateTime.getDisplayDateTime();
            }
        }catch(NumberFormatException nfe){
            //TODO Not elegeant but advised against using any slf4j library
            response = "Invalid Input Format :"+value;
        }catch(IllegalArgumentException iae){
            //TODO Not elegeant but advised against using any slf4j library
            response = "Invalid Input Format :"+value;
        }catch(IndexOutOfBoundsException iobe){
            //TODO Not elegeant but advised against using any slf4j library
            response = "Invalid Input Format :"+value;
        }

        return response;
    }
}
