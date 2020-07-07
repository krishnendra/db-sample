package org.example.date.utils.model;

import org.example.date.utils.exceptions.DateUtilException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WeekTest {

    @Test
    public void validWeek(){
        Assert.assertEquals(Week.of(0).name(),"SUNDAY");
    }

    @Test
    public void invalidWeek(){
        Throwable throwable = null;
        try{
            Week.of(13).name();
        }catch(DateUtilException due){
            throwable = due;
        }
        Assert.assertNotNull(throwable);
    }
}
