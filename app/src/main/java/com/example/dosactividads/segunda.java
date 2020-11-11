package com.example.dosactividads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class segunda extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intent = getIntent();
        String valor = intent.getStringExtra(EXTRA_MESSAGE);
        TextView label = (TextView) findViewById(R.id.textViewMessage);
        label.setText(valor);

    }
}