package org.example.date.utils.model;

import org.example.date.utils.dayofweek.WeekDayProvider;
import org.example.date.utils.dayofweek.keyval.KeyValWeekDayProviderImpl;
import org.example.numeric.words.converter.NumericConverter;
import org.example.numeric.words.converter.impl.NumericConverterImpl;

public class Date {


    private final short day;
    private final short month;
    private final int year;
    private Week week;
    private WeekDayProvider weekDayProvider;

    public Date(short day, short month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.weekDayProvider = new KeyValWeekDayProviderImpl();
        //this.week = this.weekDayProvider.getDayofWeek(day,month,year);
    }

    public short getDay() {
        return day;
    }

    public short getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Week getWeek() {
        return this.weekDayProvider.getDayofWeek(day,month,year);
    }

    private String getDisplayNameForDay(){
        String superscript = "\u1D57\u02B0";
        short remainder = (short) (this.day % 10);
        switch(remainder){
            case 1:
                superscript = "\u02E2\u1D57";
                break;
            case 2:
                superscript = "\u207F\u1D48";
                break;
            case 3:
                superscript = "\u02B3\u1D48";
                break;
        }


        return day + superscript;
    }

    private String getDisplayNameForMonth(){
        return Month.of(month).toString();
    }

    private String getDisplayNameForYear(){
        int century = this.year / 100;
        int y = this.year % 100;
        NumericConverter converter = new NumericConverterImpl();
        String centuryWord = converter.convertToWords(century);
        String yearWord = converter.convertToWords(y);
        return centuryWord + " " + yearWord;
    }

    public String getDisplayName(){
        return "Valid Date : " + getDisplayNameForDay() + "-" + getDisplayNameForMonth() + "-"+ getDisplayNameForYear();
    }

    public String getDisplayDayOfWeek(){
        return "Day of Week: "+ getWeek();
    }


}
