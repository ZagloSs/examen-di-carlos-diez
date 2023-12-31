package com.example.carlosdiez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Arranque extends AppCompatActivity {

    ImageView logo;
    TextView txtLogo;
    Button log, reg;
    Animation slideUpLogo, fadeIn, fadeIn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setNavigationBarColor(ContextCompat.getColor(Arranque.this, R.color.md_theme_light_secondaryContainer));
        getWindow().setStatusBarColor(ContextCompat.getColor(Arranque.this, R.color.md_theme_light_primaryContainer));



        logo = findViewById(R.id.logo);
        txtLogo = findViewById(R.id.sharooktxt);

        log = findViewById(R.id.loginbtn);
        reg = findViewById(R.id.registerbtn);

        slideUpLogo = AnimationUtils.loadAnimation(this, R.anim.slide_up_logo);
        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_slide_in);
        fadeIn2 = AnimationUtils.loadAnimation(this, R.anim.fade_slide_in2);

        logo.startAnimation(slideUpLogo);
        txtLogo.startAnimation(slideUpLogo);
        log.startAnimation(fadeIn);
        reg.startAnimation(fadeIn2);
    }


    public void goToLog(View view){
        Intent intent = new Intent(Arranque.this, Acceso.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

    }

    public void goToRegister(View view){
        Intent intent = new Intent(Arranque.this, Registro.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

    }
}