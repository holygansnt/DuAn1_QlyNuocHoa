package com.example.duan1_qlynuochoa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.duan1_qlynuochoa.R;

public class LoginActivity extends AppCompatActivity {
    private ImageView imgLogo;
    private EditText edEmail;
    private EditText edPass;
    private Button btnSignIn;
    private Button btnSignFB;
    private TextView tvSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imgLogo = findViewById(R.id.img_logo);
        edEmail = findViewById(R.id.edEmail);
        edPass = findViewById(R.id.edPass);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignFB = findViewById(R.id.btnSignFB);
        tvSignUp = findViewById(R.id.tvSignUp);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Nav_HomeActivity.class));
            }
        });
    }
}
