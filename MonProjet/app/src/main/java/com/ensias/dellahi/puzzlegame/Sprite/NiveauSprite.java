package com.ensias.dellahi.puzzlegame.Sprite;

import com.ensias.dellahi.puzzlegame.Asset.BaseAsset;
import com.ensias.dellahi.puzzlegame.Screen.Niveau1S;
import com.ensias.dellahi.puzzlegame.Screen.Niveau2S;
import com.ensias.dellahi.puzzlegame.Screen.Niveau3S;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;

public class NiveauSprite extends Sprite {
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
    public NiveauSprite(Game game , Image image, int x, int y, int height, int width) {
        super(image, x, y, height, width);
        this.g = game;

    }
    public void ChangeScreen () { g.setScreen(new Niveau1S(g,BaseAsset.i));}
    public void niveau2(){g.setScreen(new Niveau2S(g,BaseAsset.i));}
    public void niveau3(){g.setScreen(new Niveau3S(g,BaseAsset.i));}

}
