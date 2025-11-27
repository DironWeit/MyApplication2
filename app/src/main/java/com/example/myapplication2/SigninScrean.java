package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SigninScrean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_screan);

    }
    public void onClickInScrean(View view) {
        Intent intent = new Intent(SigninScrean.this, MainScreanActivity.class);
        startActivity(intent);
    }

    public void onClickInReg(View view) {
        Intent intent = new Intent(SigninScrean.this, RegScrean.class);
        startActivity(intent);
    }

//    public void onClickInMain(View view) {
//        Intent intent = new Intent(SigninScrean.this, MainScreanActivity.class);
//        startActivity(intent);
//    }
}