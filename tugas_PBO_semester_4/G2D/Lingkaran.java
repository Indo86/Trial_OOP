package G2D;

public class Lingkaran extends DuaDimensi {
    private final float phi = (float) Math.PI;
    private float jari, diameter;

    public Lingkaran(float jari) {
        this.jari = jari;
        this.diameter = jari * 2;
        keliling = phi * this.diameter;
        luas = phi * jari * jari;
    }

    public float getJari() {
        return jari;
    }

    public float getDiameter() {
        return diameter;
    }

    public float getPhi() {
        return this.phi;
    }
}
