package G3D;

import G2D.Trapesium;

public class LimasTrapesium extends Trapesium {
    private float luasPermukaan, volume, tinggi;

    public LimasTrapesium(float alas, float atap, float sisiSamping, float tinggiLimas) {
        super(alas, atap, sisiSamping);
        this.tinggi = tinggiLimas;
        volume = getLuas() * this.tinggi / 3;

        // mulai dari awal
        // titik antara diagonal
        // Gradien?
        float mAC = (getTinggiTrapesium() / (getAlas() - getGap()));
        float mBD = (-getTinggiTrapesium() / (getAlas() - getGap()));
        // menghitung titik potong x
        // y = m1X + c1 ---> garis AC --> pers *
        // y = m2X + c2 ---> garis BD --> pers **
        // m1X + c1 = m2X + c2
        // m1X - m2X = c2 - c1
        // X = (c2-c1) / (m1 - m2)
        //
        // y - y1 = m(x - x1)
        // y = mX - mX1 + y1
        // = mX + (C)
        //
        // C = (m * - x1) + y
        // c2 - c1 = (yb - (m2*xb)) - (ya - (m1*xa))
        // X = (c2 - c1) / (m1 - m2)
        float X = (super.getTinggiTrapesium() -
                (mBD * (super.getAlas() - super.getGap())) -
                (super.getTinggiTrapesium() -
                        (mAC * (super.getAlas() - super.getGap()))))
                /
                (mAC - mBD);
        // substitusikan X dengan salah satu pers garis
        float Y = (mAC * X) - (mAC * (getAlas() - getGap())) + getTinggiTrapesium();
        // X = kekanan
        // Y = ke atas
        float tinggiPermukaanDariAlas = PytagorasTambah(Y, getTinggiLimas());
        float tinggiPermukaanDariAtap = PytagorasTambah((getTinggiTrapesium() - Y), getTinggiLimas());
        float luasPermukaanDariAlas = getAlas() * tinggiPermukaanDariAlas / 2;
        float luasPermukaanDariAtap = getAtap() * tinggiPermukaanDariAtap / 2;

        float rusuk_kanan_atas = PytagorasTambah(tinggiPermukaanDariAtap, (getAtap() + getGap()) - X);
        // float rusuk_kiri_atas = PytagorasTambah(tinggiPermukaanDariAtap, X -
        // getGap());
        float rusuk_kanan_bawah = PytagorasTambah(tinggiPermukaanDariAlas, getAlas() - X);
        // float rusuk_kiri_bawah = PytagorasTambah(tinggiPermukaanDariAlas, X);

        float s = (rusuk_kanan_atas + rusuk_kanan_bawah + getSisiSamping()) / 2;
        float luasSegitigaSamping = (float) Math.sqrt(
                s * (s - rusuk_kanan_atas) * (s - rusuk_kanan_bawah) * (s - getSisiSamping()));
        luasPermukaan = getLuas() + luasPermukaanDariAlas + luasPermukaanDariAtap + luasSegitigaSamping * 2;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }

    public float getVolume() {
        return volume;
    }

    public float getTinggiLimas() {
        return this.tinggi;
    }
}
