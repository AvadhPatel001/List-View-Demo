package com.example.listviewpractice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;
//    String[] list = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10"};

    String[] list = new String[100];
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        for (int i = 0; i < 100; i++) {
            list[i] = "Item "+(i+1);
        }

//        <----------Default Adapter with Default android layout...----------------->
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
//        listView.setAdapter(adapter);

        My_Adapter adapter = new My_Adapter(this, R.layout.my_adapter_view, list);
        listView.setAdapter(adapter);
    }
}