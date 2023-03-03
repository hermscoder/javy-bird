package com.emersonribeiro.object;

import java.awt.Color;
import java.awt.Graphics;

public class Column {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Column(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(97, 158, 86));
        g.fillRect(x, y, width, height);
    }
}
