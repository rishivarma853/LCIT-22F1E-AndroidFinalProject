package com.rishivarmak853.apps.ema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Explode;

public class LoadingPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingpage);

    }

    @Override
    protected void onStart() {
        super.onStart();
        (new Handler()).postDelayed(()-> {
            startActivity(new Intent(LoadingPageActivity.this,HomePageActivity.class));
            finish();
        },1000);
    }
}