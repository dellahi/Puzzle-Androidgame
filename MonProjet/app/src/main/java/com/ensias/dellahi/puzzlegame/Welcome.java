package com.ensias.dellahi.puzzlegame;

import android.media.MediaPlayer;

import com.e_mobadara.audiomanaging.moblibAudioFileManager;
import com.ensias.dellahi.puzzlegame.Asset.BaseAsset;
import com.ensias.dellahi.puzzlegame.Asset.MenuAsset;
import com.ensias.dellahi.puzzlegame.Asset.WelcomeAsset;
import com.ensias.dellahi.puzzlegame.Screen.MenuScreen;
import com.ensias.dellahi.puzzlegame.Screen.WelcomeScreen;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.example.emobadaragaminglib.Implementation.AndroidSound;
import com.example.ensias_auth_library.FoxyAuth;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Welcome extends AndroidGame {
    @Override
    public Screen getInitScreen() {

        // Affectation des sprites communs aux interface
        WelcomeAsset.bg=getGraphics().newImage(R.drawable.puzzlebg1,Graphics.ImageFormat.ARGB8888,getResources());
        MenuAsset.returnbutton=getGraphics().newImage(R.drawable.retour,Graphics.ImageFormat.ARGB8888,getResources());
        BaseAsset.Nbg=getGraphics().newImage(R.drawable.bgc, Graphics.ImageFormat.ARGB8888,getResources());
        BaseAsset.Nr=getGraphics().newImage(R.drawable.rettr, Graphics.ImageFormat.ARGB8888,getResources());
        BaseAsset.bgM = getAudio().createMusic(R.raw.puzzlebg);
        BaseAsset.audimnger = getGraphics().newImage(R.drawable.setng,Graphics.ImageFormat.ARGB8888,getResources());
        //Affctation des audios
        BaseAsset.voiceg= moblibAudioFileManager.getRandomAudioFile(this,"excellent","FR");
        BaseAsset.voicef= moblibAudioFileManager.getRandomAudioFile(this,"encouragement","FR");
        if (BaseAsset.voicef == null )  BaseAsset.voicef= MediaPlayer.create(this,R.raw.allez);
        if (BaseAsset.voiceg == null ) BaseAsset.voiceg= MediaPlayer.create(this,R.raw.bravo);

        BaseAsset.i = 0;
        BaseAsset.suivant=getGraphics().newImage(R.drawable.niveaus, Graphics.ImageFormat.ARGB8888,getResources());
        WelcomeAsset.exit=getGraphics().newImage(R.drawable.sortir, Graphics.ImageFormat.ARGB8888,getResources());

        // Affectation des dimenssion de l'écran du télephone
        BaseAsset.w_unit = this.getGraphics().getWidth();
        BaseAsset.h_unit = this.getGraphics().getHeight();

        //Ajout des photos (solutions )
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic1, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic2, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic3, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic4, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic5, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic6, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic7, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic8, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic9, Graphics.ImageFormat.ARGB8888,getResources()));
        BaseAsset.pict.add(getGraphics().newImage(R.drawable.pic10, Graphics.ImageFormat.ARGB8888,getResources()));

        //Authentification
        FoxyAuth.emerge(this,Welcome.class);
        MenuScreen.gameStat.setApp_id("2019_2_3_1");
        MenuScreen.gameStat.setExercise_id("T_5_18");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        MenuScreen.gameStat.setCreated_at(formatter.format(date));
        FoxyAuth.storeGameStat(this,MenuScreen.gameStat);
        return new WelcomeScreen(this);

    }
}
