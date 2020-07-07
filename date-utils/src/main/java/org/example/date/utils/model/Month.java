package org.example.date.utils.model;

import org.example.date.utils.exceptions.DateUtilException;

public enum Month {

    January("Jan"),
    February("Feb"),
    March("Mar"),
    April("Apr"),
    May("May"),
    June("Jun"),
    July("Jul"),
    August("Aug"),
    September("Sep"),
    October("Oct"),
    November("Nov"),
    December("Dec");

    private String shortName;

    Month(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    private static final Month[] ENUMS = values();

    public static Month of(int index) {
        if (index >= 1 && index <= 12) {
            return ENUMS[index - 1];
        } else {
            throw new DateUtilException("Invalid value for MonthOfYear: " + index);
        }
    }

    public int maxLength() {
        switch(this) {
            case February:
                return 29;
            case April:
            case June:
            case September:
            case November:
                return 30;
            default:
                return 31;
        }
    }
}
