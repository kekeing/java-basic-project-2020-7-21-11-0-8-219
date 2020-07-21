package com.twschool.practice.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRoverMove implements MarsRoverMoveAccordCommand {
    @Override
    public void moveAccordCommand(MarsRoverPosition marsRoverPosition, String command,int commandBNumber) {
        if (Command.MOVE.getShortName().equals(command)) {
            if (commandBNumber % 2 == 0) {
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
            else {
                String directionShortName = marsRoverPosition.direction.getShortName();
                if (directionShortName.equals(Direction.NORTH.getShortName())) {
                    marsRoverPosition.coordinatesY--;
                } else if (directionShortName.equals(Direction.EAST.getShortName())) {
                    marsRoverPosition.coordinatesX--;
                } else if (directionShortName.equals(Direction.WEST.getShortName())) {
                    marsRoverPosition.coordinatesX++;
                } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
                    marsRoverPosition.coordinatesY++;
            }

            }
        }
        if (Command.TURN_LEFT.getShortName().equals(command)) {
            marsRoverPosition.turnLeft();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            marsRoverPosition.turnRight();
        }

    }
    public MarsRoverPosition moveAccordCommands(MarsRoverPosition marsRoverPosition,String commands){
        String[] stringsCommands = commands.split("");
        int commandBNumber = 0;
        for (int i=0;i<stringsCommands.length;i++){
                if ("B".equals(stringsCommands[i]) ){
                    commandBNumber ++;

            }
            moveAccordCommand(marsRoverPosition , stringsCommands[i],commandBNumber);
        }
        return marsRoverPosition;
    }

}
