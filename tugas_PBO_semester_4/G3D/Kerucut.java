package G3D;

import G2D.Lingkaran;

public class Kerucut extends Lingkaran {
    private float volume, luasPermukaan, tinggi;

    public Kerucut(float tinggi, float jari) {
        super(jari);
        this.tinggi = tinggi;
        volume = getLuas() * this.tinggi / 3;
        luasPermukaan = getPhi() *
                getJari() *
                (getJari() + (float) Math.sqrt(
                        getJari() * getJari() +
                                this.tinggi * this.tinggi));
        // dimana s = sisiMiring dari kerucut
        // luas tudung kerucut = phi r s
    }

    public float getTinggiKerucut() {
        return tinggi;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getVolume() {
        return volume;
    }
}
