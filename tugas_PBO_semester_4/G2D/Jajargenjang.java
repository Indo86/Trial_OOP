package G2D;

public class Jajargenjang extends DuaDimensi {
    float alas, tinggi, gapAlasDanAtap, sisiSamping;

    public Jajargenjang(float alas, float tinggi, float gapAlasDanAtap) {
        // error handle
        if (gapAlasDanAtap > 0 && gapAlasDanAtap < alas) {
            this.gapAlasDanAtap = gapAlasDanAtap;
        } else {
            throw new Error("Ukuran harus 0 < gapAlas&Atap < alas. Ulangi!");
        }

        this.alas = alas;
        this.tinggi = tinggi;

        keliling = 2 * (alas + gapAlasDanAtap);
        luas = alas * tinggi;
        this.sisiSamping = Trapesium.PytagorasTambah(gapAlasDanAtap, tinggi);
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggiJajarGenjang() {
        return tinggi;
    }

    public float getGapAlasDanAtap() {
        return gapAlasDanAtap;
    }

    public float getSisiSamping() {
        return sisiSamping;
    }

}
