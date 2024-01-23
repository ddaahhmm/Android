package com.example.step04example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText first,second;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity a = this;
        View.OnClickListener b=this;

        //EditText 객체의 참조값을 얻어와 필드에 저장
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);

        //TextView의 참조값을 얻어와서 필드에 저장
        result=findViewById(R.id.result);

        //버튼에 클릭 리스너 등록
        Button plusBtn = findViewById(R.id.plusBtn);
        Button minusBtn = findViewById(R.id.minusBtn);

        //MainActivity 의 참조값을 전달해서 리스너 등록 +  implements View.OnClickListener 했기 때문에 등록 가능한 것임
        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);

    }

    // MainActivity 를 클릭 리스너로 등록한 View(Button)에 클릭 이벤트가 발생하면 호출되는 메소드

    @Override
    public void onClick(View v) {
        //입력한 내용을 읽어와서 산술연산이 가능한 숫자로 변경
        double num1 = Double.parseDouble(first.getText().toString());
        double num2 = Double.parseDouble(second.getText().toString());
        double result = 0;
        //View type view 에는 이벤트가 발생한 Button 의 참조값이 전달
        int id = v.getId();

        if(id == R.id.plusBtn){
            result = num1+num2;
        }else if(id == R.id.minusBtn){
            result = num1 - num2;
        }

        //계산 결과를 문자열(String) 로 변환하여 TextView에 출력
        String strResult = Double.toString(result);
        //TextView에 출력
        this.result.setText(strResult);

    }
}