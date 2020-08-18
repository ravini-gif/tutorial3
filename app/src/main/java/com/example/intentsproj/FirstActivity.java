package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //edit text
        final TextView eNumber1 = findViewById(R.id.viewNumber1);
        final TextView eNumber2 = findViewById(R.id.number2);

       Button btn = findViewById(R.id.btn_ok);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            //get data from edit text
            String no1 = eNumber1.getText().toString();
            String no2 = eNumber2.getText().toString();

            //activity intent
               Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
               intent.putExtra("Number_1", no1);
               intent.putExtra("Number_2", no2);
               startActivity(intent);
           }
       });


    }


    @Override
    protected void onResume() {
        super.onResume();

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the ok button";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
    }
}