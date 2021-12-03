package com.e.nkuproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Login_Activity extends AppCompatActivity {

    private TextView btn_login;
    private Button btn_goSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        btn_goSignin = findViewById(R.id.btn_Signin);

        btn_goSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login_Activity.this,Signin_Activity.class);
                startActivity(intent);

            }
        });




        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });




    }
}