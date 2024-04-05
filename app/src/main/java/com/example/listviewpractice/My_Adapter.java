package com.example.listviewpractice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class My_Adapter extends ArrayAdapter<String> {

    private String[] list;
    private Context context;

    public My_Adapter(@NonNull Context context, int resource, @NonNull String[] list) {
        super(context, resource, list);
        this.list = list;
        this.context = context;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return  list[position];
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_adapter_view, parent, false);
        TextView textView = convertView.findViewById(R.id.textView);
        textView.setText(getItem(position));

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click on item "+(position + 1), Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }

}
