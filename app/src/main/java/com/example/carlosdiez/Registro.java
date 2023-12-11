package com.example.carlosdiez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText user1, user2, pass1, pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        getWindow().setNavigationBarColor(ContextCompat.getColor(Registro.this, R.color.md_theme_light_secondaryContainer));
        getWindow().setStatusBarColor(ContextCompat.getColor(Registro.this, R.color.md_theme_light_primaryContainer));

        user1 = findViewById(R.id.editTextTextEmailAddress);
        user2 = findViewById(R.id.editTextTextEmailAddress2);

        pass1 = findViewById(R.id.editTextTextPassword);
        pass2 = findViewById(R.id.editTextTextPassword2);
    }


    public void goToLogFromReg(View view){
        Intent intent = new Intent(Registro.this, Acceso.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        finish();
    }

    public void Toast(View view){
        if(user2.getText().toString().equals("")) {
            user2.setError("Please complete this field");
            user2.requestFocus();
        }else if(user1.getText().toString().equals("")){
            user1.setError("Please complete this field");
            user1.requestFocus();
        }else if(pass1.getText().toString().equals("")) {
            pass1.setError("Please complete this field");
            pass1.requestFocus();
        }else if(pass2.getText().toString().equals("")){
            pass2.setError("Please complete this field");
            pass2.requestFocus();
        }else{
            Toast.makeText(this, "Register Succeed", Toast.LENGTH_SHORT).show();
        }
    }
}