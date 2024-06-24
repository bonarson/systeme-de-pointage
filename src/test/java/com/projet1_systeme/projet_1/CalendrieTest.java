package com.projet1_systeme.projet_1;

import com.projet1_systeme.projet_1.calandar.Calendrie;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendrieTest {

    @Test
    public void est_une_jour_ferie() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendrie calandar = new Calendrie();
        calandar.ajouterJourFerie(sdf.parse("2024-06-01"));
        List<String> tab = Arrays.asList("Sat Jun 01 00:00:00 EAT 2024");
        String expected = tab.get(0);
        String  result = String.valueOf(calandar.afficherJoursFeries().get(0));
        assertEquals(expected,result);

    }
}
