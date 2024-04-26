package G3D;

import G2D.Layanglayang;
import G2D.Trapesium;

public class LimasLayang extends Layanglayang {
    private float volume, luasPermukaan, tinggi;

    public LimasLayang(float tinggi, float diagVertical, float diagHorizontal, float jarakPuncakKeTitikPotong) {
        super(diagVertical, diagHorizontal, jarakPuncakKeTitikPotong);
        this.tinggi = tinggi;
        // ada 3 jenis rusuk yang berbeda, kanan kiri sama, atas, dan bawah
        float rusukSamping = Trapesium.PytagorasTambah(getDiagHorizontal() / 2, this.tinggi);

        // menghitung jarak titik pusat ke ujung atas dan bawah dengan perbandingan
        // sisinya
        // float jarak_atas_ke_titik_pusat = PytagorasKecil(sisiPendek,
        // diagHorizontal/2);
        // float jarak_bawah_ke_titik_pusat = PytagorasKecil(sisiPanjang,
        // diagHorizontal/2);
        // 2 rusuk yang lain
        float rusuk_atas = Trapesium.PytagorasTambah(jarakPuncakKeTitikPotong, this.tinggi);
        float rusuk_bawah = Trapesium.PytagorasTambah(diagVertical - jarakPuncakKeTitikPotong, this.tinggi);
        float s = (rusuk_bawah + rusukSamping + getSisiPanjang()) / 2;
        float segitigaBesar = (float) Math.sqrt(
                s * (s - rusukSamping) *
                        (s - rusuk_bawah) *
                        (s - getSisiPanjang()));
        s = (rusuk_atas + rusukSamping + getSisiPendek()) / 2;
        float segitigaKecil = (float) Math.sqrt(
                s * (s - rusukSamping) *
                        (s - rusuk_atas) *
                        (s - getSisiPendek()));

        luasPermukaan = getLuas() + (2 * segitigaBesar) + (2 * segitigaKecil);

        volume = getLuas() * this.tinggi / 3;

    }

    public float getTinggiLimas() {
        return tinggi;
    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }
}
