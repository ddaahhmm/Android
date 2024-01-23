package com.example.step05listview;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,
        AdapterView.OnItemLongClickListener{
    List<String> names;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sample data
        names = new ArrayList<>();
        names.add("AAA");
        names.add("BBB");
        names.add("CCC");
        /*for(int i=0;i<200;i++){
            names.add("XXX"+i);
        }*/
        //ListView에 연결할 어댑터
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,names);

        //ListView의 참조값 얻어오기
        ListView listView=findViewById(R.id.listView);

        //listView에 어댑터 연결하기
        listView.setAdapter(adapter);

        //버튼에 리스너 등록하기
        Button addBtn=findViewById(R.id.addBtn);
        addBtn.setOnClickListener(v->{
            //1.EditText 에 입력한 문자열 읽어와서
            EditText inputName=findViewById(R.id.inputName);
            String name = inputName.getText().toString();

            //2. names(모델)에 추가하고
            names.add(name);

            //3.어댑터에 모델이 변경됬다고 알림
            adapter.notifyDataSetChanged();

            //4.EditText에 입력한 내용 지우기
            inputName.setText("");

            //5.마지막 위치까지 부드럽게 스크롤
            int position = adapter.getCount();
            listView.smoothScrollToPosition(position);
            listView.setOnItemClickListener(this);

        });

        //listView에 AdapterView.ItemClickListener 등록하기
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        /* parent => ListView
        view => cell view (TextView)
        position => 클릭한 cell 의 인덱스
        id => 클릭한 cell 의 아이템 아이디(Primary Key) 가 있다면 해당 아이디, 없으면 index가 전달)
        * */
        Log.d("MainActivity", "position : " +position);
        //클릭한 cell 에 출력된 이름
        String name = names.get(position);

        //Toast 메시지로 출력
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();

    }


    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        new AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("Do you Delete?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    //Long Click 된 cell 의 index => position
                    names.remove(position);

                    //UI update
                    adapter.notifyDataSetChanged();

                })
                .setNegativeButton("No", null)
                .create()
                .show();
        return false;
    }
}