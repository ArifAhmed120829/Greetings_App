package com.example.greetings_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textview = findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        if(extras == null){
            return ;
        }
        String msg = extras.getString("myName");
        textview.setText("Hello "+msg+ ",Hope you pass the final exam!");

    }
}