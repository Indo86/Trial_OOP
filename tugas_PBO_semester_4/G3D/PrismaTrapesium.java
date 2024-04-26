package G3D;

import G2D.Trapesium;

public class PrismaTrapesium extends Trapesium {
    private float volume, luasPermukaan, tinggi;

    public PrismaTrapesium(float alasTrapesium, float atapTrapesium, float sisiSampingTrapesium, float tinggiLimas) {
        super(alasTrapesium, atapTrapesium, sisiSampingTrapesium);
        this.tinggi = tinggiLimas;
        volume = getLuas() * this.tinggi;
        luasPermukaan = (2 * getLuas()) +
                (getSisiSamping() * this.tinggi * 2) +
                (getAlas() * this.tinggi) +
                (getAtap() * this.tinggi);
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getVolume() {
        return volume;
    }

    public float getTinggiTrapesium() {
        return tinggi;
    }
}
