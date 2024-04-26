package G3D;

import G2D.PersegiPanjang;

public class BalokPersegiPanjang extends PersegiPanjang {
    private float luasPermukaan, volume, tinggi;

    public BalokPersegiPanjang(float panjang, float lebar, float tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        luasPermukaan = (2 * getLuas()) + (2 * getPanjang() * this.tinggi) + (2 * getLebar() * this.tinggi);
        volume = getLuas() * this.tinggi;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getVolume() {
        return volume;
    }

    public float getTinggiBalok() {
        return tinggi;
    }

}