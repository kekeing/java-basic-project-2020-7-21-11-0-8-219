package com.twschool.practice.marsrover;

import java.util.Arrays;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;
    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public MarsRoverPosition receive(String commands) {
     MarsRoverMove marsRoverMove = new MarsRoverMove();
     marsRoverMove.moveAccordCommands(this.marsRoverPosition,commands);
     return this.marsRoverPosition;
    }


}
