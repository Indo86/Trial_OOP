package G3D;

import G2D.Jajargenjang;
import G2D.Trapesium;

public class LimasJajarGenjang extends Jajargenjang {
    private float luasPermukaan, volume, tinggi;

    public LimasJajarGenjang(float tinggiLimas, float AlasJajargenjang, float tinggiJajarGenjang,
            float gapAlasDanAtapJajarGenjang) {
        super(AlasJajargenjang, tinggiJajarGenjang, gapAlasDanAtapJajarGenjang);
        this.tinggi = tinggiLimas;
        volume = getLuas() * this.tinggi / 3;

        // menentukan titik pusat
        float diagonal1 = Trapesium.PytagorasTambah(
                getAlas() - getGapAlasDanAtap(),
                getTinggiJajarGenjang());
        float diagonal2 = Trapesium.PytagorasTambah(
                getAlas() + getGapAlasDanAtap(),
                getTinggiJajarGenjang());
        float s = (getAlas() + diagonal1 / 2 + diagonal2 / 2) / 2;
        float segitiga1 = (float) Math.sqrt(
                s * (s - getAlas()) *
                        (s - diagonal1 / 2) *
                        (s - diagonal2 / 2));
        s = (getSisiSamping() + diagonal1 / 2 + diagonal2 / 2) / 2;
        float segitiga2 = (float) Math.sqrt(
                s * (s - getSisiSamping()) *
                        (s - diagonal1 / 2) *
                        (s - diagonal2 / 2));
        luasPermukaan = getLuas() + 2 * segitiga1 + 2 * segitiga2;
    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getTinggiLimas() {
        return tinggi;
    }
}
