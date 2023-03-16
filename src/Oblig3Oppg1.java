class UnikeTall {
    int lengde;
    int[] liste;// Deklarasjon av array for lagring av tilfeldige heltall

    public UnikeTall(int[] liste, int lengde) { /* Konstruktør som mottar arrayets lengde som parameter og oppretter arrayet.  */
        this.liste = liste;
        this.lengde = lengde;
    }

    public boolean finnesFraFor(int tall) {
        boolean finnes = true;
        for (int i : liste) {
            if (tall == i) {
                tall = i;
                return true;
            } else {
                return false;
            }
        }
        return finnes;
    }

    public void array() {
        for (int i = 0; i < lengde; i++) {
            liste[i] = (int) (Math.random() * (900) + 100);
        }
    }
    // Metode som finner og returnerer det minste tallet i arrayet.

    // Metode som finner og returnerer det største tallet i arrayet.

   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */

   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */
}
