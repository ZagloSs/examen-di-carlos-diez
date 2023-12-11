package com.example.carlosdiez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Acceso extends AppCompatActivity {

    EditText usr, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        getWindow().setNavigationBarColor(ContextCompat.getColor(Acceso.this, R.color.md_theme_light_secondaryContainer));
        getWindow().setStatusBarColor(ContextCompat.getColor(Acceso.this, R.color.md_theme_light_primaryContainer));
        usr = findViewById(R.id.editTextTextEmailAddress);
        pass = findViewById(R.id.editTextTextPassword);
    }

    public void goToRegisterFromLog(View view){
        Intent intent = new Intent(Acceso.this, Registro.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        finish();
    }

    public void ToastLog(View view){
        if(usr.getText().toString().equals("")){
            usr.setError("Please complete this field");
            usr.requestFocus();
        }else if(pass.getText().toString().equals("")){
            pass.setError("Please complete this field");
            pass.requestFocus();
        }else{
            Toast.makeText(this, "Login Succeed", Toast.LENGTH_SHORT).show();
        }

    }
}