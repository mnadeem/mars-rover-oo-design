package com.nadeem.app.kata;

public class Coordinates {
	private int xCoordinate;
	private int yCoordinate;
	
	public Coordinates(int x, int y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}

	public boolean lowerThanOrEqual(Coordinates newPosition) {
		return this.xCoordinate <= newPosition.xCoordinate && this.yCoordinate <= newPosition.yCoordinate;
	}

	public boolean greaterThanOrEqual(Coordinates newPosition) {
		return this.xCoordinate >= newPosition.xCoordinate && this.yCoordinate >= newPosition.yCoordinate;
	}

	public Coordinates nextStep(int stepXSize, int stepYSize) {
		return new Coordinates(this.xCoordinate + stepXSize, this.yCoordinate + stepYSize);
	}

	public int getXCoordinate() {
		return xCoordinate;
	}

	public int getYCoordinate() {
		return yCoordinate;
	}
}
