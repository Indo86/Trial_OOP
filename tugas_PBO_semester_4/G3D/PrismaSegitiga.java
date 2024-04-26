package G3D;

import G2D.Segitiga;

public class PrismaSegitiga extends Segitiga {
    private float luasPrisma3, volumePrisma3;
    private float tinggi;

    public PrismaSegitiga(float tinggiPrisma, float alasSegi3, float tinggiSegitiga) {
        super(alasSegi3, tinggiSegitiga);
        this.tinggi = tinggiPrisma;
        luasPrisma3 = getLuas() * 2 +
                (this.tinggi * getAlas()) +
                (2 * (this.tinggi * (float) (Math.sqrt(
                        getTinggi() * getTinggi() + (getAlas() / 2) * (getAlas() / 2)))));
        volumePrisma3 = getLuas() * this.tinggi;
    }

    public float getLuasPermukaan() {
        return luasPrisma3;
    }

    public float getVolume() {
        return volumePrisma3;
    }

    public float getTinggiPrisma() {
        return tinggi;
    }
}
