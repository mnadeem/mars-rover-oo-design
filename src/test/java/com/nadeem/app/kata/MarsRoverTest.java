package com.nadeem.app.kata;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MarsRoverTest {

	@Test
	public void testTurnLeftWhenFacingEast() {
		Plateau plateau = new Plateau(new Coordinates(5, 5));
        Coordinates initialPosition = new Coordinates(2, 2);

        MarsRover marsRover = new MarsRover(plateau, initialPosition, Direction.EAST);
        marsRover.turnLeft();

        assertThat(marsRover.getCurrentPosition(), equalTo("2 2 N"));
	}
	
	@Test
	public void testTurnRightWhenFacingEast() {
		Plateau plateau = new Plateau(new Coordinates(5, 5));
        Coordinates initialPosition = new Coordinates(2, 2);

        MarsRover marsRover = new MarsRover(plateau, initialPosition, Direction.EAST);
        marsRover.turnRight();

        assertThat(marsRover.getCurrentPosition(), equalTo("2 2 S"));
	}
	
	@Test
	public void testMoveWhenFacingEast() {
		Plateau plateau = new Plateau(new Coordinates(5, 5));
        Coordinates initialPosition = new Coordinates(2, 2);

        MarsRover marsRover = new MarsRover(plateau, initialPosition, Direction.EAST);
        marsRover.move();

        assertThat(marsRover.getCurrentPosition(), equalTo("3 2 E"));
	}
	
	@Test
	public void testExecuteInsturctionsWhenFacingEast() {
		Plateau plateau = new Plateau(new Coordinates(5, 5));
        Coordinates initialPosition = new Coordinates(2, 2);

        MarsRover marsRover = new MarsRover(plateau, initialPosition, Direction.EAST);
        marsRover.execute("MMMRL");

        assertThat(marsRover.getCurrentPosition(), equalTo("5 2 E"));
	}

}
