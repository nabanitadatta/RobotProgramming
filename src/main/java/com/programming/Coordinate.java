package com.programming;

class Coordinate {
	// x,y stands for Robot position
	private final int x;
	private final int y;

	Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int x() {
		return x;
	}

	int y() {
		return y;
	}

}
