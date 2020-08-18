package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txt1;
    TextView txt2;
    String num1;
    String num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent =getIntent();
        num1 = intent.getStringExtra("Number_1");
        num2 = intent.getStringExtra("Number_2");

      txt1 = findViewById(R.id.viewNumber1);
      txt2 = findViewById(R.id.viewNumber2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        txt1.setText(num1);
        txt2.setText(num2);
    }
}