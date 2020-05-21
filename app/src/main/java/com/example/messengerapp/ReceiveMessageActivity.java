package com.example.messengerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        String message = getIntent().getStringExtra("message");
        TextView textViewMessage = findViewById(R.id.message);
        textViewMessage.setText(message);
    }
}
