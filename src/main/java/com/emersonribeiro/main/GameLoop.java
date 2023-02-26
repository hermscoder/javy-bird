package com.emersonribeiro.main;

public class GameLoop implements Runnable {
    private static final int FPS_SET = 120;
    private static final int UPS_SET = 200;

    private final Runnable updateAction;
    private final Runnable repaintAction;

    public GameLoop(Runnable updateAction, Runnable repaintAction) {
        this.updateAction = updateAction;
        this.repaintAction = repaintAction;
    }

    @Override
    public void run() {
        double timePerFrame = 1_000_000_000.0 / FPS_SET;
        double timePerUpdate = 1_000_000_000.0 / UPS_SET;

        long previousTime = System.nanoTime();

        int frames = 0;
        int updates = 0;
        long lastCheck = System.currentTimeMillis();

        double deltaU = 0;
        double deltaF = 0;
        while (true) {
            long currentTime = System.nanoTime();

            deltaU += (currentTime - previousTime) / timePerUpdate;
            deltaF += (currentTime - previousTime) / timePerFrame;
            previousTime = currentTime;
            if (deltaU >= 1) {
                updateAction.run();
                updates++;
                deltaU--;
            }

            if (deltaF >= 1) {
                repaintAction.run();
                frames++;
                deltaF--;
            }

            if (System.currentTimeMillis() - lastCheck >= 1000) {
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames + " | UPS: " + updates);
                frames = 0;
                updates = 0;
            }
        }
    }
}
