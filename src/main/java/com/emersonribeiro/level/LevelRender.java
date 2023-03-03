package com.emersonribeiro.level;

import com.emersonribeiro.main.Game;

import java.awt.Color;
import java.awt.Graphics;

public class LevelRender {

    public static final int FLOOR_HEIGHT = 120;
    private static final int GRASS_HEIGHT = 20;
    private static final int UNDERGROUND_HEIGHT = 100;

    public void update() {
        //TODO update level related stuff
    }

    public void draw(Graphics g) {
        // grass
        g.setColor(new Color(192, 239, 204));
        g.fillRect(0, Game.GAME_HEIGHT - FLOOR_HEIGHT, Game.GAME_WIDTH, GRASS_HEIGHT);
        // underground
        g.setColor(new Color(217, 188, 154));
        g.fillRect(0, Game.GAME_HEIGHT - UNDERGROUND_HEIGHT, Game.GAME_WIDTH, UNDERGROUND_HEIGHT);
    }
}
