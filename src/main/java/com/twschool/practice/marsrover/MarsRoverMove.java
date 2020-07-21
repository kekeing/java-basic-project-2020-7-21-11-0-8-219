package com.twschool.practice.marsrover;

public class MarsRoverMove implements MarsRoverMoveAccordCommand {
    @Override
    public void moveAccordCommand(MarsRoverPosition marsRoverPosition, String command) {
        if (Command.MOVE.getShortName().equals(command)) {
            String directionShortName = marsRoverPosition.direction.getShortName();
            if (directionShortName.equals(Direction.NORTH.getShortName())) {
                marsRoverPosition.coordinatesY++;
            } else if (directionShortName.equals(Direction.EAST.getShortName())) {
                marsRoverPosition.coordinatesX++;
            } else if (directionShortName.equals(Direction.WEST.getShortName())) {
                marsRoverPosition.coordinatesX--;
            } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
                marsRoverPosition.coordinatesY--;
            }
        }
        if (Command.TURN_LEFT.getShortName().equals(command)) {
            marsRoverPosition.turnLeft();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            marsRoverPosition.turnRight();
        }
    }

}
