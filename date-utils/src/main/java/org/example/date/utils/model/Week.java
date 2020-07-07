package org.example.date.utils.model;

import org.example.date.utils.exceptions.DateUtilException;

public enum Week {
    
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    private static final Week[] ENUMS = values();

    public static Week of(int index) {
        if (index >= 0 && index <= 6) {
            return ENUMS[index];
        } else {
            throw new DateUtilException("Invalid value for Day of Week: " + index);
        }
    }
}
