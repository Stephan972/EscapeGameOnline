package com.ocr.gamePlay;

import java.util.Random;
import java.util.Scanner;

public class Defenceur extends Utilitaire{


    public Defenceur() {
    }


    @Override
    public int[] nbAleatoir() {
        return super.nbAleatoir();
    }

    @Override
    public int[] saisie() {
        return super.saisie();
    }

    /*
     * compared the number put for user with the number random
     *put the result in the String
     */

    @Override
    public String[] compared(int[] nb, int[] user) {
        return super.compared( nb, user );
    }

    @Override
    public boolean displayResut(String[] result) {
        return super.displayResut( result );
    }
}