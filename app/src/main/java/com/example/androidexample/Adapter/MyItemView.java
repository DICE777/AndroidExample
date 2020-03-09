package com.example.androidexample.Adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidexample.R;

// 뷰를 생성할 때는 필수 생성자가 2개이다.
public class MyItemView extends LinearLayout {
    TextView textView, textView2;

    public MyItemView(Context context) {
        super(context);
        init(context);
    }

    public MyItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.my_item, this, true);

        textView = findViewById(R.id.tv_id);
        textView2 = findViewById(R.id.tv_phone);
    }

    public void setId(String id) {
        textView.setText(id);
    }

    public void setPhone(String phone) {
        textView2.setText(phone);
    }

}
