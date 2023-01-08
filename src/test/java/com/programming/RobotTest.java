package com.programming;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static com.programming.Direction.*;

@RunWith(JUnitParamsRunner.class)
public class RobotTest {
	// Room depth and width
	private static final int MAX_DEEP = 5;
	private static final int MAX_WIDE = 5;
	private Robot robot;
	// Starting position of Robot
	Coordinate coordinate = new Coordinate(1, 2);
	// Starting Direction of Robot
	Direction direction = NORTH;

	@Before
	public void initialise() {
		Room room = new Room(MAX_DEEP, MAX_WIDE);
		robot = new Robot(room, coordinate, direction);
	}

	// Walk towards North
	@Test
	@Parameters({ "RFRFFRFRF, Report: 1 1 N" })
	public void walk_forward_northdir(String commands, String position) throws Exception {
		assertThat(robot.execute(commands), is(position));
	}

	// Walk towards North
	@Test
	@Parameters({ "LFLFLFLFF, Report: 1 3 N" })
	public void walk_forward_north(String commands, String position) throws Exception {
		assertThat(robot.execute(commands), is(position));
	}

	// Wrong commands and expected Exception
	@Test(expected = Exception.class)
	@Parameters({ "dgTLFFR, " })
	public void walk_forward_random(String commands, String position) throws Exception {

		assertThat(robot.execute(commands), is(position));
	}

}
