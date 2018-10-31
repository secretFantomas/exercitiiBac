package com.example.isabelapuiu.twoactivitieswithtimer;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button nextBtn, startBtn;
    private CountDownTimer countDownTimer;
    private TextView timerText;
    private long timeLeftInMillieSeconds = 600000; // 10 min

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextBtn = (Button) findViewById(R.id.nextBtn);
        startBtn = (Button) findViewById(R.id.startBtn);
        timerText = (TextView) findViewById(R.id.timerText);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });
    }

    private void updateTimer() {
        int minutes = (int) timeLeftInMillieSeconds / 60000;
        int seconds = (int) timeLeftInMillieSeconds % 60000 / 1000;

        String timeLeftText;
        timeLeftText = "" + minutes;
        timeLeftText += ":";

        if (seconds < 10) {
            timeLeftText += "0";

        } else {
            timeLeftText += seconds;
        }

        timerText.setText(timeLeftText);
        Log.i("tag",timeLeftText);
    }

    @Override
    protected void onPause() {
        super.onPause();
        countDownTimer.cancel();
    }

    private void startTimer(){
        countDownTimer = new CountDownTimer(timeLeftInMillieSeconds, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillieSeconds = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (countDownTimer!=null) {
            startTimer();
        }
    }
}
