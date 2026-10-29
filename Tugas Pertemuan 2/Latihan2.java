package latihan;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Flowchart 1 Luas persegi panjang
        float panjang = 2;
        float lebar = 5;
        float luasPP;

        luasPP = panjang * lebar;

        System.out.println("=== Luas Persegi Panjang ===");
        System.out.println("Luas = " + luasPP);

        // Flowchart 2: Luas dan keliling lingkaran 
        float jari, keliling, luas;
        final float PI = 3.14f;

        System.out.println();
        System.out.println("=== Lingkaran ===");
        System.out.print("Masukkan jari-jari: ");
        jari = input.nextFloat();

        luas = PI * jari * jari;
        keliling = 2 * PI * jari;

        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);

        // Flowchart 3: Konversi waktu ke detik 
        int jam, menit, detik, totdet;

        System.out.println();
        System.out.println("=== Konversi Waktu ke Detik ===");
        System.out.print("Masukkan jam: ");
        jam = input.nextInt();
        System.out.print("Masukkan menit: ");
        menit = input.nextInt();
        System.out.print("Masukkan detik: ");
        detik = input.nextInt();

        totdet = jam * 3600 + menit * 60 + detik;

        System.out.println("Total detik = " + totdet);

        input.close();
    }
}
