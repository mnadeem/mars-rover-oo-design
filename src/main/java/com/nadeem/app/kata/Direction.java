package com.nadeem.app.kata;

public enum Direction {
	NORTH('N', 0, 1) {

		@Override
		public Direction right() {
			return EAST;
		}

		@Override
		public Direction left() {
			return WEST;
		}
		
	}, SOUTH('S',0, -1) {

		@Override
		public Direction right() {
			return WEST;
		}

		@Override
		public Direction left() {
			return EAST;
		};
	
	},EAST('E', 1, 0) {

		@Override
		public Direction right() {
			return SOUTH;
		}

		@Override
		public Direction left() {
			return NORTH;
		};
	
	}, WEST('W', -1, 0) {

		@Override
		public Direction right() {
			return NORTH;
		}

		@Override
		public Direction left() {
			return SOUTH;
		}		
	};
	
	private Direction(char code, int stepSizeX, int stepSizeY) {
		this.stepXSize = stepSizeX;
		this.stepYSize = stepSizeY;
		this.code = code;
	}
	
	private int stepXSize;
	private int stepYSize;
	private char code;

	public abstract Direction right();
	public abstract Direction left();

	public int getStepXSize() {
		return stepXSize;
	}

	public int getStepYSize() {
		return stepYSize;
	}
	public char getCode() {
		return code;
	}
}
