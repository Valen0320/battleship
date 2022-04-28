package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class Coordinate {
    private int x;
    private int y;
    private boolean estate;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
