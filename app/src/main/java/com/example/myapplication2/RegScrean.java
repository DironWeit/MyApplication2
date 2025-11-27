package com.example.myapplication2;

import android.content.Intent;
import android.graphics.Insets;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegScrean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aaction_teg_screan);

    }

    public void onClickInLodin(View view) {
        Intent intent = new Intent(RegScrean.this, SigninScrean.class);
        startActivity(intent);
    }
}
