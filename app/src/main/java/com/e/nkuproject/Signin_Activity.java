package com.e.nkuproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signin_Activity extends AppCompatActivity {

    private Button btn_loginPage;
    private EditText signin_email;
    private EditText signin_password;
    String userMail, userPassword;
    private Button btn_Signin;

    // firebase things

private FirebaseAuth mAuth;
private FirebaseAuth.AuthStateListener mAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signin_email= findViewById(R.id.signin_email);
        signin_password = findViewById(R.id.signin_password);


        mAuth = FirebaseAuth.getInstance();


        btn_Signin = findViewById(R.id.btn_Signin);
        btn_Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // signing works in here

                userMail = signin_email.getText().toString();
                userPassword = signin_password.getText().toString();

                mAuth.createUserWithEmailAndPassword(userMail,userPassword)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                // create account
                        Toast.makeText(Signin_Activity.this, "kullanıcı oluşturuldu", Toast.LENGTH_SHORT).show();


                    }
                });


            }
        });



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