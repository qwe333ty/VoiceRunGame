package com.eningapps.voicegame;

import com.badlogic.gdx.Game;

import screens.GameScreen;

/**
 * Extending {@link VoiceRunGame} by {@link Game} we
 * add support for multiple screens.
 */
public class VoiceRunGame extends Game {
    @Override
    public void create () {
        setScreen(new GameScreen());
    }

}
