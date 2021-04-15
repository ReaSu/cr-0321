package at.reasu.cr;

public class Grid {

    Integer x, y;


    public Grid(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Grid() {

    }

    public Integer getSizeX() {
        return x;
    }

    public Integer getSizeY() {
        return y;
    }

    public int isAlive(int i, int i1) {
        return 1;
    }
}
