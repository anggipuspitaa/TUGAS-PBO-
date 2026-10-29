package pertemuan6;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        persegi.luas();
        persegi.keliling();
        System.out.println();

        Persegipanjang pp = new Persegipanjang(6, 4);
        pp.luas();
        pp.keliling();
        System.out.println();

        Lingkaran lingkaran = new Lingkaran(7);
        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();

        Segitiga segitiga = new Segitiga(3, 4, 4, 5);
        segitiga.luas();
        segitiga.keliling();
    }
}
