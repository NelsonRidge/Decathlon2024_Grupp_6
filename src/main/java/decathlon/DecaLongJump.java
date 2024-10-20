package decathlon;

import common.*;

public class DecaLongJump {

    private double A = 0.14354;
    private double B = 220;
    private double C = 1.4;
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