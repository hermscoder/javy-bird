package com.emersonribeiro.gamestate;


import com.emersonribeiro.main.Game;


public class State {
    protected final Game game;

    public State(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGameState(GameState state) {
        GameState.state = state;
    }
}
