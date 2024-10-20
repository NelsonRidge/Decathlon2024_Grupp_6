package decathlon;

import common.*;

public class DecaPoleVault {

    private double A = 0.2797;
    private double B = 100;
    private double C = 1.35;
    CalcTrackAndField calc = new CalcTrackAndField();

    // Calculate the score based on distance and height. Measured in centimetres.
    public int calculateResult(double distance) throws InvalidResultException {

        if (distance < 0) {
            throw new InvalidResultException("Value too low");
        } else if (distance > 1000) {
            throw new InvalidResultException("Value too high");
        }

        return calc.calculateField(A, B, C, distance);
    }
}