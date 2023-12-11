package com.example.carlosdiez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
    }

    public void goToRegisterFromLog(View view){
        Intent intent = new Intent(Acceso.this, Registro.class);
        startActivity(intent);
    }

    public void ToastLog(View view){
        Toast.makeText(this, "Login Succeed", Toast.LENGTH_SHORT).show();
    }
}