package com.nadeem.app.kata.instruction;

import com.nadeem.app.kata.MarsRover;

public class MoveInstruction implements Instruction {

	@Override
	public void execute(final MarsRover rover) {
		rover.move();
	}
}
