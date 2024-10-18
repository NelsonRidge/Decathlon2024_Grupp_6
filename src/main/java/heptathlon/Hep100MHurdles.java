package heptathlon;

import common.*;
import decathlon.InvalidResultException;

public class Hep100MHurdles {

    private double A = 9.23076;
    private double B = 26.7;
    private double C = 1.835;
    CalcTrackAndField calc = new CalcTrackAndField();

    // Calculate the score based on time. All running events.
    public int calculateResult(double runningTime) throws InvalidResultException {

        if (runningTime < 10) {
            throw new InvalidResultException("Value too low");
        } else if (runningTime > 30) {
            throw new InvalidResultException("Value too high");
        }

        return calc.calculateTrack(A, B, C, runningTime);
    }
}