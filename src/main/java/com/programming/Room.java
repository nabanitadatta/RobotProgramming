package com.programming;

import static com.programming.Direction.*;
import java.lang.Math;

class Room {

//Room Size
	private int MAX_DEEP;
	private int MAX_WIDE;

	public Room(int MAX_DEEP, int MAX_WIDE) {
		this.MAX_DEEP = MAX_DEEP;
		this.MAX_WIDE = MAX_WIDE;
	}

	// Calculating Robot position based on direction and Room Size
	Coordinate nextCoordinateFor(Coordinate coordinate, Direction direction) {
		int x = coordinate.x();
		int y = coordinate.y();

		if (direction == NORTH)
			y++;

		if (direction == EAST)
			x++;

		if (direction == SOUTH)
			y--;

		if (direction == WEST)
			x--;

		// Error code when Robot is outside of room
		if (Math.abs(x) >= MAX_WIDE) {
			x = 101;
			System.out.println("Robot is outside of room");			
		}
		// Error code when Robot is outside of room
		if (Math.abs(y) >= MAX_DEEP) {
			y = 101;
			System.out.println("Robot is outside of room");
		}
		return new Coordinate(x, y);
	}
}
