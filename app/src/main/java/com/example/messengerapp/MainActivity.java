package com.example.messengerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View View){
        Intent intent = new Intent(this, ReceiveMessageActivity.class );
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra("message", message);
        startActivity(intent);
    }
}
