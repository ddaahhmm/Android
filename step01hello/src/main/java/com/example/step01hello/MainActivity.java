package com.example.step01hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //res/layout/activity_main.xml 문서를 전개해서 화면 구성
        setContentView(R.layout.activity_main);
    }


    public void clicked(View v){
        Log.d("MainActivity", "ButtonClicked");
    }
}