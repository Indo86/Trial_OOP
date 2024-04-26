package G3D;

import G2D.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {
    private float luasPermukaan, volume;
    private int tinggi;

    public LimasPersegiPanjang(float panjang, float lebar, float tinggi) {
        super(panjang, lebar);
        this.tinggi = Math.round(tinggi);
        luasPermukaan = getLuas() +
                ((float) Math.sqrt((getPanjang() / 2) * (getPanjang() / 2) +
                        this.tinggi * this.tinggi) * getLebar())
                +
                ((float) Math.sqrt((getLebar() / 2) * (getLebar() / 2) +
                        this.tinggi * this.tinggi) * getPanjang());
        // tidak perlu dibagi 2 karena bakal dikali 2
        volume = getLuas() * this.tinggi / 3;
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
