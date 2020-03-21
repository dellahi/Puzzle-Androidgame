package com.ensias.dellahi.puzzlegame.Asset;

import android.media.MediaPlayer;

import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Base.Music;
import com.example.emobadaragaminglib.Implementation.AndroidSound;
import java.util.ArrayList;

public class BaseAsset {

    public static Image clock;
    public static Image winmsg;
    public static Image rm;
    public static Image valider;
    public static Image Solutionframe;
    public static Image picFramePlus;
    public static ArrayList<Image> pict = new ArrayList<>(); // les images non partitionnées
    public static ArrayList<Image> partN11=new ArrayList<>(); //partie 1 des images de Niveau 1
    public static ArrayList<Image> partN12=new ArrayList<>();//partie 2 des images de Niveau 1
    public static ArrayList<Image> partN21=new ArrayList<>();//partie 1 des images de Niveau 2
    public static ArrayList<Image> partN22=new ArrayList<>();//partie 2 des images de Niveau 2
    public static ArrayList<Image> part3=new ArrayList<>();//partie 3 des images de Niveau 2
    public static ArrayList<Image> part4=new ArrayList<>();//partie 4 des images de Niveau 2
    public static ArrayList<Image> partN31=new ArrayList<>();//partie 1 des images de Niveau 3
    public static ArrayList<Image> partN32=new ArrayList<>();//partie 2 des images de Niveau 3
    public static ArrayList<Image> part33=new ArrayList<>();//partie 3 des images de Niveau 3
    public static ArrayList<Image> part34=new ArrayList<>();//partie 4 des images de Niveau 3
    public static Image rideau; // pour Cacher la Photo de Niveau3
    public static Image Nbg;
    public static Image Nr;
    public static Image again;
    public static Image suivant;
    public static Image msgf;
    public static Image msgt;
    public static Music bgM;
    public static MediaPlayer voiceg;
    public static MediaPlayer voicef;
    public static int i;
    public static int w_unit ;
    public static int h_unit ;
    public static int N3T; //Nieau3 Timing
    public static int Ns; //Nombre de succès
    public static int Nf; //Nombre de fautes
    public static Image audimnger;

}