package tugas4;
import java.util.Scanner;

public class Main {

    // Class Sepeda berada di dalam file ini, jadi tidak perlu file lain
    static class Sepeda {
        private String merk;
        private int jarakTempuh;

        public Sepeda(String merk) {
            this.merk = merk;
            this.jarakTempuh = 0;
            System.out.println("- Object " + this.merk + " dibuat, jarak tempuh awal " + this.jarakTempuh + " km");
        }

        public void bergerakMaju() {
            jarakTempuh += 10;
            System.out.println("- Bergerak Maju 10 Km");
            System.out.println("- Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
        }

        public void bergerakMundur() {
            jarakTempuh -= 5;
            System.out.println("- Bergerak Mundur 5 Km");
            System.out.println("- Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
        }

        public void berhenti() {
            System.out.println("- Sepeda Berhenti");
            System.out.println("- Object Sepeda " + merk + ", Jarak tempuh akhir " + jarakTempuh + " Km");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Object Merk Sepeda: ");
        String merk = input.nextLine();
        Sepeda sepeda = new Sepeda(merk);

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    sepeda.bergerakMaju();
                    break;
                case 2:
                    sepeda.bergerakMundur();
                    break;
                case 3:
                    sepeda.berhenti();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("- Pilihan tidak valid");
            }
            System.out.println();
        } while (pilihan != 0);

        input.close();
    }
}



