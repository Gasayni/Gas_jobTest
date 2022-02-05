package com.example.liza_jobtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity_randomizer extends AppCompatActivity implements View.OnClickListener {

    Button btn_start_rand;
    Button btn_score_rand;
    ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomizer);

        btn_start_rand = findViewById(R.id.btn_start_rand);
        btn_start_rand.setOnClickListener(this);
        btn_score_rand = findViewById(R.id.btn_score_rand);
        btn_score_rand.setOnClickListener(this);

        myImageView = findViewById(R.id.image_wheel);
    }

    @Override
    public void onClick(View v) {
        int segment_number=0;
        Animation animationRotateCenter;
        Animation animationRotateCenter1 = AnimationUtils.loadAnimation(
                this, R.anim.stop_rotate_center_5);;


        switch (v.getId()) {
            case R.id.btn_start_rand:
                Log.d("Gas_Log", "Нажимаем на start");

                animationRotateCenter = AnimationUtils.loadAnimation(
                        this, R.anim.rotate_center );
                myImageView.startAnimation(animationRotateCenter);

                StopWatch.start();
                break;
            case R.id.btn_score_rand:
                // считаем попавшийся сегмент, загоняя туда секундомер
                Log.d("Gas_Log", "Нажимаем на score");

                segment_number = Solution_wheel.sulution(StopWatch.stop());
                String s_segment_number = "" + segment_number;

                myImageView.getRotation();
                switch (segment_number){
                    case 5:
                        animationRotateCenter1 = AnimationUtils.loadAnimation(
                                this, R.anim.stop_rotate_center_5);
                        break;
                    case 10:
                        animationRotateCenter1 = AnimationUtils.loadAnimation(
                                this, R.anim.stop_rotate_center_10);
                        break;
                    case 15:
                        animationRotateCenter1 = AnimationUtils.loadAnimation(
                                this, R.anim.stop_rotate_center_15);
                        break;
                    case 20:
                        animationRotateCenter1 = AnimationUtils.loadAnimation(
                                this, R.anim.stop_rotate_center_20);
                        break;
                    case 25:
                        animationRotateCenter1 = AnimationUtils.loadAnimation(
                                this, R.anim.stop_rotate_center_25);
                        break;
                    case 30:
                        animationRotateCenter1 = AnimationUtils.loadAnimation(
                                this, R.anim.stop_rotate_center_30);
                        break;
                    case 35:
                        animationRotateCenter1 = AnimationUtils.loadAnimation(
                                this, R.anim.stop_rotate_center_35);
                        break;
                }
                myImageView.startAnimation(animationRotateCenter1);

                Log.d("Gas_Log", "Говорим тост");
                Toast toast = Toast.makeText(getApplicationContext(),s_segment_number,Toast.LENGTH_SHORT);
                toast.show();
                break;
            default: break;
        }
    }
}