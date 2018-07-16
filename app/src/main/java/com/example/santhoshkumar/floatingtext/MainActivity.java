package com.example.santhoshkumar.floatingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView fname, lname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = (AutoCompleteTextView)findViewById(R.id.firstName);
        lname = (AutoCompleteTextView)findViewById(R.id.LastName);
        String [] names= {"sandy","kumar"};

        //using predefined dropdown item
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,names);

        //For Custom Design
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_autocompleteview,names);

        fname.setThreshold(1);
        fname.setAdapter(adapter);
        lname.setThreshold(1);
        lname.setAdapter(adapter);
    }
}
