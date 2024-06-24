package com.projet1_systeme.projet_1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class Employe {
    private String nom;
    private String prenom;
    private String numeroMatricule;
    private Date dateDembauche;
    private Date dateDeFinDecontrat;
    private float montantDuSalaire;
    Categorie categorie;

    public int work(Calendar calendar, List<Pointage> pointageList){

        return 0;
    }



}
