package G3D;

import G2D.Lingkaran;

public class Torus extends Lingkaran {
    private float volume, luasPermukaan, jaribesar;

    public Torus(float jari, float jaribesar) {
        super(jari);
        volume = getLuas() * getPhi() * 2 * jaribesar;
        luasPermukaan = 4 * getPhi() * getPhi() * jari * jaribesar;
    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getJariBesar() {
        return jaribesar;
    }
}
