package com.artificial.pathfinding;

public class Tile {
    private final int x, y;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj instanceof Tile && this.x == ((Tile) obj).x && this.y == ((Tile) obj).y;
    }
}
