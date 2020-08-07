package com.example.colorful;

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

    private Button[] mColors = {mBtnRed, mBtnOrange, mBtnYellow, mBtnGreen, mBtnBlue, mBtnIndigo, mBtnViolet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews(){
        mBtnRed = findViewById(R.id.btn_red);
        mBtnOrange = findViewById(R.id.btn_orange);
        mBtnYellow = findViewById(R.id.btn_yellow);
        mBtnGreen = findViewById(R.id.btn_green);
        mBtnBlue = findViewById(R.id.btn_blue);
        mBtnIndigo = findViewById(R.id.btn_indigo);
        mBtnViolet = findViewById(R.id.btn_violet);
    }

    private void setListeners(){
        mBtnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnRed.setVisibility(View.GONE);
                mBtnOrange.setText(R.string.color1);
                mBtnYellow.setText(R.string.color1);
                mBtnGreen.setText(R.string.color1);
                mBtnBlue.setText(R.string.color1);
                mBtnIndigo.setText(R.string.color1);
                mBtnViolet.setText(R.string.color1);
                /*for (int i = 0;i<=mColors.length; i++){
                    if (!mBtnRed.getText().equals(mColors[i].getText())){
                        mColors[i].setText(R.string.color1);
                    }
                }*/
            }

        });
        mBtnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnOrange.setVisibility(View.GONE);
                mBtnRed.setText(R.string.color2);
                mBtnYellow.setText(R.string.color2);
                mBtnGreen.setText(R.string.color2);
                mBtnBlue.setText(R.string.color2);
                mBtnIndigo.setText(R.string.color2);
                mBtnViolet.setText(R.string.color2);
            }
        });

        mBtnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnYellow.setVisibility(View.GONE);
                mBtnOrange.setText(R.string.color3);
                mBtnRed.setText(R.string.color3);
                mBtnGreen.setText(R.string.color3);
                mBtnBlue.setText(R.string.color3);
                mBtnIndigo.setText(R.string.color3);
                mBtnViolet.setText(R.string.color3);
            }
        });

        mBtnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnGreen.setVisibility(View.GONE);
                mBtnOrange.setText(R.string.color4);
                mBtnYellow.setText(R.string.color4);
                mBtnRed.setText(R.string.color4);
                mBtnBlue.setText(R.string.color4);
                mBtnIndigo.setText(R.string.color4);
                mBtnViolet.setText(R.string.color4);
            }
        });

        mBtnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnBlue.setVisibility(View.GONE);
                mBtnOrange.setText(R.string.color5);
                mBtnYellow.setText(R.string.color5);
                mBtnGreen.setText(R.string.color5);
                mBtnRed.setText(R.string.color5);
                mBtnIndigo.setText(R.string.color5);
                mBtnViolet.setText(R.string.color5);
            }
        });

        mBtnIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnIndigo.setVisibility(View.GONE);
                mBtnOrange.setText(R.string.color6);
                mBtnYellow.setText(R.string.color6);
                mBtnGreen.setText(R.string.color6);
                mBtnBlue.setText(R.string.color6);
                mBtnRed.setText(R.string.color6);
                mBtnViolet.setText(R.string.color6);
            }
        });

        mBtnViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBtnViolet.setVisibility(View.GONE);
                mBtnOrange.setText(R.string.color7);
                mBtnYellow.setText(R.string.color7);
                mBtnGreen.setText(R.string.color7);
                mBtnBlue.setText(R.string.color7);
                mBtnIndigo.setText(R.string.color7);
                mBtnRed.setText(R.string.color7);
            }
        });
    }

}