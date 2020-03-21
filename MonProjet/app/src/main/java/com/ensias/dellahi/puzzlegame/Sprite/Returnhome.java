package com.ensias.dellahi.puzzlegame.Sprite;

import com.ensias.dellahi.puzzlegame.Screen.MenuScreen;
import com.ensias.dellahi.puzzlegame.Screen.WelcomeScreen;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;

public class Returnhome extends Sprite {
    /**
     * Constructor
     *
     * @param image  Bitmap of the Sprite
     * @param x      LeftTop Corner X-coordinate from where to start drawing
     * @param y      LeftTop Corner Y-coordinate from where to start drawing
     * @param height Height of the Sprite
     * @param width  Width of the sprite
     */
    Game g;
    public Returnhome(Game game, Image image, int x, int y, int height, int width) {
        super(image, x, y, height, width);
        this.g=game;
    }

    public void returnh () { g.setScreen(new WelcomeScreen(g));}
    public void returnm () { g.setScreen(new MenuScreen(g));}
}
