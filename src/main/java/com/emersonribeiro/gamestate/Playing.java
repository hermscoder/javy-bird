package com.emersonribeiro.gamestate;


import com.emersonribeiro.main.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Playing extends State implements StateMethods{

    public Playing(Game game) {
        super(game);
        initClasses();
    }

    private void initClasses() {
    }


    public void update() {
        //TODO Update playing related stuff, obstacles, player, etc
    }


    public void draw(Graphics g) {
        //TODO Draw playing related stuff, obstacles, player, etc
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
