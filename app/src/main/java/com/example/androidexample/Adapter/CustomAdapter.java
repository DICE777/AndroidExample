package com.example.androidexample.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    ArrayList<MyItem> arrayList = new ArrayList<>();

    @Override
    public int getCount() {
        int count = arrayList.size(); // counts the total number of elements from the arrayList
        return count; // returns the total count to adapter
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return null;
    }
}
