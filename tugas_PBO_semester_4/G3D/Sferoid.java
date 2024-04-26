package G3D;

import G2D.Elips;

public class Sferoid extends Elips {
    private float volume, luasPermukaan;

    public Sferoid(float diagonal1, float diagonal2) {
        super(diagonal1, diagonal2);
        volume = getPhi() * getDiagonal1() * getDiagonal2() * getDiagonal2() / 6;
        double alpha = Math.acos(diagonal2 / diagonal1);
        if (Math.sin(alpha) != 0) {
            luasPermukaan = (float) (2 * getPhi() * ((diagonal2 * diagonal2)
                    + ((diagonal2 * diagonal1 * alpha) / Math.sin(alpha))));
        } else {
            luasPermukaan = Float.NaN;
        }

    }

    public float getVolume() {
        return volume;
    }

    public float getLuasPermukaan() {
        return luasPermukaan;
    }
}
