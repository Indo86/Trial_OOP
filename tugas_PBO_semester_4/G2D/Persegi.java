package G2D;

public class Persegi extends DuaDimensi {
    float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
        keliling = 4 * sisi;
        luas = sisi * sisi;
    }

    public float getSisi() {
        return sisi;
    }
}
