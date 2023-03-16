import static javax.swing.JOptionPane.*;

public class Oppg1 {
    public static void main(String[] args) {
        String innGrense1 = showInputDialog("Skriv inn et tall");
        String innGrense2 = showInputDialog("Skriv inn et annet tall større enn forrige");
        int grense1 = Integer.parseInt(innGrense1);
        int grense2 = Integer.parseInt(innGrense2);
        if (grense2 <= grense1) {
            showMessageDialog(null, "Feil input! Prøv igjen og husk andre tallet skal være større enn første");
            innGrense1 = showInputDialog("Skriv inn et tall");
            innGrense2 = showInputDialog("Skriv inn et annet tall større enn forrige");
            grense1 = Integer.parseInt(innGrense1);
            grense2 = Integer.parseInt(innGrense2);
            if (grense2 > grense1) {
                int sum = 0;
                for (int i = grense1; i <= grense2; i++) {
                    sum += i;
                    if (i % 10 == 0) {
                        System.out.println();
                    }
                    if (i != grense2) {
                        System.out.print(i + " + ");
                    }
                    if (i == grense2) {
                        System.out.print(i + " = ");
                    }
                }
                System.out.println(sum);
            }
        } else {
            int sum = 0;
            for (int i = grense1; i <= grense2; i++) {
                sum += i;
                if (i % 10 == 0) {
                    System.out.println();
                }
                if (i != grense2) {
                    System.out.print(i + " + ");
                }
                if (i == grense2) {
                    System.out.print(i + " = ");
                }
            }
            System.out.println(sum);
        }
    }
}
