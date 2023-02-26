package com.emersonribeiro.entity;


import java.awt.*;

public class Player {

    protected float x;
    protected float y;
    protected int width;
    protected int height;

    public Player(float x, float  y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void update() {
        //TODO player movement updates
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((int) x,(int) y, width, height);

    }
}
