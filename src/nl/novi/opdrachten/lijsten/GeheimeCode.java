package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        addMembers(laResistanceMembers, "Arie");
        addMembers(laResistanceMembers, "Sjaak");
        addMembers(laResistanceMembers, "Henrie");
        addMembers(laResistanceMembers, "Piet");
        addMembers(laResistanceMembers, "LeDroitCestMoi");

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        // https://stackoverflow.com/questions/2451650/how-do-i-apply-the-for-each-loop-to-every-character-in-a-string
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        // https://www.tutorialspoint.com/java/lang/character_isuppercase.htm#:~:text=isUpperCase(char%20ch)%20determines%20if,category%20type%2C%20provided%20by%20Character.
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
        // https://beginnersbook.com/2014/02/java-program-to-check-even-or-odd-number/
         */

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */
    }

    private static void addMembers(List<String> members, String name) {
        members.add(name);
    }
}
