package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button b1,next;
    EditText wt, ht;
    TextView rslt1, rslt2;
    float weight , height , result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btncal);
        wt = findViewById(R.id.weight);
        ht = findViewById(R.id.height);
        rslt1 = findViewById(R.id.txtresult);
        rslt2 = findViewById(R.id.txtresult2);
        next = findViewById(R.id.btnbasic);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cal = new Intent(MainActivity.this , basiccal.class);
                startActivity(cal);
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight=Float.parseFloat(wt.getText().toString());
                height=Float.parseFloat(ht.getText().toString());

                result=weight/(height*height);

                rslt1.setText(String.valueOf(result));

                if(result>30){
                    rslt2.setText("Obese");
                    rslt2.setTextColor(Color.RED);

                }

                else if(result>25){
                    rslt2.setText("Overweight");
                    rslt2.setTextColor(Color.RED);
                }

                else if(result>18.5){
                    rslt2.setText("Normal Weight");
                    rslt2.setTextColor(Color.GREEN);
                }

                else{
                    rslt2.setText("Underweight");
                    rslt2.setTextColor(Color.YELLOW);
                }

            }
        });





    }
}