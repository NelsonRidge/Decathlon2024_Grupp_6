package decathlon;

import common.*;

public class DecaShotPut {

    private double A = 51.39;
    private double B = 1.5;
    private double C = 1.05;
    CalcTrackAndField calc = new CalcTrackAndField();

    // Calculate the score based on distance and height. Measured in meters.
    public int calculateResult(double distance) throws InvalidResultException {

        if (distance < 0) {
            throw new InvalidResultException("Value too low");
        } else if (distance > 30) {
            throw new InvalidResultException("Value too high");
        }

        return calc.calculateField(A, B, C, distance);
    }
}
