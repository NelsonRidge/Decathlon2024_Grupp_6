package heptathlon;

import common.CalcTrackAndField;
import common.InputResult;
import decathlon.InvalidResultException;

public class HeptHightJump {

	private int score;
	private double A = 1.84523;
	private double B = 75;
	private double C = 1.348;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();


	// Calculate the score based on distance and height. Measured in cenimeters.
	public int calculateResult(double distance) throws InvalidResultException {


				if (distance < 0) {
					throw new InvalidResultException("Value too low");
				} else if (distance > 300) {
					throw new InvalidResultException("Value too high");
				}

		return calc.calculateField(A, B, C, distance);
	}

}
