package com.example.liza_jobtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_startView;
    Button btn_webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_startView = findViewById(R.id.btb_startView);
        btn_startView.setOnClickListener(this);
        btn_webView = findViewById(R.id.btn_webView);
        btn_webView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btb_startView:
                intent = new Intent("AStart");
                startActivity(intent);
                break;
            case R.id.btn_webView:
                intent = new Intent("AWeb");
                startActivity(intent);
                break;
            default: break;
        }
    }
}