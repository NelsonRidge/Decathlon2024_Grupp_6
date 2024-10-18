package heptathlon;

import common.*;
import decathlon.InvalidResultException;

public class Hep200M {

    private double A = 4.99087;
    private double B = 42.5;
    private double C = 1.81;
    CalcTrackAndField calc = new CalcTrackAndField();

    // Calculate the score based on time. All running events.
    public int calculateResult(double runningTime) throws InvalidResultException {

        if (runningTime < 20) {
            throw new InvalidResultException("Value too low");
        } else if (runningTime > 100) {
            throw new InvalidResultException("Value too high");
        }

        return calc.calculateTrack(A, B, C, runningTime);
    }
}