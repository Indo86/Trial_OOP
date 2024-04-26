package G3D;

import G2D.Jajargenjang;

public class PrismaJajarGenjang extends Jajargenjang {
    private float volume, luasPermukaan, tinggi;

    public PrismaJajarGenjang(float alasJajarGenjang, float tinggiJajarGenjang, float gapAlasDanAtap,
            float tinggiPrisma) {
        super(alasJajarGenjang, tinggiJajarGenjang, gapAlasDanAtap);
        this.tinggi = tinggiPrisma;
        volume = getLuas() * this.tinggi;
        luasPermukaan = (2 * getLuas()) +
                (2 * getSisiSamping() * this.tinggi) +
                (2 * getAlas() * this.tinggi);
    }

    public float getVolume() {
        return volume;
    }

    public float getTinggiPrisma() {
        return tinggi;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }
}
