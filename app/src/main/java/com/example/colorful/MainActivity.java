package com.example.colorful;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button mBtnRed;
    private Button mBtnOrange;
    private Button mBtnYellow;
    private Button mBtnGreen;
    private Button mBtnBlue;
    private Button mBtnIndigo;
    private Button mBtnViolet;

    private int[] mIds = {R.id.btn_red, R.id.btn_orange, R.id.btn_yellow, R.id.btn_green, R.id.btn_blue, R.id.btn_indigo, R.id.btn_violet};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    private void findViews() {

        mBtnRed = findViewById(R.id.btn_red);
        mBtnOrange = findViewById(R.id.btn_orange);
        mBtnYellow = findViewById(R.id.btn_yellow);
        mBtnGreen = findViewById(R.id.btn_green);
        mBtnBlue = findViewById(R.id.btn_blue);
        mBtnIndigo = findViewById(R.id.btn_indigo);
        mBtnViolet = findViewById(R.id.btn_violet);
    }

    private void setListeners() {

        final Button[] mColors = {mBtnRed, mBtnOrange, mBtnYellow, mBtnGreen, mBtnBlue, mBtnIndigo, mBtnViolet};
        for (int id : mIds) {
            final Button button = findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    button.setVisibility(View.GONE);
                    for (Button btn : mColors) {
                        btn.setText(button.getText());
                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                button.setVisibility(View.VISIBLE);
                                setDefault();
                            }
                        }, 5000);
                    }
                }
            });
        }

    }

    private void setDefault() {
        mBtnRed.setText(R.string.color1);
        mBtnOrange.setText(R.string.color2);
        mBtnYellow.setText(R.string.color3);
        mBtnGreen.setText(R.string.color4);
        mBtnBlue.setText(R.string.color5);
        mBtnIndigo.setText(R.string.color6);
        mBtnViolet.setText(R.string.color7);
    }

}