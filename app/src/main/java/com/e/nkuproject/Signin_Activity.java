package com.e.nkuproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signin_Activity extends AppCompatActivity {

    private Button btn_loginPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btn_loginPage = findViewById(R.id.btn_loginPage);
        btn_loginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signin_Activity.this , Login_Activity.class);
                startActivity(intent);


            }
        });



    }
}