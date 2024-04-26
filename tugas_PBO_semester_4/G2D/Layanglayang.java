package G2D;

public class Layanglayang extends DuaDimensi {
    float diagVertical, diagHorizontal, jarakPusatKePuncak, sisiPanjang, sisiPendek;

    public Layanglayang(float diagVertical, float diagHorizontal, float jarakPusatKePuncak) {
        this.diagVertical = diagVertical;
        this.diagHorizontal = diagHorizontal;
        this.jarakPusatKePuncak = jarakPusatKePuncak;
        this.sisiPanjang = Trapesium.PytagorasTambah(diagVertical - jarakPusatKePuncak, diagHorizontal / 2);
        this.sisiPendek = Trapesium.PytagorasTambah(diagHorizontal / 2, jarakPusatKePuncak);
        keliling = 2 * (sisiPanjang + sisiPendek);
        luas = (diagVertical * diagHorizontal) / 2;
    }

    public float getDiagVertical() {
        return diagVertical;
    }

    public float getDiagHorizontal() {
        return diagHorizontal;
    }

    public float getSisiPanjang() {
        return sisiPanjang;
    }

    public float getSisiPendek() {
        return sisiPendek;
    }
}
