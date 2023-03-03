package com.emersonribeiro.object;

import com.emersonribeiro.level.LevelRender;
import com.emersonribeiro.main.Game;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

    private ArrayList<Column> columns;
    private Random rand;

    private int spaceBetweenColumns = 300;
    private int columnWidth = 100;

    public ObjectManager(){
        rand = new Random();
        columns = new ArrayList<>();
        addColumn();
        addColumn();
    }

    public void update() {
        //TODO update object related stuff
    }

    public void draw(Graphics g) {
        for (Column column : columns) {
            column.draw(g);
        }
    }

    public void addColumn() {
        int columnHeight = 50 + rand.nextInt(300);

        int x = Game.GAME_WIDTH + columnWidth + columns.size() * spaceBetweenColumns - 500;
        int y = Game.GAME_HEIGHT - columnHeight - LevelRender.FLOOR_HEIGHT;
        columns.add(new Column(x, y, columnWidth, columnHeight));
        columns.add(new Column(x, 0, columnWidth, Game.GAME_HEIGHT - columnHeight - spaceBetweenColumns));
    }
}
