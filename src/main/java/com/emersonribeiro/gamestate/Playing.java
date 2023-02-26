package com.emersonribeiro.gamestate;


import com.emersonribeiro.entity.Player;
import com.emersonribeiro.level.LevelRender;
import com.emersonribeiro.object.ObjectManager;
import com.emersonribeiro.main.Game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Playing extends State implements StateMethods {

    private StringBuilder keyPressedBuffer;
    private boolean clearBuffer;

    private Player player;
    private LevelRender levelRender;
    private ObjectManager objectManager;

    public Playing(Game game) {
        super(game);
        initClasses();
    }

    private void initClasses() {
        keyPressedBuffer = new StringBuilder();
        levelRender = new LevelRender();
        player = new Player(20, 20, 40, 40);
        objectManager = new ObjectManager();
    }


    public void update() {
        if (clearBuffer) {
            keyPressedBuffer = new StringBuilder();
            clearBuffer = false;
        }
        //TODO Update playing related stuff, obstacles, player, etc
    }


    public void draw(Graphics g) {
        //TODO Draw playing related stuff, obstacles, player, etc
        g.drawString(keyPressedBuffer.toString(), 20, 20);
        //TODO Draw playing related stuff, obstacles, player, etc
        player.draw(g);
        objectManager.draw(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        keyPressedBuffer.append(" click ");
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
        keyPressedBuffer
                .append(" ")
                .append(e.getKeyChar())
                .append(" ");

        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            clearBuffer = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
