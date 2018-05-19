package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static Entities.Player.map1;

public class TrebuchetGame extends Game {
    Dead d = new Dead();

    public static final int WIDTH = 1600;
    public static final int HEIGHT = 800;

    public SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();
        this.setScreen(new mainMenu(this));

    }

    @Override
    public void render() {
        if (map1 == 5){
            this.setScreen(new mainMenu(this));
        }
        if (d.isIDead() == true) {
            this.setScreen(new mainMenu(this));
        }

        super.render();
    }

}
