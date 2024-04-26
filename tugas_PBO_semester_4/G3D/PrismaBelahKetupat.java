package G3D;

import G2D.Belahketupat;

public class PrismaBelahKetupat extends Belahketupat {
    private float volume, luasPermukaan, tinggi;

    public PrismaBelahKetupat(float diagVertical, float diagHorizontal, float tinggi) {
        super(diagVertical, diagHorizontal);
        this.tinggi = tinggi;
        volume = getLuas() * this.tinggi;
        luasPermukaan = 2 * getLuas() + (4 * this.tinggi * getSisiMiring());
    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getTinggiPrisma() {
        return tinggi;
    }

}