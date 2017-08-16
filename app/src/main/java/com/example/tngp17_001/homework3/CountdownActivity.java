package com.example.tngp17_001.homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CountdownActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textNumCount;
    private Intent intent;
    private ImageView countBtn;
    int numCount = 0;
    int target;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);
        initInstance();

    }

    private void initInstance() {
        textNumCount = (TextView) findViewById(R.id.textCount);
        countBtn = (ImageView) findViewById(R.id.countBtn);
        intent = getIntent();
        String targetString = intent.getStringExtra("input");
        target = Integer.parseInt(targetString);

        countBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == countBtn) {
            countUp();
        }
    }

    protected void countUp() {
        numCount += 1;
        textNumCount.setText(String.valueOf(numCount));
        if (numCount == target) {
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
