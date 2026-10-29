package pertemuan6;

public class Lingkaran extends BangunDatar {
    float jari;
    final float PI = 3.14f;

    public Lingkaran(float jari) {
        this.jari = jari;
    }

    public void luas() {
        luas = PI * jari * jari;
        System.out.println("Luas Lingkaran = " + luas);
    }

    public void keliling() {
        keliling = 2 * PI * jari;
        System.out.println("Keliling Lingkaran = " + keliling);
    }
}