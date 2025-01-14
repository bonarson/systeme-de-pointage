package com.projet1_systeme.projet_1;

import com.projet1_systeme.projet_1.calandar.CalendarJune;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendrieTest {

    @Test
    public void isHolidaysDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        CalendarJune calandar = new CalendarJune();
        calandar.addHoliday(sdf.parse("2024-06-17"));
        List<String> tab = Arrays.asList("Mon Jun 17 00:00:00 EAT 2024");
        String expected = tab.get(0);
        String result = String.valueOf(calandar.displayHolidays().get(0));
        assertEquals(expected, result);

    }

    @Test
    public void sumOfNumberWorkingthrows() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        CalendarJune calendarJune = new CalendarJune();

        int expectedRakoto = 420;
        int expectedRabe = 588;
        for (int i = 0; i < 42; i++) {
            calendarJune.addPointage(sdf.parse("2024-05-" + (26 + i) + ""), 10, "STD22108", "Jour");
            calendarJune.addPointage(sdf.parse("2024-05-" + (26 + i) + ""), 14, "STD22104", "Nuit");
        }
        System.out.println(calendarJune.displayPointages());
        assertEquals(expectedRakoto, calendarJune.sumOfNumberWorking("STD22108"));

    }

    @Test
    public void salaryGuardian() {
        // Rabe
        double salaryBrutRabe = 788970.0;
        double salaryNetRabe = 631176.0;
        double salaryRabe = 788970.0;
        // Rakoto
        double salaryBrutRakoto = 606900.0;
        double salaryNetRakoto = 485520.0;
        double salaryRakoto = 606900.0;
        CalendarJune calendarJune = new CalendarJune();
        assertEquals(salaryRakoto, calendarJune.salaryGuardian(420, "STD22108", 1));
        assertEquals(salaryBrutRakoto, calendarJune.salaryBrut());
        assertEquals(salaryNetRakoto, calendarJune.salaryNet());

        assertEquals(salaryRabe, calendarJune.salaryGuardian(588, "STD22104", 1));
        assertEquals(salaryBrutRabe, calendarJune.salaryBrut());
        assertEquals(salaryNetRabe, calendarJune.salaryNet());
    }

}
