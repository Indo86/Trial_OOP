package G3D;

import G2D.Layanglayang;

public class PrismaLayang extends Layanglayang {
    private float luasPermukaan, volume, tinggi;

    public PrismaLayang(float diagonal1_layang, float diagonal2_layang, float jarakPuncakKeTitikPotong,
            float tinggiLimas) {
        super(diagonal1_layang, diagonal2_layang, jarakPuncakKeTitikPotong);
        this.tinggi = tinggiLimas;
        volume = getLuas() * this.tinggi;
        luasPermukaan = (2 * getLuas()) +
                (2 * (getSisiPanjang() * this.tinggi)) +
                (2 * (getSisiPendek() * this.tinggi));
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getVolume() {
        return volume;
    }

    public float getTinggiPrisma() {
        return tinggi;
    }
}
