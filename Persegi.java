
package pertemuan7;

public class Persegi extends BangunDatar {
    private float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    @Override
    protected float luas() {
        return sisi * sisi;
    }

    @Override
    protected float keliling() {
        return 4 * sisi;
    }
}

