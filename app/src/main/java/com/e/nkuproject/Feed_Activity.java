package com.e.nkuproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Feed_Activity extends AppCompatActivity {
    private FloatingActionButton addEventButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);


        addEventButton = (FloatingActionButton) findViewById(R.id.addEventButton);
        addEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo --> Etkinlik Oluşturma Sayfasına Yönlendirilecek
                Intent intent = new Intent(Feed_Activity.this,Add_Event_Activity.class);
                startActivity(intent);

            }
        });










    }


}