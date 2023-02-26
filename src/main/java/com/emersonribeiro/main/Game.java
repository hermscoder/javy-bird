package com.emersonribeiro.main;


import com.emersonribeiro.gamestate.GameState;

import java.awt.*;

import static com.emersonribeiro.gamestate.GameState.PLAYING;

public class Game {

    public static final int TILES_DEFAULT_SIZE = 32;
    public static final float SCALE = 1.3f;
    public static final int TILES_IN_WIDTH = 26;
    public static final int TILES_IN_HEIGHT = 14;
    public static final int TILES_SIZE = (int) (TILES_DEFAULT_SIZE * SCALE);
    public static final int GAME_WIDTH = TILES_SIZE * TILES_IN_WIDTH;
    public static final int GAME_HEIGHT = TILES_SIZE * TILES_IN_HEIGHT;

    private GamePanel gamePanel;

    public Game() {
        initClasses();
        gamePanel = new GamePanel(this);
        new GameWindow(gamePanel);
        gamePanel.setFocusable(true);
        gamePanel.requestFocus();
        startGameLoop();
    }

    private void initClasses() {
        //TODO initialize all the state classes and its dependencies
    }

    private void startGameLoop() {
        var gameThread = new Thread(
                new GameLoop(
                        this::update,
                        () -> gamePanel.repaint())
        );
        gameThread.start();
    }

    public void update() {
        switch (GameState.state) {
            case PLAYING:
                //TODO update playing state
                break;
            case MENU:
                //TODO update menu state
                break;
            case QUIT:
            default:
                System.exit(0);
                break;
        }
    }


    public void render(Graphics g) {
        switch (GameState.state) {
            case PLAYING:
                //TODO render playing state
                break;
            case MENU:
                //TODO render menu state
            default:
                break;
        }
    }

    public void windowFocusLost() {
        if (GameState.state == PLAYING)
            System.out.println("Come back to the game!");
    }

}
