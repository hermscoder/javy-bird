package com.emersonribeiro.main;

import com.emersonribeiro.input.KeyboardInputs;
import com.emersonribeiro.input.MouseInputs;

import javax.swing.*;
import java.awt.*;

import static com.emersonribeiro.main.Game.GAME_HEIGHT;
import static com.emersonribeiro.main.Game.GAME_WIDTH;


public class GamePanel extends JPanel {

    private final Game game;

    public GamePanel(Game game) {

        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(new MouseInputs(this));
        this.game = game;
    }

    private void setPanelSize() {
        Dimension size = new Dimension(GAME_WIDTH, GAME_HEIGHT);
        setPreferredSize(size);
        System.out.println("size : " + GAME_WIDTH + "x" + GAME_HEIGHT);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.render(g);
    }

    public Game getGame() {
        return game;
    }
}
