package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listv=findViewById(R.id.list);
        final ArrayList <String> arr =new ArrayList<>();
        arr.add("Asera");
        arr.add("Hend");
        arr.add("Shada");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arr);
        listv.setAdapter(adapter);



        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("index", position);
                intent.putExtra("value", String.valueOf(arr.get(position)));
                startActivity(intent);
            }
        });

        /*  Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("index", arr.indexOf(arr));
            intent.putExtra("value", arr.get(1));
            startActivity(intent);
        */



    }
}
