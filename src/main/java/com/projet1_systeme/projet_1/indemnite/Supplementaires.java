package com.projet1_systeme.projet_1.indemnite;

public class Supplementaires {

    public float calculSupplementaires(String categorieName, int nombreHeure) {
        if (categorieName.equals("norma")) {
            return (float) (nombreHeure * (2500 * 1.3));
        } else if (categorieName.equals("gardien")) {
            return (float) (nombreHeure * (1964 * 1.3));
        }
        return 0;
    }
}
