package com.nadeem.app.kata.instruction;

import com.nadeem.app.kata.MarsRover;

public class TurnRightInstruction implements Instruction {

	@Override
	public void execute(final MarsRover rover) {
		rover.turnRight();
	}
}
