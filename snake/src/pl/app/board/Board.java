package pl.app.board;

import java.awt.*;

public class Board {
    public static final int FIELD_x = 20;
    public static final int FIELD_y = 20;
    public static final int SIZE = 30;
    public static final int MAX_x = FIELD_x * SIZE;
    public static final int MAX_y = FIELD_y * SIZE;

    public static void draw(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, MAX_x, MAX_y);
    }
}
