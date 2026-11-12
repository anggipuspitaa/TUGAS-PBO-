
package pertemuan7;

public class Lingkaran extends BangunDatar {
    private float jari;

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    @Override
    protected float luas() {
        return 3.14f * jari * jari;
    }

    @Override
    protected float keliling() {
        return 2 * 3.14f * jari;
    }
}
