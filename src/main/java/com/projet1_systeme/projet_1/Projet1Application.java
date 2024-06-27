package com.projet1_systeme.projet_1;


import com.projet1_systeme.projet_1.calandar.CalendarJune;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class Projet1Application {

    private static Date creerHeure(int heure, int minute) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(java.util.Calendar.HOUR_OF_DAY, heure);
        cal.set(java.util.Calendar.MINUTE, minute);
        cal.set(java.util.Calendar.SECOND, 0);
        cal.set(java.util.Calendar.MILLISECOND, 0);
        return cal.getTime();
    }


    public static void main(String[] args) throws ParseException {

//        SpringApplication.run(Projet1Application.class, args);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        CalendarJune calendarJune = new CalendarJune();
//        calendarJune.addPointage(sdf.parse("2024-06-01"), 8, "STD22108");
//        calendarJune.addPointage(sdf.parse("2024-06-02"), 8, "STD22108");
//        calendarJune.addPointage(sdf.parse("2024-06-03"), 8, "STD22104");
//
//
//        System.out.println(calendarJune.countHourNumber("STD22104"));
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        CalendarJune calendarJune = new CalendarJune();
//
//        int expectedRakoto = 420;
//        int expectedRabe = 588;
//        for (int i = 0; i < 42; i++) {
//            calendarJune.addPointage(sdf.parse("2024-05-"+(26+i)+""), 10, "STD22108", "Jour");
//           // calendarJune.addPointage(sdf.parse("2024-05-" + 26 + i + ""), 14, "STD22104", "Nuit");
//        }
//        System.out.println(calendarJune.displayPointages());

        CalendarJune calendarJune = new CalendarJune();
        System.out.println(calendarJune.salaryGuardian(588, "STD22104", 1));
        System.out.println("brut :"+ calendarJune.salaryBrut());
        System.out.println("net :"+ calendarJune.salaryNet());

    }

}
