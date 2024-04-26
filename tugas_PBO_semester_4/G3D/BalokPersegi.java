package G3D;

import G2D.Persegi;

public class BalokPersegi extends Persegi {
    private float volume, luasPermukaan, tinggi;

    public BalokPersegi(float sisi, float tinggi) {
        super(sisi);
        if (sisi != tinggi) {
            throw new Error("tinggi dan sisi harus sama.");
        }

        this.tinggi = tinggi;
        volume = getLuas() * tinggi;
        luasPermukaan = (2 * getLuas()) + (4 * (getSisi() * tinggi));
    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getTinggiBalok() {
        return tinggi;
    }

}