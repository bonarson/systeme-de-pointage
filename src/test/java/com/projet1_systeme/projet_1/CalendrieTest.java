package com.projet1_systeme.projet_1;

import com.projet1_systeme.projet_1.calandar.CalendarJune;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendrieTest {

    @Test
    public void isHolidaysDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        CalendarJune calandar = new CalendarJune();
        calandar.addHoliday(sdf.parse("2024-06-01"));
        List<String> tab = Arrays.asList("Sat Jun 01 00:00:00 EAT 2024");
        String expected = tab.get(0);
        String result = String.valueOf(calandar.displayHolidays().get(0));
        assertEquals(expected, result);

    }

    @Test
    public void sumOfNumberWorkingthrows() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        CalendarJune calendarJune = new CalendarJune();
        int expected = 8;
        calendarJune.addPointage(sdf.parse("2024-06-01"), 8, "STD22108");
        calendarJune.addPointage(sdf.parse("2024-06-02"), 8, "STD22108");
        calendarJune.addPointage(sdf.parse("2024-06-03"), 8, "STD22104");
        assertEquals(expected,calendarJune.countHourNumber("STD22104"));

    }


}
