package org.example.date.utils.model;

import java.io.Serializable;

public class DateTime implements Serializable {
    
    private Date date;
    private Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }
    
    public String getDisplayDateTime(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(date.getDisplayName());
        stringBuilder.append("\n");
        stringBuilder.append(time.getDisplayName());
        stringBuilder.append("\n");
        stringBuilder.append(date.getDisplayDayOfWeek());
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
