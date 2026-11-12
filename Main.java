
package pertemuan7;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("=== Persegi ===");
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(7);
        System.out.println("\n=== Lingkaran ===");
        System.out.println("Luas     : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());

        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(8);
        pp.setLebar(4);
        System.out.println("\n=== Persegi Panjang ===");
        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(3);
        segitiga.setTinggi(4);
        System.out.println("\n=== Segitiga ===");
        System.out.println("Luas     : " + segitiga.getLuas());
        System.out.println("Keliling : " + segitiga.getKeliling());
    }
}
