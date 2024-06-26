package com.projet1_systeme.projet_1.indemnite;

public class Supplementaires {

    public Double calculSupplementaires(String categorieName, int nombreHeure,String serialNumber) {
        String serialRakoto = "STD22108";
        String serialRabe = "STD22104";
        if (categorieName.equals("norma")) {
            return (nombreHeure * (2500 * 1.3));
        } else if (categorieName.equals("gardien")) {
            if (serialNumber.equals(serialRakoto)){
                return (nombreHeure * (((1 * 100000 / 7) / 10) * 1.3));
            } else if (serialNumber.equals(serialRabe)) {
                return (nombreHeure * (((1 * 130000 / 7) / 14) * 1.3));

            }

        }
        return (double) 0;
    }
}
