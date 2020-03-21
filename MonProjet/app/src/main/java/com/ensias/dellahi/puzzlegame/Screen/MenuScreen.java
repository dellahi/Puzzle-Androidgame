package com.ensias.dellahi.puzzlegame.Screen;

import com.ensias.dellahi.puzzlegame.Asset.BaseAsset;
import com.ensias.dellahi.puzzlegame.Asset.MenuAsset;
import com.ensias.dellahi.puzzlegame.Asset.WelcomeAsset;
import com.ensias.dellahi.puzzlegame.R;
import com.ensias.dellahi.puzzlegame.Sprite.MenuSprite;
import com.ensias.dellahi.puzzlegame.Sprite.NiveauSprite;
import com.ensias.dellahi.puzzlegame.Sprite.Returnhome;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.ensias_auth_library.FoxyAuth;
import com.example.ensias_auth_library.models.GameStat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuScreen extends Screen {

    private NiveauSprite Level1;
    private NiveauSprite Level2;
    private NiveauSprite Level3;
    private MenuSprite help;
    private MenuSprite soundon;
    private MenuSprite soundof;
    private Returnhome returnbutton;
    private MenuSprite Title;
    private MenuSprite bg;
    public  static GameStat gameStat = new GameStat();
    public static int etat;

    public MenuScreen(Game game) {
        super(game);
        MenuAsset.Title=game.getGraphics().newImage(R.drawable.choisir,Graphics.ImageFormat.ARGB8888,game.getResources());
        MenuAsset.Level1=game.getGraphics().newImage(R.drawable.niveau1,Graphics.ImageFormat.ARGB8888,game.getResources());
        MenuAsset.Level2=game.getGraphics().newImage(R.drawable.niveau2,Graphics.ImageFormat.ARGB8888,game.getResources());
        MenuAsset.Level3=game.getGraphics().newImage(R.drawable.niveau3,Graphics.ImageFormat.ARGB8888,game.getResources());
        MenuAsset.help=game.getGraphics().newImage(R.drawable.helpbutton,Graphics.ImageFormat.ARGB8888,game.getResources());
        MenuAsset.soundof=game.getGraphics().newImage(R.drawable.soundbuttonno,Graphics.ImageFormat.ARGB8888,game.getResources());
        MenuAsset.soundon=game.getGraphics().newImage(R.drawable.soundbuttonyes,Graphics.ImageFormat.ARGB8888,game.getResources());
        int w_unit = game.getGraphics().getWidth();
        int h_unit = game.getGraphics().getHeight();
        System.out.println(w_unit + "  " + h_unit);
        BaseAsset.bgM.play();
        BaseAsset.bgM.setLooping(true);
        bg = new MenuSprite(WelcomeAsset.bg,0,0,h_unit,w_unit);
        Level1 = new NiveauSprite(game ,MenuAsset.Level1,(int)Math.round(0.5555*w_unit),(int)Math.round(0.3344*h_unit),(int)Math.round(0.1393*h_unit),(int)Math.round(0.3703*w_unit));
        Level2 = new NiveauSprite(game, MenuAsset.Level2,(int)Math.round(0.5555*w_unit),(int)Math.round(0.5016*h_unit),(int)Math.round(0.1393*h_unit),(int)Math.round(0.3703*w_unit));
        Level3 = new NiveauSprite(game, MenuAsset.Level3,(int)Math.round(0.5555*w_unit),(int)Math.round(0.6688*h_unit),(int)Math.round(0.1393*h_unit),(int)Math.round(0.3703*w_unit));
        help = new MenuSprite(MenuAsset.help,(int)Math.round(0.8425*w_unit),(int)Math.round(0.8918*h_unit),(int)Math.round(0.0836*h_unit),(int)Math.round(0.1388*w_unit));
        soundon = new MenuSprite(MenuAsset.soundon,(int)Math.round(0.6944*w_unit),(int)Math.round(0.8918*h_unit),(int)Math.round(0.1114*h_unit),(int)Math.round(0.2314*w_unit));
        soundof = new MenuSprite(MenuAsset.soundof,(int)Math.round(0.6944*w_unit),(int)Math.round(0.8918*h_unit),(int)Math.round(0.0836*h_unit),(int)Math.round(0.1388*w_unit));
        returnbutton = new Returnhome(game, MenuAsset.returnbutton,(int)Math.round(0.0370*w_unit),(int)Math.round(0.0334*h_unit),(int)Math.round(0.0836*h_unit),(int)Math.round(0.1388*w_unit));
        Title = new MenuSprite(MenuAsset.Title,(int)Math.round(0.3703*w_unit),(int)Math.round(0.1114*h_unit),(int)Math.round(0.1282*h_unit),(int)Math.round(0.5555*w_unit));

        addSprite(bg);
        addSprite(help);
        addSprite(Level1);
        addSprite(Level2);
        addSprite(Level3);
        addSprite(soundof);
        addSprite(returnbutton);
        addSprite(Title);

    }

    public void handleTouchDown (int x, int y, int pointer){
        super.handleTouchDown(x,y, pointer);
        Sprite s = getDraggedSprite();
        if (s.getClass()==Returnhome.class){
            Returnhome h =(Returnhome) s;
            h.returnh();
            help.dispose();
            Level1.dispose();
            Level2.dispose();
            Level3.dispose();
            soundof.dispose();
            soundon.dispose();
            Title.dispose();
        }
        if (s.getClass() == MenuSprite.class){
            MenuSprite m = (MenuSprite) s;
            if (soundof.equals(m)){
                if ( etat == 1){
                    BaseAsset.bgM.pause();
                    etat=0;
                }
                else if (etat == 0){
                    BaseAsset.bgM = game.getAudio().createMusic(R.raw.puzzlebg);
                    BaseAsset.bgM.play();
                    BaseAsset.bgM.setLooping(true);
                    etat = 1;
                }
            }
        }
        if (s.getClass()==NiveauSprite.class){
            NiveauSprite n =(NiveauSprite) s;
            BaseAsset.Nf=0;
            BaseAsset.Ns=0;
            if (Level1.equals(n)) n.ChangeScreen();
            else if (Level2.equals(n)) n.niveau2();
            else if (Level3.equals(n)) n.niveau3();
            help.dispose();
            Level1.dispose();
            Level2.dispose();
            Level3.dispose();
            soundof.dispose();
            soundon.dispose();
            Title.dispose();
        }
    }

    @Override
    public void render(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void backButton() {

    }
}
