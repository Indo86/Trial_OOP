package G3D;

import G2D.Belahketupat;
import G2D.Trapesium;

public class LimasBelahKetupat extends Belahketupat {
    private float volume, luasPermukaan, tinggi;

    public LimasBelahKetupat(float tinggi, float diagVertical, float diagHorizontal) {
        super(diagVertical, diagHorizontal);
        this.tinggi = tinggi;
        volume = getLuas() * tinggi / 3;

        float rusuk1 = Trapesium.PytagorasTambah(tinggi, diagHorizontal / 2);
        float rusuk2 = Trapesium.PytagorasTambah(tinggi, diagVertical / 2);
        float s = (rusuk1 + rusuk2 + getSisiMiring());
        float LuasSegitiga = (float) Math.sqrt(
                s * (s - rusuk1) *
                        (s - rusuk2) *
                        (s - getSisiMiring()));

        luasPermukaan = getLuas() + 4 * LuasSegitiga;

    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getTinggiLimas() {
        return tinggi;
    }
}
