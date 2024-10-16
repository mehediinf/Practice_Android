package com.practice.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    private String[] countryNames;

    int[] flags = {R.drawable.afghanistan_icon,R.drawable.armenia_icon,R.drawable.azerbaijan_icon,R.drawable.bahrain_icon,
            R.drawable.bangladesh_icon,R.drawable.bhutan_icon,R.drawable.china_icon,R.drawable.indonesia_icon,R.drawable.india_icon,
            R.drawable.iran_icon,R.drawable.iraq_icon,R.drawable.japan_icon,R.drawable.kazakhstan_icon,R.drawable.nepal_icon,
            R.drawable.pakistan_icon,R.drawable.sri_lanka_icon,R.drawable.turkey_icon

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countryNames = getResources().getStringArray(R.array.county_names);
        gridView = findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = countryNames[position];
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_SHORT).show();


            }
        });



    }
}