package pertemuan6;

public class Persegipanjang extends BangunDatar {
    float panjang;
    float lebar;

    public Persegipanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void luas() {
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
    }

    public void keliling() {
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang = " + keliling);
    }
}
