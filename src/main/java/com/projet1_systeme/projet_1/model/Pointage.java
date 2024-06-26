package com.projet1_systeme.projet_1.model;

import java.util.Date;

public class Pointage {
    private Date date;
    private int numberOfHours;

    private String serialNumberEmployee;
    private String status;

    public Pointage(Date date, int numberOfHours, String serialNumberEmployee, String status) {
        this.date = date;
        this.numberOfHours = numberOfHours;
        this.serialNumberEmployee = serialNumberEmployee;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public String getSerialNumberEmployee() {
        return serialNumberEmployee;
    }

    public void setSerialNumberEmployee(String serialNumberEmployee) {
        this.serialNumberEmployee = serialNumberEmployee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pointage{" +
                "date=" + date +
                ", numberOfHours=" + numberOfHours +
                ", serialNumberEmployee='" + serialNumberEmployee + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
