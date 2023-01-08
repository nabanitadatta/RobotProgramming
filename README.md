Programming Assignment: Robot Programming

Task Done: Develope a programme that can control a Robot which can walk in a specified room.

Tools: Eclipse, Maven, Junit

Technology: Java

Run Program: Created the program in TDD environment. Test File name is RobotTest.java. 3 test cases have been written there.
Right click on that file-> choose Run -> choose Junit test.
Some more test cases:

10 10 (Room Size)

0 0 NORTH (Starting position and facing Direction  of Robot)

RFFLF (Given Command)

Report: 2 1 N (Expected Output)

5 5 (Room Size)
0 0 EAST (Starting position and facing Direction of Robot)
RFLFFLRF (Given Command)
Report: 3 1 E (Expected Output)

10 10 (Room Size)
3 3 EAST (Starting position and facing Direction of Robot)
FFRFFRFRRF (Given Command)
Report: 5 1 E (Expected Output)

10 10 (Room Size)
0 0 NORTH (Starting position and facing Direction of Robot)
LLFFFFF (Given Command)
Report: 0 5 S (Expected Output)

5 5 (Room Size)
0 0 SOUTH (Starting position and facing Direction of Robot)
RFLFFLRF(Given Command)
Report: 1 3 S (Expected Output)

10 10 (Room Size)
0 0 NORTH (Starting position and facing Direction of Robot)
LFFFFF (Given Command)
Report: 5 0 W (Expected Output)

5 5 (Room Size)
0 0 NORTH (Starting position and facing Direction of Robot)
LFFFFF (Given Command)
Report: 101 0 W (Expected Output)

In this task, code no. 101 stands for error code if Robot is out side of room. 
If a room is 5*5 size and robot comes to e.g. (5,1) position will be counted as outside room because bottom left corner of room is counted as (0,0).
If you type any command which will not instruct robot will be assumed a wrong command and exception will be thrown.

Nice to have: Error Code has given by mine but it will be nice if it comes through system generated.
