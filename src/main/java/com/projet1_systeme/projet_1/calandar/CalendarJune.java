package com.projet1_systeme.projet_1.calandar;

import com.projet1_systeme.projet_1.model.Pointage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalendarJune {
    private List<Pointage> pointages;
    private List<Date> holidays;

    public CalendarJune() {
        this.pointages = new ArrayList<>();
        this.holidays = new ArrayList<>();
    }

    public void addHoliday(Date date) {
        holidays.add(date);
    }

    public boolean isHoliday(Date date) {
        java.util.Calendar cal1 = java.util.Calendar.getInstance();
        java.util.Calendar cal2 = java.util.Calendar.getInstance();

        cal1.setTime(date);
        for (Date holiday : holidays) {
            cal2.setTime(holiday);

            if (cal1.get(java.util.Calendar.YEAR) == cal2.get(java.util.Calendar.YEAR) &&
                    cal1.get(java.util.Calendar.MONTH) == cal2.get(java.util.Calendar.MONTH) &&
                    cal1.get(java.util.Calendar.DAY_OF_MONTH) == cal2.get(java.util.Calendar.DAY_OF_MONTH)) {
                return true;
            }
        }
        return false;
    }

    public void addPointage(Date date, int hours, String employeeId) {
        if (isHoliday(date)) {
            System.out.println("Holiday");
        } else {
            Pointage pointage = new Pointage(date, hours, employeeId);
            pointages.add(pointage);
        }
    }

    public List<Pointage> getPointages() {
        return pointages;
    }

    public List<Pointage> displayPointages() {
//        for (Pointage pointage : pointages) {
//            System.out.println(pointage);
//        }
        return pointages;
    }

    public List<Date> displayHolidays() {
//        for (Date holiday : holidays) {
//            System.out.println("Holiday: " + holiday);
//        }

        return holidays;
    }
    int x = 0;
    public int countHourNumber(String employeNumber) {

        for (int i = 0; i < displayPointages().size(); i++) {
            if (displayPointages().get(i).getNumeroMatricule().equals(employeNumber)) {
                x += displayPointages().get(i).getNombreHeures();
            }
        }
        return x;
    }
}
