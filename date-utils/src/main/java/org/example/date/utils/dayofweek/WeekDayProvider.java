package org.example.date.utils.dayofweek;

import org.example.date.utils.model.Week;

public interface WeekDayProvider {

    Week getDayofWeek(short day, short month , int year);
}
