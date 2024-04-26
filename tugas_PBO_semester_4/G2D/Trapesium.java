package G2D;

import java.lang.*;
import java.util.Scanner;

public class Trapesium extends DuaDimensi {
    private float alas, atap, sisiSamping, tinggi, gap, diagonal1, diagonal2;

    public Trapesium(float alas, float atap, float sisiSamping) {
        Scanner sc = new Scanner(System.in);
        // error handle untuk inputan yang tidak sesuai

        try {
            if (alas > atap) {
                gap = (alas - atap) / 2;
            } else if (alas < atap) {
                gap = (atap - alas) / 2;
            } else {
                throw new Error("Alas dan atap tidak boleh sama. IDIOT");
            }

        } catch (Error e) {
            System.out.println(e.getMessage());

        }

        this.alas = alas;
        this.atap = atap;
        this.sisiSamping = sisiSamping;
        keliling = alas + atap + sisiSamping * 2;

        tinggi = PytagorasKurang(sisiSamping, gap);
        if (alas > atap) {
            diagonal1 = PytagorasTambah(tinggi, alas - gap);
        } else if (atap > alas) {
            diagonal1 = PytagorasTambah(tinggi, atap - gap);
        }
        luas = (alas + atap) * tinggi / 2;
    }

    public float getAlas() {
        return alas;
    }

    public float getAtap() {
        return atap;
    }

    public float getTinggiTrapesium() {
        return tinggi;
    }

    public static float PytagorasTambah(float a, float b) {
        return (float) Math.sqrt(a * a + b * b);
    }

    public static float PytagorasKurang(float dikurangi, float mengurangi) {
        return (float) Math.sqrt(dikurangi * dikurangi - mengurangi * mengurangi);
    }

    public float getDiagonal1() {
        return diagonal1;
    }

    public float getDiagonal2() {
        return diagonal2;
    }

    public float getSisiSamping() {
        return sisiSamping;
    }

    public float getGap() {
        return gap;
    }
}