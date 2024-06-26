package com.projet1_systeme.projet_1.calandar;

import com.projet1_systeme.projet_1.indemnite.Supplementaires;
import com.projet1_systeme.projet_1.model.Pointage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CalendarJune {
    private List<Pointage> pointages;
    private List<Date> holidays;

    public CalendarJune() {
        this.pointages = new ArrayList<>();
        this.holidays = new ArrayList<>();
    }

    Supplementaires supplementaires = new Supplementaires();

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

    public void addPointage(Date date, int numberOfHours, String serialNumberEmployee, String status) {
        if (isHoliday(date)) {
            System.out.println("Holiday");
        } else {
            Pointage pointage = new Pointage(date, numberOfHours, serialNumberEmployee, status);
            pointages.add(pointage);
        }
    }

    public List<Pointage> getPointages() {
        return pointages;
    }

    public List<Pointage> displayPointages() {
        return pointages;
    }

    public List<Date> displayHolidays() {
        return holidays;
    }

    int x = 0;

    public int sumOfNumberWorking(String serialNumberEmployee) {

        for (int i = 0; i < displayPointages().size(); i++) {
            if (displayPointages().get(i).getSerialNumberEmployee().equals(serialNumberEmployee)) {
                x += displayPointages().get(i).getNumberOfHours();
            }
        }
        return x;
    }

    public Double salaryGuardian(int sumOfNumberWorking, String serialGuardian, int numberHolidays) {
        Double salary = (double) 0;
        String serialRakoto = "STD22108";
        String serialRabe = "STD22104";
        if (serialGuardian.equals(serialRakoto)) {
            if (sumOfNumberWorking <= 390) {
                salary = (double) (sumOfNumberWorking * ((1 * 100000 / 7) / 10));
            } else {
                salary = ((sumOfNumberWorking - (numberHolidays * 10)) * ((1 * 100000 / 7) / 10) +
                        supplementaires.calculSupplementaires("gardien",
                                numberHolidays * 10, serialGuardian));
            }

        } else if (serialGuardian.equals(serialRabe)) {
            if (sumOfNumberWorking <= 546) {
                salary = (double) (sumOfNumberWorking * ((1 * 130000 / 7) / 14));
            } else {
                salary = ((sumOfNumberWorking - (numberHolidays * 14)) * ((1 * 130000 / 7) / 14)) +
                        supplementaires.calculSupplementaires("gardien",
                                numberHolidays * 14, serialGuardian);
            }

        }
        return salary;
    }
}
