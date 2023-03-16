import static javax.swing.JOptionPane.*;

class Tallspill {
    public int nyttTall() {
        int trekk = (int) (Math.random() * 201);
        return trekk;
    }

    public void visMelding(String melding) {
        showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
        visMelding(tall + " er for lite! Prøv igjen!");

    }

    private void forStort(int tall) {
        visMelding(tall + " er for stort! Prøv igjen!");

    }

    public void avsluttRunde(int antall, int gjetning) {
        visMelding("Gratulerer " + gjetning + " er riktig!" + " Du gjettet riktig på " + antall + " forsøk");
    }

    public void kjorSpill() {
        int tilfeldigtall = nyttTall();
        int randomtall = 0;
        int teller = 0;
        while (randomtall != tilfeldigtall) {
            teller++;
            String randomTall = showInputDialog("Jeg tenker på et tall mellom 0 og 200. Prøv å gjette på tallet: ");
            randomtall = Integer.parseInt(randomTall);
            if (randomtall == tilfeldigtall) {
                avsluttRunde(teller, randomtall);
            } else if (randomtall < tilfeldigtall) {
                forLite(randomtall);
            } else {
                forStort(randomtall);
            }
        }
    }
}

public class Oppg2 {
    public static void main(String[] args) {
        Tallspill spill1 = new Tallspill();
        spill1.kjorSpill();

    }
}
