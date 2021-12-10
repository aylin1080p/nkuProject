package com.e.nkuproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Login_Activity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private TextView btn_login;
    private Button btn_goSignin;
    String userMail, userPassword;
    EditText signin_email, signin_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        signin_email = findViewById(R.id.signin_email);
        signin_password = findViewById(R.id.signin_password);


        btn_login = findViewById(R.id.btn_login);
        btn_goSignin = findViewById(R.id.btn_Signin);

        btn_goSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login_Activity.this,Signin_Activity.class);
                startActivity(intent);

            }
        });



// login things***************************************************


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userMail = signin_email.getText().toString();
                userPassword = signin_password.getText().toString();

                mAuth.signInWithEmailAndPassword(userMail,
                        userPassword)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){
                            Toast.makeText(getApplicationContext(), "giriş başarılı ", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login_Activity.this,FeedActivity.class);
                            startActivity(intent);
                        }
                        else {
                            // todo incorrect password & mail
                            Toast.makeText(getApplicationContext(), "Kullanıcı adı veya parola hatalı", Toast.LENGTH_SHORT).show();

                        }






                    }
                });

            }
        });
 }
}