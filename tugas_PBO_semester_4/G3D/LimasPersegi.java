package G3D;

import G2D.Persegi;

public class LimasPersegi extends Persegi {
    private float volume, luasPermukaan;
    private int tinggi;

    public LimasPersegi(float sisi, float tinggi) {
        super(sisi);
        this.tinggi = Math.round(tinggi);
        volume = getLuas() * this.tinggi / 3;
        luasPermukaan = getLuas() + (2
                * (getSisi() * (float) Math.sqrt((getSisi() / 2) * (getSisi() / 2) + (this.tinggi * this.tinggi))));
        // cukup dikali 2 karena ada 4 permukaan segitiga
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getVolume() {
        return volume;
    }

    public int getTinggiLimas() {
        return tinggi;
    }
}
