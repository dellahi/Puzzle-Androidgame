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
import java.text.SimpleDateFormat;
import java.util.Date;

public class Niveau2S extends Screen {

    private NiveauSprite clock;
    private NiveauSprite part1;
    private NiveauSprite part2;
    private NiveauSprite part3;
    private NiveauSprite part4;
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

    public Niveau2S(Game game, int indice) {
        super(game);
        BaseAsset.clock=game.getGraphics().newImage(R.drawable.clock,Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.valider=game.getGraphics().newImage(R.drawable.vv,Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.Solutionframe=game.getGraphics().newImage(R.drawable.picframe1,Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.picFramePlus=game.getGraphics().newImage(R.drawable.picframe1, Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.again=game.getGraphics().newImage(R.drawable.again, Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.msgf=game.getGraphics().newImage(R.drawable.msf, Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.msgt=game.getGraphics().newImage(R.drawable.msgt, Graphics.ImageFormat.ARGB8888,game.getResources());
        BaseAsset.partN21.add(game.getGraphics().newImage(R.drawable.pic5part1, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN21.add(game.getGraphics().newImage(R.drawable.pic6part1, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN21.add(game.getGraphics().newImage(R.drawable.pic7part1, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN22.add(game.getGraphics().newImage(R.drawable.pic5part2, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN22.add(game.getGraphics().newImage(R.drawable.pic6part2, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.partN22.add(game.getGraphics().newImage(R.drawable.pic7part2, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.part3.add(game.getGraphics().newImage(R.drawable.pic5part3, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.part3.add(game.getGraphics().newImage(R.drawable.pic6part3, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.part3.add(game.getGraphics().newImage(R.drawable.pic7part3, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.part4.add(game.getGraphics().newImage(R.drawable.pic5part4, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.part4.add(game.getGraphics().newImage(R.drawable.pic6part4, Graphics.ImageFormat.ARGB8888,game.getResources()));
        BaseAsset.part4.add(game.getGraphics().newImage(R.drawable.pic7part4, Graphics.ImageFormat.ARGB8888,game.getResources()));

        int w_unit = game.getGraphics().getWidth();
        int h_unit = game.getGraphics().getHeight();
        bg = new MenuSprite(BaseAsset.Nbg,0,0,h_unit,w_unit);
        returnbutton = new Returnhome(game, BaseAsset.Nr,(int)Math.round(0.7870*w_unit),(int)Math.round(0.2229*h_unit),(int)Math.round(0.1114*h_unit),(int)Math.round(0.1851*w_unit));
        Solutionframe = new NiveauSprite(game , BaseAsset.Solutionframe,(int)Math.round(0.0925*w_unit),(int)Math.round(0.1337*h_unit),(int)Math.round(0.2787*h_unit),(int)Math.round(0.4629*w_unit));
        part1 = new NiveauSprite(game ,BaseAsset.partN21.get(indice),(int)Math.round(0.3240*w_unit),(int)Math.round(0.1532*h_unit),(int)Math.round(0.1254*h_unit),(int)Math.round(0.2083*w_unit));
        part2 = new NiveauSprite(game , BaseAsset.partN22.get(indice),(int)Math.round(0.1111*w_unit),(int)Math.round(0.1532*h_unit),(int)Math.round(0.1254*h_unit),(int)Math.round(0.2083*w_unit));
        part3 = new NiveauSprite(game ,BaseAsset.part3.get(indice),(int)Math.round(0.3240*w_unit),(int)Math.round(0.2814*h_unit),(int)Math.round(0.1254*h_unit),(int)Math.round(0.2083*w_unit));
        part4 = new NiveauSprite(game , BaseAsset.part4.get(indice),(int)Math.round(0.1111*w_unit),(int)Math.round(0.2814*h_unit),(int)Math.round(0.1254*h_unit),(int)Math.round(0.2083*w_unit));
        picFramePlus = new NiveauSprite(game , BaseAsset.picFramePlus,(int)Math.round(0.0972*w_unit),(int)Math.round(0.5183*h_unit),(int)Math.round(0.2787*h_unit),(int)Math.round(0.4629*w_unit));
        pic = new NiveauSprite(game , BaseAsset.pict.get(indice+4),(int)Math.round(0.1203*w_unit),(int)Math.round(0.5323*h_unit),(int)Math.round(0.2508*h_unit),(int)Math.round(0.4166*w_unit));
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
        addSprite(part3);
        addSprite(part4);
        addSprite(pic);
        part1.setStatic(false);
        part2.setStatic(false);
        part3.setStatic(false);
        part4.setStatic(false);

        MenuScreen.gameStat.setLevel_id("2");
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
                if (part2.getX()>pic.getX() && part3.getX()<pic.getX()){ this.addSprite(msgT);BaseAsset.Ns++; f=1; BaseAsset.voiceg.start();}
                else {this.addSprite(msgF);BaseAsset.voicef.start();BaseAsset.Nf++;}
                if(BaseAsset.i < 2) this.addSprite(again);
                if (BaseAsset.i ==2)this.addSprite(suivant);
            }
            if(again.equals(n)){
                if (f==1 & BaseAsset.i <2) BaseAsset.i++;
                Niveau2S ss= new Niveau2S(game, BaseAsset.i);
                game.setScreen(ss);

            }
            if(suivant.equals(n)){
                BaseAsset.i=0;
                suivant.niveau3();
            }
        }

    }

    public void handleDragging(int x,int y, int pointer){
        //Iterating backwards to Respect the order of sprites
        super.handleDragging(x,y,pointer);
        if(part1.isDragged()){
            part1.setPosition(x,y);
            if(part1.getX()>(int)Math.round(0.3287*BaseAsset.w_unit)||part1.getY()>(int)Math.round(0.1588*BaseAsset.h_unit)||part1.getY()<(int)Math.round(0.1477*BaseAsset.h_unit)){
                part1.setX((int)Math.round(0.3194*BaseAsset.w_unit));
                part1.setY((int)Math.round(0.1532*BaseAsset.h_unit));
                part2.setX((int)Math.round(0.1111*BaseAsset.w_unit));
                part2.setY((int)Math.round(0.1532*BaseAsset.h_unit));
            }
            if(part1.getX()<(int)Math.round(0.3101*BaseAsset.w_unit)){
                part1.setX((int)Math.round(0.1111*BaseAsset.w_unit));//sol
                part1.setY((int)Math.round(0.1532*BaseAsset.h_unit));
                part2.setX((int)Math.round(0.3194*BaseAsset.w_unit));
                part2.setY((int)Math.round(0.1532*BaseAsset.h_unit));
            }
        }
        if(part2.isDragged()) {
            part2.setPosition(x, y);
            if (part2.getX() < (int)Math.round(0.1018*BaseAsset.w_unit) || part2.getY() > (int)Math.round(0.1588*BaseAsset.h_unit) || part2.getY() < (int)Math.round(0.1477*BaseAsset.h_unit)) {
                part1.setX((int)Math.round(0.3194*BaseAsset.w_unit));
                part1.setY((int)Math.round(0.1532*BaseAsset.h_unit));
                part2.setX((int)Math.round(0.1111*BaseAsset.w_unit));
                part2.setY((int)Math.round(0.1532*BaseAsset.h_unit));
            }
            if (part2.getX() > (int)Math.round(0.1203*BaseAsset.w_unit)) {
                part1.setX((int)Math.round(0.1111*BaseAsset.w_unit));//sol
                part1.setY((int)Math.round(0.1532*BaseAsset.h_unit));
                part2.setX((int)Math.round(0.3194*BaseAsset.w_unit));
                part2.setY((int)Math.round(0.1532*BaseAsset.h_unit));
            }
        }

        if(part3.isDragged()){
            part3.setPosition(x,y);
            if(part3.getX()>(int)Math.round(0.3333*BaseAsset.w_unit)||part3.getY()>(int)Math.round(0.2870*BaseAsset.h_unit)||part3.getY()<(int)Math.round(0.2759*BaseAsset.h_unit)){
                part3.setX((int)Math.round(0.3240*BaseAsset.w_unit));
                part3.setY((int)Math.round(0.2814*BaseAsset.h_unit));
                part4.setX((int)Math.round(0.1111*BaseAsset.w_unit));
                part4.setY((int)Math.round(0.2814*BaseAsset.h_unit));
            }
            if(part3.getX()<(int)Math.round(0.3148*BaseAsset.w_unit)){
                part3.setX((int)Math.round(0.1111*BaseAsset.w_unit));
                part3.setY((int)Math.round(0.2759*BaseAsset.h_unit));
                part4.setX((int)Math.round(0.3194*BaseAsset.w_unit));
                part4.setY((int)Math.round(0.2759*BaseAsset.h_unit));//sol
            }
        }
        if (part4.isDragged()) {
                part4.setPosition(x, y);
                if (part4.getX()<(int)Math.round(0.1018*BaseAsset.w_unit) || part4.getY() < (int)Math.round(0.2759*BaseAsset.h_unit) || part4.getY() > (int)Math.round(0.2870*BaseAsset.h_unit)) {
                    part3.setX((int)Math.round(0.3240*BaseAsset.w_unit));
                    part3.setY((int)Math.round(0.2814*BaseAsset.h_unit));
                    part4.setX((int)Math.round(0.1111*BaseAsset.w_unit));
                    part4.setY((int)Math.round(0.2814*BaseAsset.h_unit));
                }

                if (part4.getX() > (int)Math.round(0.1203*BaseAsset.w_unit)) {
                    part3.setX((int)Math.round(0.1111*BaseAsset.w_unit));
                    part3.setY((int)Math.round(0.2759*BaseAsset.h_unit));
                    part4.setX((int)Math.round(0.3194*BaseAsset.w_unit));
                    part4.setY((int)Math.round(0.2759*BaseAsset.h_unit));//sol
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
