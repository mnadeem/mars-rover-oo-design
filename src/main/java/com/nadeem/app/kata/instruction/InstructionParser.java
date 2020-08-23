package com.nadeem.app.kata.instruction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstructionParser {

	private static Map<Character, Instruction> instructionsMap = new HashMap<Character, Instruction>() {
		private static final long serialVersionUID = 1L;

		{
			put('M', new MoveInstruction());
			put('L', new TurnLeftInstruction());
			put('R', new TurnRightInstruction());
		}
	};

	public List<Instruction> parse(final String instructions) {
		List<Instruction> result = new ArrayList<>();
		char[] charArray = instructions.toCharArray();
		for (char instruction : charArray) {
			result.add(instructionsMap.get(instruction));
		}
		return result;
	}
}
