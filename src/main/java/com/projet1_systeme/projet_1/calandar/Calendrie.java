package com.projet1_systeme.projet_1.calandar;

import com.projet1_systeme.projet_1.model.Pointage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendrie {
    private List<Pointage> pointages;
    private List<Date> joursFeries;

    public Calendrie() {
        this.pointages = new ArrayList<>();
        this.joursFeries = new ArrayList<>();
    }

    public void ajouterJourFerie(Date date) {
        joursFeries.add(date);
    }

    public boolean estJourFerie(Date date) {
        java.util.Calendar cal1 = java.util.Calendar.getInstance();
        java.util.Calendar cal2 = java.util.Calendar.getInstance();

        cal1.setTime(date);
        for (Date jourFerie : joursFeries) {
            cal2.setTime(jourFerie);

            if (cal1.get(java.util.Calendar.YEAR) == cal2.get(java.util.Calendar.YEAR) &&
                    cal1.get(java.util.Calendar.MONTH) == cal2.get(java.util.Calendar.MONTH) &&
                    cal1.get(java.util.Calendar.DAY_OF_MONTH) == cal2.get(java.util.Calendar.DAY_OF_MONTH)) {
                return true;
            }
        }
        return false;
    }

    public void ajouterPointage(Date date,int nombreHeures,String NumeroMatricule) {
        if (estJourFerie(date)) {
            System.out.println("jour ferie");
        } else {
            Pointage pointage = new Pointage(date,nombreHeures,NumeroMatricule);
            pointages.add(pointage);
        }
    }

    public List<Pointage> getPointages() {
        return pointages;
    }

    public void afficherPointages() {
        for (Pointage pointage : pointages) {
            System.out.println(pointage);
        }
    }

    public List<Date> afficherJoursFeries() {
        for (Date jourFerie : joursFeries) {
            System.out.println("jour ferie : " + jourFerie);
        }

        return joursFeries;
    }
}
