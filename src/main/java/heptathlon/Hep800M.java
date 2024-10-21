package heptathlon;

import common.*;
import decathlon.InvalidResultException;

public class Hep800M {

	private int score;
	private double A = 0.11193;
	private double B = 254;
	private double C = 1.88;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();


	// Calculate the score based on time. All running events.
	public int calculateResult(double runningTime) throws InvalidResultException {


				if (runningTime < 70) {
					throw new InvalidResultException("Value too low");

				} else if (runningTime > 250) {
					throw new InvalidResultException("Value too high");
				}
		return calc.calculateTrack(A, B, C, runningTime);
	}

}
