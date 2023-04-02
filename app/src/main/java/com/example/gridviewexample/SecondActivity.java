package com.example.gridviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.gridviewexample.adapter.CustomAdapter;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView img = findViewById(R.id.selected_image);
        Intent intent = getIntent();
        int position = intent.getExtras().getInt("images");
        CustomAdapter customAdapter = new CustomAdapter(this);

        img.setImageResource(customAdapter.logo[position]);
    }
}