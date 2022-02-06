package com.example.liza_jobtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private static final int a = (int) (Math.random() * 2);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent;
        if (a==1){
            intent = new Intent("AStart");
            startActivity(intent);
        } else {
            intent = new Intent("AWeb");
            startActivity(intent);
        }
    }
}