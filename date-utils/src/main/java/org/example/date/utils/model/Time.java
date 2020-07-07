package org.example.date.utils.model;

import org.example.numeric.words.converter.NumericConverter;
import org.example.numeric.words.converter.impl.NumericConverterImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time {

    private final byte hour;
    private final byte minute;
    private final byte second;
    private final Meridian ampm;


    public Time(byte hour, byte minute, byte second, Meridian meridian) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.ampm = meridian;
    }

    public Meridian getAmpm() {
        return ampm;
    }

    public byte getHour() {
        return hour;
    }

    public byte getMinute() {
        return minute;
    }

    public byte getSecond() {
        return second;
    }

    private String getHourDisplay(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);

        NumericConverter converter = new NumericConverterImpl();
        String hourWord = converter.convertToWords(hour);
        return hourWord + " " + "Hours";
    }

    private String getMinuteDisplay(){
        NumericConverter converter = new NumericConverterImpl();
        String minuteWord = converter.convertToWords(minute);
        return minuteWord + " " + "Minutes";
    }

    private String getSecondDisplay(){
        NumericConverter converter = new NumericConverterImpl();
        String secondsWord = converter.convertToWords(second);
        return secondsWord + " " + "Seconds";
    }

    private String getMeridianDisplay(){
        return this.getAmpm().equals(Meridian.AM)?"Morning":"Evening";
    }

    public String getDisplayName(){
        return "Valid Time : " + getHourDisplay() + " " + getMinuteDisplay() + " "+ getSecondDisplay() + " " + getMeridianDisplay();
    }
}
