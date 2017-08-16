package com.example.tngp17_001.homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView inputValue;
    private ImageView playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();
    }

    private void initInstance() {
        inputValue = (TextView) findViewById(R.id.input);
        playBtn = (ImageView) findViewById(R.id.playBtn);

        playBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view == playBtn) {
            playBotton();
        }
    }

    protected void playBotton() {
        String input = inputValue.getText().toString();
        Intent intent = new Intent(MainActivity.this, CountdownActivity.class);
        intent.putExtra("input", input);
        startActivity(intent);

    }

}
