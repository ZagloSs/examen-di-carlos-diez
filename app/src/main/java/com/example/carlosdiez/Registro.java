package com.example.carlosdiez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void goToLogFromReg(View view){
        Intent intent = new Intent(Registro.this, Acceso.class);
        startActivity(intent);
    }

    public void Toast(View view){
        Toast.makeText(this, "Registro completo", Toast.LENGTH_SHORT).show();
    }
}