package com.projet1_systeme.projet_1.employe;

import com.projet1_systeme.projet_1.model.Categorie;
import com.projet1_systeme.projet_1.model.Employe;
import lombok.Getter;

import java.util.Date;

@Getter

public class Normal extends Employe {
    public Normal(String nom, String prenom, String numeroMatricule, Date dateDembauche, Date dateDeFinDecontrat, float montantDuSalaire, Categorie categorie) {
        super(nom, prenom, numeroMatricule, dateDembauche, dateDeFinDecontrat, montantDuSalaire, categorie);
    }
}
