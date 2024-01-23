package com.example.step06customlistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//BaseAdapter 추상 클래스를 상속 받아 만든다
public class CountryAdapter extends BaseAdapter {
    //필드
    Context context;
    int layoutRes;
    List<CountryDto> list;

    //생성자 (컨텍스트, cell 의 layout 리소스 아이디, 모델)
    public CountryAdapter(Context context, int layoutRes, List<CountryDto> list) {
        this.context = context;
        this.layoutRes = layoutRes;
        this.list = list;
    }

    //모델의 개수 (cell의 개수)
    @Override
    public int getCount() {
        return list.size();
    }

    // i번째 인덱스의 아이템 리턴
    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    //i번째 인덱스의 아이템 아이디(pk)
    @Override
    public long getItemId(int i) {
        //없으면 인덱스를 리턴
        return i;
    }

    // i번째 cell view 를 만들어서 리턴
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //list.get(i)인 CountryDto와 listview_cell.xml을 이용해서 View를 만들어서 리턴
        Log.d("CountryAdapter", "getView() 호출됨 i : " + i);

        //만일 null 이면
        if(view ==null){
            Log.d("CountryAdapter","view 가 null이어서 cell view를 새로 만듭니다.");
            //레이아웃 xml 문서를 전개해서 View 객체를 새로 만든다.
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(layoutRes,viewGroup,false); //View type return
        }

        //i에 해당되는 CountryDto 객체
        CountryDto dto = list.get(i);

        //View 객체 안에 있는 ImageView, TextView의 참조값을 얻어온다.
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);

        //ImageView, TextView에 정보를 출력한다.
        imageView.setImageResource(dto.getResId());


        //i번째 인덱스에 해당 하는View 를 리턴
        return view;

    }
}
