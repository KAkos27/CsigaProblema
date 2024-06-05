package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Csigusz;

public class CsiguszProblema {

    public static void main(String[] args) {

        try {
            Csigusz cs1 = new Csigusz("cs-1");
            System.out.println(cs1.toString());

            Csigusz cs2 = new Csigusz("cs-2", Csigusz.Szinek.KEK);
            System.out.println(cs2.toString());

            Csigusz cs3 = new Csigusz("cs-3", Csigusz.Szinek.PIROS);
            System.out.println(cs3.toString());

            Csigusz cs4 = new Csigusz("cs-4", Csigusz.Szinek.ZOLD);
            System.out.println(cs4.toString());
        } catch (Exception ex) {
            Logger.getLogger(CsiguszProblema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
