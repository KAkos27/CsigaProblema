package model;

public class Csigusz {

    public enum Szinek {
        PIROS, ZOLD, KEK
    }

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";

    private String nev;
    private final Szinek szinNev;
    private String szinKod;

    public Csigusz(String nev) throws Exception {
        this(nev, Szinek.PIROS);
    }

    public Csigusz(String nev, Szinek szinNev) throws Exception {
        setNev(nev);
        this.szinNev = szinNev;
        this.szinKod = RESET;
        setSzin();
    }

    private void setNev(String nev) throws Exception {
        if (nev.length() >= 3) {
            char elsoBetu = nev.charAt(0);

            if (Character.isLowerCase(elsoBetu)) {
                elsoBetu = Character.toUpperCase(elsoBetu);
                nev = elsoBetu + nev.substring(1);
            }
            this.nev = nev;
        } else {
            throw new Exception("Rövid a név!");
        }
    }

    private void setSzin() {
        switch (szinNev) {
            case PIROS:
                this.szinKod = Csigusz.RED;
                break;
            case KEK:
                this.szinKod = Csigusz.BLUE;
                break;
            case ZOLD:
                this.szinKod = Csigusz.GREEN;
                break;
        }
    }

    public String getNev() {
        return nev;
    }

    public String getSzin() {
        return szinKod;
    }

    @Override
    public String toString() {
        return szinKod + "Csigusz{" + "nev=" + nev + ", szinNev=" + szinNev + '}' + RESET;
    }

}
