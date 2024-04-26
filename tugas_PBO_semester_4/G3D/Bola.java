package G3D;

import G2D.Lingkaran;

public class Bola extends Lingkaran {
    float luasPermukaan, volume;

    public Bola(float jari) {
        super(jari);
        volume = 4 * getPhi() *
                getJari() * getJari() * getJari() /
                3;
        luasPermukaan = 4 * getPhi() *
                getJari() * getJari();
    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }
}
