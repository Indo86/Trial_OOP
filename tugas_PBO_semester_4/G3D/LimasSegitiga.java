package G3D;

import G2D.Segitiga;

public class LimasSegitiga extends Segitiga {
    private float luasLimas3, volumeLimas3;
    private float tinggiLimas3, jarakAlasSegi3KeTitik, jarakSisMirSegi3KeTitik;

    public LimasSegitiga(float alasSegi3, float tinggiSegi3, float tinggiLimas3) {
        super(alasSegi3, tinggiSegi3);
        this.tinggiLimas3 = tinggiLimas3;
        // atau mencari titik tengah limas
        // kasusnya segitiga sama kaki
        // 1/2 alas : 1/2 miring
        // misal 2 : 3
        // panjang tinggi dari bawah = 2/5 x tinggi segitiga
        // tinggi * a/(a+b) , dimana a = alassegi3/2 dan b = sisiMiring/2
        jarakAlasSegi3KeTitik = tinggiSegi3 * (getAlas() / 2) / (getAlas() / 2 + getSisiMiring() / 2);
        jarakSisMirSegi3KeTitik = tinggiSegi3 * (getSisiMiring() / 2) / (getAlas() / 2 + getSisiMiring() / 2);
        luasLimas3 = getLuas() +
                ((float) Math.sqrt(
                        jarakAlasSegi3KeTitik * jarakAlasSegi3KeTitik +
                                tinggiLimas3 * tinggiLimas3)
                        * getAlas() / 2)
                +
                (((float) Math.sqrt(
                        jarakSisMirSegi3KeTitik * jarakSisMirSegi3KeTitik +
                                tinggiLimas3 * tinggiLimas3)
                        * getSisiMiring()));
        // tdk perlu dikali 2 karena nanti dibagi 2
        volumeLimas3 = getLuas() * tinggiLimas3 / 3;
    }

    public float getLuasPermukaan() {
        return luasLimas3;
    }

    public float getVolume() {
        return volumeLimas3;
    }

    public float getTinggiLimas() {
        return tinggiLimas3;
    }

    public float getJarakAlasSegi3KeTitik() {
        return jarakAlasSegi3KeTitik;
    }

    public float getJarakSisMirSegi3KeTitik() {
        return jarakSisMirSegi3KeTitik;
    }
}
