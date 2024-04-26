package G2D;

public class Elips extends DuaDimensi {
    final float phi = (float) Math.PI;
    float diagonal1, diagonal2;

    public Elips(float diagonal1, float diagonal2) {
        // handler agar inputan sesuai dengan sifat geometrinya
        if (diagonal1 == diagonal2) {
            throw new Error("Panjang diagonal tidak boleh sama.");
        }

        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        keliling = 2 * phi * (float) Math.sqrt(
                (((diagonal1 / 2) * (diagonal1 / 2)) + ((diagonal2 / 2) * (diagonal2 / 2))) / 2);
        luas = phi * (diagonal1 / 2) * (diagonal2 / 2);
    }

    public float getDiagonal1() {
        return diagonal1;
    }

    public float getDiagonal2() {
        return diagonal2;
    }

    public float getPhi() {
        return phi;
    }

}
