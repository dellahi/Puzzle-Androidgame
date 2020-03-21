package com.ensias.dellahi.puzzlegame.Screen;

import android.content.Context;
import android.content.Intent;

import com.e_mobadara.audiomanaging.AudioSettingsActivity;
import com.ensias.dellahi.puzzlegame.Asset.BaseAsset;
import com.ensias.dellahi.puzzlegame.Asset.WelcomeAsset;
import com.ensias.dellahi.puzzlegame.R;
import com.ensias.dellahi.puzzlegame.Sprite.NiveauSprite;
import com.ensias.dellahi.puzzlegame.Sprite.PlayButton;
import com.ensias.dellahi.puzzlegame.Sprite.WelcomeSplite;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.ButtonUI;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.emobadaragaminglib.Implementation.AndroidGame;

public class WelcomeScreen extends Screen {

    private WelcomeSplite bg;
    private PlayButton playButton;
    private WelcomeSplite Title;
    private WelcomeSplite Wbg;
    private NiveauSprite exit;
    private ButtonUI audioConf;

    public WelcomeScreen(Game game) {
        super(game);
        WelcomeAsset.playButton = game.getGraphics().newImage(R.drawable.boutonjouer,Graphics.ImageFormat.ARGB8888,game.getResources());
        WelcomeAsset.Title=game.getGraphics().newImage(R.drawable.gt12,Graphics.ImageFormat.ARGB8888,game.getResources());
        WelcomeAsset.Wbg=game.getGraphics().newImage(R.drawable.puzzlebg1,Graphics.ImageFormat.ARGB8888,game.getResources());
        int w_unit = game.getGraphics().getWidth();
        int h_unit = game.getGraphics().getHeight();
        bg = new WelcomeSplite(WelcomeAsset.bg,0,0,h_unit,w_unit);
        playButton = new PlayButton(game ,WelcomeAsset.playButton,(int)Math.round(0.5555*w_unit),(int)Math.round(0.5574*h_unit),(int)Math.round(0.1505*h_unit),(int)Math.round(0.3703*w_unit));
        Title = new WelcomeSplite(WelcomeAsset.Title,(int)Math.round(0.3703*w_unit),(int)Math.round(0.1003*h_unit),(int)Math.round(0.1950*h_unit),(int)Math.round(0.4166*w_unit));
        Wbg = new WelcomeSplite(WelcomeAsset.Wbg,0,0,h_unit,w_unit);
        exit = new NiveauSprite(game,WelcomeAsset.exit,(int)Math.round(0.0370*w_unit),(int)Math.round(0.8918*h_unit),(int)Math.round(0.0836*h_unit),(int)Math.round(0.3881*w_unit));

        audioConf = new ButtonUI(BaseAsset.audimnger,BaseAsset.audimnger,(int)Math.round(0.0370*w_unit),(int)Math.round(0.0334*h_unit),(int)Math.round(0.0836*h_unit),(int)Math.round(0.1388*w_unit));

        MenuScreen.etat=1;
        addSprite(bg);
        addSprite(Wbg);
        addSprite(playButton);
        addSprite(audioConf);
        addSprite(Title);
        addSprite(exit);

    }

    public void handleTouchDown (int x, int y, int pointer){
        super.handleTouchDown(x,y, pointer);
        audioConf.onTouchDown(x,y);
        Sprite s = getDraggedSprite();
        if (s.getClass()==PlayButton.class){
            PlayButton play =(PlayButton) s;
            play.playGame();
            Wbg.dispose();
            playButton.dispose();
            Title.dispose();
        }
        if (s.getClass()==NiveauSprite.class){
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    }

    @Override
    public void handleTouchUp(int x, int y, int pointer) {
        super.handleTouchUp(x, y, pointer);
        audioConf.onTouchUp(x, y);
    }

    @Override
    public void render(float deltaTime) {
        if(audioConf.isClicked()){
            Intent intent = new Intent((Context)game,AudioSettingsActivity.class);
            ((Context)game).startActivity(intent);
        }
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
