package heptathlon;

import common.CalcTrackAndField;
import common.InputResult;
import decathlon.InvalidResultException;

public class HeptLongJump {

    private int score;
    private double A = 0.188807;
    private double B = 210;
    private double C = 1.41;
    boolean active = true;
    CalcTrackAndField calc = new CalcTrackAndField();


    // Calculate the score based on distance and height. Measured in centimetres.
    public int calculateResult(double distance) throws InvalidResultException {


        // Acceptable values.
        if (distance < 0) {
            throw new InvalidResultException("Value too low");
        } else if (distance > 1000) {

            throw new InvalidResultException("Value too high");

        }


        return calc.calculateField(A, B, C, distance);
    }

}
