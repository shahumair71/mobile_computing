package com.example.techtravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        getSupportActionBar().hide();

        Thread thread = new Thread() {

            public void run() {
                try {
                    sleep(4000);

                } catch (Exception e) {
                    e.printStackTrace();

                } finally {
                    Intent intent = new Intent(LandingActivity.this, LoginActivity.class);
                    startActivity(intent);


                }
            }
        };
        thread.start();
    }

}