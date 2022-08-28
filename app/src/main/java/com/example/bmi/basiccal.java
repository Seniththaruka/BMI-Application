package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class basiccal extends AppCompatActivity {

    Button prev;
    Button b1,b2,b3,b4;
    TextView rs;
    EditText n1,n2;

    float result;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basiccal);

        prev = findViewById(R.id.btnbmi);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bmi = new Intent(basiccal.this,MainActivity.class);
                startActivity(bmi);
            }
        });

        b1=findViewById(R.id.btnplus);
        b2=findViewById(R.id.btnmin);
        b3=findViewById(R.id.btndiv);
        b4=findViewById(R.id.btnmulti);


        rs=findViewById(R.id.txt);
        n1=findViewById(R.id.number1);
        n2=findViewById(R.id.number2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result=num1+num2;

                rs.setText(String.valueOf(result));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result=num1-num2;

                rs.setText(String.valueOf(result));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result=num1/num2;

                rs.setText(String.valueOf(result));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result=num1*num2;

                rs.setText(String.valueOf(result));
            }
        });

    }
}