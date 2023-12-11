package com.example.carlosdiez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        getWindow().setNavigationBarColor(ContextCompat.getColor(Registro.this, R.color.md_theme_light_secondaryContainer));
        getWindow().setStatusBarColor(ContextCompat.getColor(Registro.this, R.color.md_theme_light_primaryContainer));
    }


    public void goToLogFromReg(View view){
        Intent intent = new Intent(Registro.this, Acceso.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        finish();
    }

    public void Toast(View view){
        Toast.makeText(this, "Registro completo", Toast.LENGTH_SHORT).show();
    }
}