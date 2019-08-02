package com.example.duan1_qlynuochoa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.example.duan1_qlynuochoa.R;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CountDownTimer countDownTimer = new CountDownTimer(3000,3000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                finish();
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        }.start();
    }
}
