package org.example.date.utils.model;

import org.example.date.utils.exceptions.DateUtilException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MonthTest {

    @Test
    public void validMonth(){
        Assert.assertEquals(Month.of(1).name(),"January");
    }

    @Test
    public void validMonthShortName(){
        Assert.assertEquals(Month.of(1).getShortName(),"Jan");
    }

    @Test
    public void invalidMonth(){
        Throwable throwable = null;
        try{
            Month.of(13).getShortName();
        }catch(DateUtilException due){
            throwable = due;
        }
        Assert.assertNotNull(throwable);
    }
}
