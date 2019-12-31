package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView vtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        int in = i.getIntExtra("index",-1);
        String v = i.getStringExtra("value");

        vtext = findViewById(R.id.text);
        vtext.setText(in+"\nuser name :"+v);
    }
}
