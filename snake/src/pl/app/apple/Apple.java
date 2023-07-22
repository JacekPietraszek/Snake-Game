package pl.app.apple;

import pl.app.board.Board;

import java.awt.*;
import java.util.Random;

public class Apple extends Point {
    private static Random random = new Random();

    public Apple() {
        super(random.nextInt(Board.FIELD_x), random.nextInt(Board.FIELD_y));
    }

    public void draw(Graphics g) {
        g.setColor(new Color(201, 4, 4));
        g.fillOval(x * Board.SIZE, y * Board.SIZE, Board.SIZE, Board.SIZE);
    }
}
