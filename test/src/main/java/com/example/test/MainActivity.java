package com.example.test;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    EditText inputNum;
    Button testBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testBtn = findViewById(R.id.testBtn);

        testBtn.setOnClickListener(v->{

            inputNum = findViewById(R.id.inputNum);
            int result = Integer.parseInt(inputNum.getText().toString());
            String msg;

            if(result %2 ==0){
                msg = "짝수입니다.";
            }else{
                msg = "홀수입니다.";
            }


            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();


        });


    }




}