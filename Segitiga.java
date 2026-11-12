
package pertemuan7;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    @Override
    protected float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    protected float keliling() {
        float sisiMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}

