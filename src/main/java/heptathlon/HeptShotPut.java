package heptathlon;

import common.CalcTrackAndField;
import common.InputResult;
import decathlon.InvalidResultException;

public class HeptShotPut {

    private int score;
    private double A = 56.0211;
    private double B = 1.5;
    private double C = 1.05;
    boolean active = true;
    CalcTrackAndField calc = new CalcTrackAndField();


    // Calculate the score based on distance and height. Measured in meters.
    public int calculateResult(double distance) throws InvalidResultException {


        // Acceptable values.
        if (distance < 0) {
            throw new InvalidResultException("Value too low");
        } else if (distance > 30) {

            throw new InvalidResultException("Value too high");
        }
        return calc.calculateField(A, B, C, distance);
    }

}
