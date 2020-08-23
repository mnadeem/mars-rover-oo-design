package com.nadeem.app.kata;

import java.util.List;

import com.nadeem.app.kata.instruction.Instruction;
import com.nadeem.app.kata.instruction.InstructionParser;

public class MarsRover {

	private final Plateau plateau;
	private Coordinates currentPosition;
	private Direction direction;

	public MarsRover(final Plateau plateau, final Coordinates initPosition, final Direction direction) {
		this.plateau = plateau;
		this.currentPosition = initPosition;
		this.direction = direction;
	}

	public void turnLeft() {
		this.direction = this.direction.left();
	}

	public void turnRight() {
		this.direction = this.direction.right();
	}

	public void move() {
		Coordinates newPosition = this.currentPosition.nextStep(this.direction.getStepXSize(), this.direction.getStepYSize());
		if (this.plateau.isWithinBound(newPosition)) {
			this.currentPosition = newPosition;
		}
	}

	public void execute(final String rawInstructions) {
		List<Instruction> instructions =  new InstructionParser().parse(rawInstructions);
		for (Instruction instruction : instructions) {
			if (instruction != null) {				
				instruction.execute(this);
			}
		}
	}

	public String getCurrentPosition () {
	
		return new StringBuilder()
				.append(this.currentPosition.getXCoordinate())
				.append(" ")
				.append(this.currentPosition.getYCoordinate())
				.append(" ")
				.append(this.direction.getCode())
				.toString();
	}
}
