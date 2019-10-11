package com.example.programmingassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2,editText3;
    Button button;
    int number1,number2,number3;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.numberEditText1);
        editText2=findViewById(R.id.numberEditText2);
        editText3=findViewById(R.id.numberEditText3);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number1=Integer.parseInt(editText1.getText().toString());//converting editText to string and then string to int
                number2=Integer.parseInt(editText2.getText().toString());
                number3=Integer.parseInt(editText3.getText().toString());
                final int sum = number1 + number2 + number3;        //addition of two numbers
                final int multiply=number1*number2*number3;//multiplicarion of two numbers
                final String sumstring=Integer.toString(sum);       //converting sum to string
                final String multiplystring=Integer.toString(multiply); //converting multiply to string
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("sumstring",sumstring);
                intent.putExtra("multiplystring",multiplystring);
                startActivity(intent);
            }
        });


    }
}
