package com.example.antonio.felicitacionnavidea;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente= Typeface.createFromAsset(getAssets(), "Christmas Jumper.ttf");

        TextView tituloarriba = (TextView) findViewById(R.id.tituloarriba);
        tituloarriba.setTypeface(miFuente);

        TextView tituloabajo = (TextView) findViewById(R.id.tituloabajo);
        tituloabajo.setTypeface(miFuente);

        TextView tituloabajo2 = (TextView) findViewById(R.id.tituloabajo2);
        tituloabajo2.setTypeface(miFuente);

        Animation animacion= AnimationUtils.loadAnimation(this,R.anim.animacion);
        tituloarriba.startAnimation(animacion);


        Animation animacion2= AnimationUtils.loadAnimation(this,R.anim.slideup);
        tituloabajo.startAnimation(animacion2);
        tituloabajo2.startAnimation(animacion2);

        MediaPlayer mediaplayer = MediaPlayer.create(this,R.raw.musicanavidad);
        mediaplayer.start();

    }
}
