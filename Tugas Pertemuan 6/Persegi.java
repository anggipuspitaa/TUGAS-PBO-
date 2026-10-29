package pertemuan6;

public class Persegi extends BangunDatar {
    float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    public void luas() {
        luas = sisi * sisi;
        System.out.println("Luas Persegi = " + luas);
    }

    public void keliling() {
        keliling = 4 * sisi;
        System.out.println("Keliling Persegi = " + keliling);
    }
}