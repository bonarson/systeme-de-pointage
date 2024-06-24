package com.projet1_systeme.projet_1;

import com.projet1_systeme.projet_1.calandar.Calendrie;
import com.projet1_systeme.projet_1.employe.Gardien;
import com.projet1_systeme.projet_1.model.Categorie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        SpringApplication.run(Projet1Application.class, args);

//        Calendrier calandar = new Calendrier();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        calandar.ajouterJourFerie(sdf.parse("2024-06-01"));
//
//        calandar.ajouterPointage(sdf.parse("2024-06-02"), creerHeure(9, 0), creerHeure(17, 0));
//
//        calandar.afficherJoursFeries();
//        calandar.afficherPointages();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Categorie categorie = new Categorie("gardient", 18, 2000, 0);
        Gardien gardien = new Gardien("Marius", "Lou", "STD22108", sdf.parse("2024-06-01"), sdf.parse("2024-06-01"), 9000, categorie);
        System.out.println(gardien);
        Calendrie calandar = new Calendrie();
        calandar.ajouterJourFerie(sdf.parse("2024-06-01"));
        calandar.ajouterPointage(sdf.parse("2024-06-02"),8, "STD22108");
        calandar.ajouterPointage(sdf.parse("2024-06-03"),4, "STD22108");
        System.out.println(calandar.afficherJoursFeries());
        calandar.afficherPointages();
        System.out.println("hjkcks");
        calandar.getPointages().get(0);

    }

}
