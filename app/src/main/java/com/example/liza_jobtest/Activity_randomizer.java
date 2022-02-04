package com.example.liza_jobtest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_randomizer extends AppCompatActivity implements View.OnClickListener {

    Button btn_start_rand;
    Button btn_stop_rand;
    ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomizer);

        btn_start_rand = findViewById(R.id.btn_start_rand);
        btn_start_rand.setOnClickListener(this);
        btn_stop_rand = findViewById(R.id.btn_stop_rand);
        btn_stop_rand.setOnClickListener(this);

        myImageView = findViewById(R.id.image_wheel);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_start_rand:
                final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                        this, R.anim.rotate_center);
                myImageView.startAnimation(animationRotateCenter);

                break;
            case R.id.btn_stop_rand:
                final Animation animationRotateCenter1 = AnimationUtils.loadAnimation(
                        this, R.anim.stop_rotate_center);
                myImageView.startAnimation(animationRotateCenter1);
                break;
            default: break;
        }
    }
}