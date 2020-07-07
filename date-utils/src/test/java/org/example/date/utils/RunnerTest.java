package org.example.date.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunnerTest {

    Runner runner = new Runner();

    @Test
    public void testGivenDateStringValidDate(){
        String value = "01-02-2022 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertTrue(response.contains("Valid"));
        Assert.assertFalse(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringValidDate2(){
        String value = "02-02-2022 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertTrue(response.contains("Valid"));
        Assert.assertFalse(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringValidDate3(){
        String value = "03-02-2022 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertTrue(response.contains("Valid"));
        Assert.assertFalse(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringValidDatePM(){
        String value = "01-03-2022 12:00:00 PM";
        String response = runner.execute(value);
        Assert.assertTrue(response.contains("Valid"));
        Assert.assertFalse(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringLeapYearValid(){
        String value = "29-02-2004 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertTrue(response.contains("Valid"));
        Assert.assertFalse(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringMonthInValid(){
        String value = "29-00-2003 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringDayMaxInValid(){
        String value = "8450-02-2003 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringLeapYearInValid2(){
        String value = "30-02-2004 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringLeapYearInValid(){
        String value = "29-02-2003 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringDayInvalid(){
        String value = "31-09-2003 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringMonthInvalid(){
        String value = "31-13-2003 12:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringHourInvalid(){
        String value = "31-12-2003 13:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringHourInvalid2(){
        String value = "31-12-2003 00:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringLowerMonthInvalid(){
        String value = "00-12-2003 13:00:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringMinuteInvalid(){
        String value = "31-12-2003 12:60:00 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringSecondInvalid(){
        String value = "31-12-2003 12:59:60 AM";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }

    @Test
    public void testGivenDateStringMeridianInvalid(){
        String value = "31-12-2003 12:59:60 SS";
        String response = runner.execute(value);
        Assert.assertFalse(response.contains("Valid"));
        Assert.assertTrue(response.contains("Invalid"));
    }
}
