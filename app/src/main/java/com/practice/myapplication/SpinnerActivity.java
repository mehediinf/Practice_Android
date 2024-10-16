package com.practice.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SpinnerActivity extends AppCompatActivity {

    String[] countryName;
    private TextView textView;
    private Button button;
    private Spinner spinner;
    private boolean isFirstSelection = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        countryName = getResources().getStringArray(R.array.county_names);

        textView = findViewById(R.id.txtSpinId);
        button = findViewById(R.id.btnSpnId);
        spinner = findViewById(R.id.spinnerId);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(SpinnerActivity.this,R.layout.sample_activity2,R.id.txtSample2Id,countryName);
        spinner.setAdapter(arrayAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (isFirstSelection==true){
                    isFirstSelection=false;
                }else {

                    Toast.makeText(getApplicationContext(),countryName[i]+" is Selected",Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String value = spinner.getSelectedItem().toString();
//                textView.setText(value);
//
//
//            }
//        });

    }
}