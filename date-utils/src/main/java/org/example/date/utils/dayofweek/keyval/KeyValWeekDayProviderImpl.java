package org.example.date.utils.dayofweek.keyval;

import org.example.date.utils.dayofweek.WeekDayProvider;
import org.example.date.utils.model.Week;
import org.example.date.utils.common.Utils;

public class KeyValWeekDayProviderImpl implements WeekDayProvider {

    @Override
    public Week getDayofWeek(short day, short month, int year) {

        int y = year;
        int weekIndex = year % 100;
        weekIndex = weekIndex/4;
        weekIndex = weekIndex + day;
        weekIndex = weekIndex + KeyValIndex.MONTH_KEY_INDEX[month-1];

        //is year a leap year and month is January or Feb
        if(Utils.isLeapyear(year) && (month ==1 || month ==2)){
            weekIndex = weekIndex - 1;
        }
        
        while ( y < 1700){
            y = y + 400;
        }

        while ( y >= 2100){
            y = y - 400;
        }

        int centuryIndex = (y / 100) - 17;
        weekIndex = weekIndex + KeyValIndex.CENTURY_KEY_INDEX[centuryIndex];
        weekIndex=  weekIndex + (year % 100);
        weekIndex = weekIndex % 7;
        
        weekIndex = weekIndex == 0 ? 6:(weekIndex -1);
        
        return Week.of(weekIndex);
    }

    
}
