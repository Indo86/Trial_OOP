package G2D;

public class Belahketupat extends DuaDimensi {
    float diagVertical, diagHorizontal, sisiMiring;

    public Belahketupat(float diagVertical, float diagHorizontal) {

        // handler agar inputan sesuai dengan sifat geometrinya
        if (diagHorizontal != diagVertical) {
            throw new Error("Panjang diagonal harus sama. Ulangi!");
        }

        this.sisiMiring = Trapesium.PytagorasTambah(diagHorizontal / 2, diagVertical / 2);
        keliling = 4 * this.sisiMiring;
        luas = (diagVertical * diagHorizontal) / 2;
    }

    public float getDiagVertical() {
        return diagVertical;
    }

    public float getDiagHorizontal() {
        return diagHorizontal;
    }

    public float getSisiMiring() {
        return sisiMiring;
    }

}
