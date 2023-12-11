package com.example.carlosdiez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Arranque extends AppCompatActivity {

    ImageView logo;
    TextView txtLogo;
    Animation slideUpLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        txtLogo = findViewById(R.id.sharooktxt);

        slideUpLogo = AnimationUtils.loadAnimation(this, R.anim.slide_up_logo);

        logo.startAnimation(slideUpLogo);
        txtLogo.startAnimation(slideUpLogo);


    }
}