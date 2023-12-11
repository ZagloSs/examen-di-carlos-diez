package com.example.carlosdiez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        getWindow().setNavigationBarColor(ContextCompat.getColor(Acceso.this, R.color.md_theme_light_secondaryContainer));
        getWindow().setStatusBarColor(ContextCompat.getColor(Acceso.this, R.color.md_theme_light_primaryContainer));
    }

    public void goToRegisterFromLog(View view){
        Intent intent = new Intent(Acceso.this, Registro.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        finish();
    }

    public void ToastLog(View view){
        Toast.makeText(this, "Login Succeed", Toast.LENGTH_SHORT).show();
    }
}