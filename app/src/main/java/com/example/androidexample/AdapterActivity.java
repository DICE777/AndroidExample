package com.example.androidexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.androidexample.Adapter.MyItem;
import com.example.androidexample.Adapter.MyItemView;

import java.util.ArrayList;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        ListView listView = findViewById(R.id.list_view_comment);

        MyAdapter adapter = new MyAdapter();

        adapter.addItem(new MyItem("a", "123"));
        adapter.addItem(new MyItem("bb", "010-123"));
        adapter.addItem(new MyItem("ccc", "010-123-456"));

        listView.setAdapter(adapter);

    }

    class MyAdapter extends BaseAdapter {
        private ArrayList<MyItem> items = new ArrayList<>();

        public void addItem(MyItem item) {
            items.add(item);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            MyItemView view = new MyItemView(getApplicationContext());

            MyItem item = items.get(position);
            view.setId(item.getId());
            view.setPhone(item.getPhone());

            return view;
        }
    }
}
