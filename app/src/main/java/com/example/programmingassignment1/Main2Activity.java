package com.example.programmingassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textViewSum,textViewMultiply;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewSum=findViewById(R.id.sumTextView);
        textViewMultiply=findViewById(R.id.multiplyTextView);
        button1=findViewById(R.id.button1);
        Intent intent=getIntent();
        String text1=intent.getStringExtra("sumstring");
        textViewSum.setText(text1);
        String text2=intent.getStringExtra("multiplystring");
        textViewMultiply.setText(text2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent1);
            }
        });

    }
}
