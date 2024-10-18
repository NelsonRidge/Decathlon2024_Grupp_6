package decathlon;

import common.*;

public class Deca110MHurdles {

    private double A = 5.74352;
    private double B = 28.5;
    private double C = 1.92;
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