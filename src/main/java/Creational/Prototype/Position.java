package Creational.Prototype;

import lombok.ToString;

@ToString
public class Position implements Prototype<Position>{
    private int xCoordinate;
    private int yCoordinate;

    public Position(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;

    }

    @Override
    public Position clone() {
        return new Position(this.xCoordinate, this.yCoordinate);
    }
}
