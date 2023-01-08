package com.programming;

import java.lang.Math;

class Robot {
	private Room room;
	private Coordinate coordinate;
	private Direction direction;

	public Robot(Room room, Coordinate coordinate, Direction direction) {
		this.room = room;
		this.coordinate = coordinate;
		this.direction = direction;
	}
	
//taking instruction and sending the expected output to Test class
	String execute(String commands) throws Exception {

		for (char c : commands.toUpperCase().toCharArray()) {
			if (c == 'R') {
				direction = direction.right();
			}
			if (c == 'L') {
				direction = direction.left();
			}
			if (c == 'F') {
				coordinate = room.nextCoordinateFor(coordinate, direction);
			}
			if ((c != 'R') && (c != 'L') && (c != 'F')) {
				throw new Exception("Instruction not Valid");
			}

		}

		return "Report: " + Math.abs(coordinate.x()) + " " + Math.abs(coordinate.y()) + " " + direction.value();
	}

}
