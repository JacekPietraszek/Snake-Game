package pl.app;

import pl.app.board.MainFrame;

import java.awt.*;

public class Game {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
