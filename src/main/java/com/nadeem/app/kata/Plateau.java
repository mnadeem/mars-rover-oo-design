package com.nadeem.app.kata;

public class Plateau {

	private Coordinates topRight;
	private Coordinates bottomLeft;

	public Plateau(final Coordinates topRight) {
		this.topRight = topRight;
		this.bottomLeft = new Coordinates(0, 0);
	}

	public boolean isWithinBound(final Coordinates newPosition) {
		if (this.bottomLeft.lowerThanOrEqual(newPosition) && this.topRight.greaterThanOrEqual(newPosition)) {
			return true;
		}
		return false;
	}

}
