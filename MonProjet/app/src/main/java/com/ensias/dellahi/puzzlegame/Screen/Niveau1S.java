package com.ensias.dellahi.puzzlegame.Screen;

import com.ensias.dellahi.puzzlegame.Asset.BaseAsset;
import com.ensias.dellahi.puzzlegame.R;
import com.ensias.dellahi.puzzlegame.Sprite.MenuSprite;
import com.ensias.dellahi.puzzlegame.Sprite.NiveauSprite;
import com.ensias.dellahi.puzzlegame.Sprite.Returnhome;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.ensias_auth_library.FoxyAuth;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Niveau1S extends Screen {

    private NiveauSprite clock;
    private NiveauSprite part1;
    private NiveauSprite part2;
    private NiveauSprite pic;
    private NiveauSprite valider;
    private NiveauSprite Solutionframe;
    private NiveauSprite picFramePlus;
    private NiveauSprite msgF;
    private NiveauSprite msgT;
    private Returnhome returnbutton;
    private MenuSprite bg;
    private NiveauSprite again;
    private NiveauSprite suivant;
    private int f=0;

    public Niveau1S(Game game, int indice) {
        super(game);
        BaseAsset.clock=game.getGraphics().newImage(R.drawable.clock,Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.valider=game.getGraphics().newImage(R.drawable.vv,Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.Solutionframe=game.getGraphics().newImage(R.drawable.picframe1,Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.picFramePlus=game.getGraphics().newImage(R.drawable.picframe1, Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.again=game.getGraphics().newImage(R.drawable.again, Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.msgf=game.getGraphics().newImage(R.drawable.msf, Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.msgt=game.getGraphics().newImage(R.drawable.msgt, Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.partN11.add(game.getGraphics().newImage(R.drawable.pic1partie1, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN11.add(game.getGraphics().newImage(R.drawable.pic2partie1, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN11.add(game.getGraphics().newImage(R.drawable.pic3partie1, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN11.add(game.getGraphics().newImage(R.drawable.pic4partie1, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN12.add(game.getGraphics().newImage(R.drawable.pic1partie2, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN12.add(game.getGraphics().newImage(R.drawable.pic2partie2, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN12.add(game.getGraphics().newImage(R.drawable.pic3partie2, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN12.add(game.getGraphics().newImage(R.drawable.pic4partie2, Graphics.ImageFormat.ARGB8888,game.getResources()));
        int w_unit = game.getGraphics().getWidth();
        int h_unit = game.getGraphics().getHeight();
        bg = new MenuSprite(BaseAsset.Nbg,0,0,h_unit,w_unit);
        returnbutton = new Returnhome(game, BaseAsset.Nr,(int)Math.round(0.7870*w_unit),(int)Math.round(0.2229*h_unit),(int)Math.round(0.1114*h_unit),(int)Math.round(0.1851*w_unit));
        Solutionframe = new NiveauSprite(game , BaseAsset.Solutionframe,(int)Math.round(0.0925*w_unit),(int)Math.round(0.1337*h_unit),(int)Math.round(0.2787*h_unit),(int)Math.round(0.4629*w_unit));
        part1 = new NiveauSprite(game ,BaseAsset.partN11.get(indice),(int)Math.round(0.3055*w_unit),(int)Math.round(0.1449*h_unit),(int)Math.round(0.2552*h_unit),(int)Math.round(0.2314*w_unit));
        part2 = new NiveauSprite(game , BaseAsset.partN12.get(indice),(int)Math.round(0.1111*w_unit),(int)Math.round(0.1449*h_unit),(int)Math.round(0.2552*h_unit),(int)Math.round(0.2175*w_unit));
        picFramePlus = new NiveauSprite(game , BaseAsset.picFramePlus,(int)Math.round(0.0972*w_unit),(int)Math.round(0.5183*h_unit),(int)Math.round(0.2787*h_unit),(int)Math.round(0.4629*w_unit));
        pic = new NiveauSprite(game , BaseAsset.pict.get(indice),(int)Math.round(0.1203*w_unit),(int)Math.round(0.5323*h_unit),(int)Math.round(0.2508*h_unit),(int)Math.round(0.4166*w_unit));
        valider = new NiveauSprite(game , BaseAsset.valider, (int)Math.round(0.7592*w_unit),(int)Math.round(0.6131*h_unit),(int)Math.round(0.1114*h_unit),(int)Math.round(0.2129*w_unit));
        clock = new NiveauSprite(game , BaseAsset.clock,(int)Math.round(0.0648*w_unit),(int)Math.round(0.0167*h_unit),(int)Math.round(0.1003*h_unit),(int)Math.round(0.1666*w_unit));
        again= new NiveauSprite(game , BaseAsset.again,(int)Math.round(0.4629*w_unit),(int)Math.round(0.5574*h_unit),(int)Math.round(0.1003*h_unit),(int)Math.round(0.1666*w_unit));
        suivant= new NiveauSprite(game , BaseAsset.suivant,(int)Math.round(0.4629*w_unit),(int)Math.round(0.6131*h_unit),(int)Math.round(0.0947*h_unit),(int)Math.round(0.1851*w_unit));
        msgF= new NiveauSprite(game , BaseAsset.msgf,(int)Math.round(0.2777*w_unit),(int)Math.round(0.2229*h_unit),(int)Math.round(0.3344*h_unit),(int)Math.round(0.5555*w_unit));
        msgT= new NiveauSprite(game , BaseAsset.msgt,(int)Math.round(0.1851*w_unit),(int)Math.round(0.2229*h_unit),(int)Math.round(0.3344*h_unit),(int)Math.round(0.7407*w_unit));

        addSprite(bg);
        addSprite(returnbutton);
        addSprite(clock);
        addSprite(Solutionframe);
        addSprite(picFramePlus);
        addSprite(valider);
        addSprite(part1);
        addSprite(part2);
        addSprite(pic);
        part1.setStatic(false);
        part2.setStatic(false);
        MenuScreen.gameStat.setLevel_id("1");
    }

    public void handleTouchDown (int x, int y, int pointer){
        super.handleTouchDown(x,y, pointer);
        Sprite s = getDraggedSprite();
        if (s.getClass()==Returnhome.class){
            Returnhome h =(Returnhome) s;
            h.returnm();
            clock.dispose();
            valider.dispose();
            Solutionframe.dispose();
            picFramePlus.dispose();
            again.dispose();
            msgF.dispose();
            msgT.dispose();
            BaseAsset.i=0;
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            MenuScreen.gameStat.setUpdated_at(formatter.format(date));
            MenuScreen.gameStat.setSuccessful_attempts(Integer.toString(BaseAsset.Ns));
            MenuScreen.gameStat.setFailed_attempts(Integer.toString(BaseAsset.Nf));
        }
        if (s.getClass()==NiveauSprite.class){
            NiveauSprite n =(NiveauSprite) s;
            if(valider.equals(n)){
                if (part2.getX()>pic.getX()){ this.addSprite(msgT); f=1; BaseAsset.Ns++; BaseAsset.voiceg.start();}
                else {this.addSprite(msgF);BaseAsset.Nf++;BaseAsset.voicef.start();}
                if(BaseAsset.i < 3) this.addSprite(again);
                if (BaseAsset.i ==3)this.addSprite(suivant);
            }
            if(again.equals(n)){
                if (f==1 & BaseAsset.i <3) BaseAsset.i++;
                Niveau1S ss= new Niveau1S(game, BaseAsset.i);
                game.setScreen(ss);

            }
            if(suivant.equals(n)){
                BaseAsset.i=0;
                suivant.niveau2();
            }
        }

    }

    public void handleDragging(int x,int y, int pointer){
        //Iterating backwards to Respect the order of sprites
        super.handleDragging(x,y,pointer);
                if(part1.isDragged()){
                    part1.setPosition(x,y);
                if(part1.getX()>(int)Math.round(0.3333*BaseAsset.w_unit)||part1.getY()>(int)Math.round(0.1616*BaseAsset.h_unit)||part1.getY()<(int)Math.round(0.1282*BaseAsset.h_unit)){
                    part1.setX((int)Math.round(0.3055*BaseAsset.w_unit));
                    part1.setY((int)Math.round(0.1449*BaseAsset.h_unit));
                    part2.setX((int)Math.round(0.1111*BaseAsset.w_unit));
                    part2.setY((int)Math.round(0.1449*BaseAsset.h_unit));
                }
                if(part1.getX()<(int)Math.round(0.3055*BaseAsset.w_unit)){
                    part1.setX((int)Math.round(0.0925*BaseAsset.w_unit));
                    part1.setY((int)Math.round(0.1449*BaseAsset.h_unit));
                    part2.setX((int)Math.round(0.3240*BaseAsset.w_unit));
                    part2.setY((int)Math.round(0.1449*BaseAsset.h_unit));
                }
                }

                if(part2.isDragged()){
                part2.setPosition(x,y);
                if(part2.getX()<(int)Math.round(0.3001*BaseAsset.w_unit)||part2.getY()>(int)Math.round(0.1616*BaseAsset.h_unit)||part2.getY()<(int)Math.round(0.1282*BaseAsset.h_unit)){
                    part1.setX((int)Math.round(0.3055*BaseAsset.w_unit));
                    part1.setY((int)Math.round(0.1449*BaseAsset.h_unit));
                    part2.setX((int)Math.round(0.1111*BaseAsset.w_unit));
                    part2.setY((int)Math.round(0.1449*BaseAsset.h_unit));
                }
                if(part2.getX()>(int)Math.round(0.1111*BaseAsset.w_unit)){
                    part1.setX((int)Math.round(0.0925*BaseAsset.w_unit));
                    part1.setY((int)Math.round(0.1449*BaseAsset.h_unit));
                    part2.setX((int)Math.round(0.3240*BaseAsset.w_unit));
                    part2.setY((int)Math.round(0.1449*BaseAsset.h_unit));
                }
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
