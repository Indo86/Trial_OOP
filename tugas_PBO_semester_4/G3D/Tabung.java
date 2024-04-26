package G3D;

import G2D.Lingkaran;

public class Tabung extends Lingkaran {
    private float volume, luasPermukaan, tinggi;

    public Tabung(float tinggi, float jari) {
        super(jari);
        this.tinggi = tinggi;
        volume = getLuas() * this.tinggi;
        luasPermukaan = (2 * getLuas()) + (getKeliling() * tinggi);
    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getTinggiTabung() {
        return tinggi;
    }
}
