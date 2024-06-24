package com.projet1_systeme.projet_1.model;

import java.util.Date;

public class Pointage {
    private Date date;
   private int nombreHeures;

    private String NumeroMatricule;

    public Pointage(Date date, int nombreHeures, String numeroMatricule) {
        this.date = date;
        this.nombreHeures = nombreHeures;
        NumeroMatricule = numeroMatricule;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNombreHeures() {
        return nombreHeures;
    }

    public void setNombreHeures(int nombreHeures) {
        this.nombreHeures = nombreHeures;
    }

    public String getNumeroMatricule() {
        return NumeroMatricule;
    }

    public void setNumeroMatricule(String numeroMatricule) {
        NumeroMatricule = numeroMatricule;
    }

    @Override
    public String toString() {
        return "Pointage{" +
                "date=" + date +
                ", nombreHeures=" + nombreHeures +
                ", NumeroMatricule='" + NumeroMatricule + '\'' +
                '}';
    }
}
