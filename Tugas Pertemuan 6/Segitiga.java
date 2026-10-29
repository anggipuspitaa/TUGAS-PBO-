package pertemuan6;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    float sisiB;
    float sisiC;

    public Segitiga(float alas, float tinggi, float sisiB, float sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public void luas() {
        luas = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga = " + luas);
    }

    public void keliling() {
        keliling = alas + sisiB + sisiC;
        System.out.println("Keliling Segitiga = " + keliling);
    }
}