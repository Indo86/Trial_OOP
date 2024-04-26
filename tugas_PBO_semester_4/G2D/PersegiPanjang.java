package G2D;

public class PersegiPanjang extends DuaDimensi {
    float panjang, lebar;
    float keliling, luas;

    public PersegiPanjang(float panjang, float lebar) {
        // handler agar inputan sesuai dengan sifat geometrinya
        if (panjang == lebar) {
            throw new Error("Ukuran panjang dan lebar tidak boleh sama.");
        }

        this.panjang = panjang;
        this.lebar = lebar;
        keliling = 2 * (panjang + lebar);
        luas = panjang * lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }
}
