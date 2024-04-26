package G2D;

public class Segitiga extends DuaDimensi {
    // segitiga sama kaki
    private float alas, tinggi, sisiMiring;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = (float) Math.sqrt(tinggi * tinggi + (alas / 2) * (alas / 2));
        keliling = alas + sisiMiring * 2;
        luas = alas * tinggi / 2;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public float getSisiMiring() {
        return sisiMiring;
    }
}
