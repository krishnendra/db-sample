package org.example.date.utils.dayofweek;

import org.example.date.utils.dayofweek.keyval.KeyValWeekDayProviderImpl;
import org.example.date.utils.model.Week;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class WeekDayProviderTest {


    //private WeekDayProvider zellerWeekDayProvider = new WeekDayProviderImpl();
    private WeekDayProvider keyValWeekDayProvider = new KeyValWeekDayProviderImpl();

    public static LocalDate getRandomDate() {
        int twoThousandYears = 2000 * 365;
        return LocalDate.ofEpochDay(ThreadLocalRandom.current().nextInt(-twoThousandYears, twoThousandYears));
    }

    //3811-01-08
    /*
    @Test
    public void testGivenDate(){
        LocalDate localDate = LocalDate.of(3811,1,8);
        Week week = zellerWeekDayProvider.getDayofWeek((short)localDate.getDayOfMonth(),(short) localDate.getMonth().getValue(),localDate.getYear());
        Assert.assertEquals(week.toString(),localDate.getDayOfWeek().name());
    }
     */

    //0027-07-07
    @Test
    public void testGivenDateKeyVal(){
        LocalDate localDate = LocalDate.of(27,7,7);
        Week week = keyValWeekDayProvider.getDayofWeek((short)localDate.getDayOfMonth(),(short) localDate.getMonth().getValue(),localDate.getYear());
        Assert.assertEquals(week.toString(),localDate.getDayOfWeek().name());
    }

    //2555-09-27
    @Test
    public void testGivenDateKeyVal1(){
        LocalDate localDate = LocalDate.of(2555,9,27);
        Week week = keyValWeekDayProvider.getDayofWeek((short)localDate.getDayOfMonth(),(short) localDate.getMonth().getValue(),localDate.getYear());
        Assert.assertEquals(week.toString(),localDate.getDayOfWeek().name());
    }

    //2500-11-10
    @Test
    public void testGivenDateKeyVal2(){
        LocalDate localDate = LocalDate.of(2500,11,10);
        Week week = keyValWeekDayProvider.getDayofWeek((short)localDate.getDayOfMonth(),(short) localDate.getMonth().getValue(),localDate.getYear());
        Assert.assertEquals(week.toString(),localDate.getDayOfWeek().name());
    }

    //0000-01-25
    //Note : Zeller method fails here but key val succeeds as year = year - 1 becomes negative
    @Test
    public void testGivenDateKeyVal3(){
        LocalDate localDate = LocalDate.of(0000,01,25);
        Week week = keyValWeekDayProvider.getDayofWeek((short)localDate.getDayOfMonth(),(short) localDate.getMonth().getValue(),localDate.getYear());
        Assert.assertEquals(week.toString(),localDate.getDayOfWeek().name());
    }
    
    /*
    @Test
    public void testGivenDateZeller3(){
        LocalDate localDate = LocalDate.of(0000,01,25);
        Week week = zellerWeekDayProvider.getDayofWeek((short)localDate.getDayOfMonth(),(short) localDate.getMonth().getValue(),localDate.getYear());
        Assert.assertEquals(week.toString(),localDate.getDayOfWeek().name());
    }

    @Test
    public void testDayOfWeekCalculatorZeller(){
        for(int i = 0; i< 10000 ;i++){
            LocalDate localDate = getRandomDate();
            if(localDate.getYear() <= 0){
                continue;
            }
            System.out.println((i+1)+"->"+localDate.toString());
            Week week = zellerWeekDayProvider.getDayofWeek((short)localDate.getDayOfMonth(),(short) localDate.getMonth().getValue(),localDate.getYear());
            Assert.assertEquals(week.toString(),localDate.getDayOfWeek().name());
        }
    }
     */

    @Test
    public void testDayOfWeekCalculatorKeyVal(){
        for(int i = 0; i< 10000 ;i++){
            LocalDate localDate = getRandomDate();
            if(localDate.getYear()< 0){
                continue;
            }
            //System.out.println((i+1)+"->"+localDate.toString());
            Week week = keyValWeekDayProvider.getDayofWeek((short)localDate.getDayOfMonth(),(short) localDate.getMonth().getValue(),localDate.getYear());
            Assert.assertEquals(week.toString(),localDate.getDayOfWeek().name());
        }
    }

}
