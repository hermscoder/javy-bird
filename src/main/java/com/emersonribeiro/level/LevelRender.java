package com.emersonribeiro.level;

import com.emersonribeiro.main.Game;

import java.awt.*;

public class LevelRender {

    private static final Color FLOOR_COLOR = new Color(192,239,204);
    public void update() {
        //TODO update level related stuff
    }

    public void draw(Graphics g) {
        g.setColor(FLOOR_COLOR);
        g.fillRect(0, Game.GAME_HEIGHT - 20, Game.GAME_WIDTH, 20);

    }
}
