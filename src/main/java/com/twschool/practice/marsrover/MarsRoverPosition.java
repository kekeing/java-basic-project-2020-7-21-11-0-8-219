package com.twschool.practice.marsrover;


public class MarsRoverPosition {
    int coordinatesX;
    int coordinatesY;
     Direction direction;

    public MarsRoverPosition(int coordinatesX, int coordinatesY, String direction) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.direction = Direction.fromShortName(direction);
    }

    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    public String getDirectionShortName() {
        return direction.getShortName();
    }

    public void turnLeft() {
        direction = direction.leftDirection();
    }

    public void turnRight() {
        direction = direction.rightDirection();
    }

}
