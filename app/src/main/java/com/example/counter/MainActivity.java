package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = (Button)findViewById(R.id.button);
        Button reset = (Button)findViewById(R.id.button2);
        final TextView Antor = (TextView)findViewById(R.id.textView);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+1;
                String s = Integer.toString(a);
                Antor.setText(s);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                Antor.setText("0");
            }
        });


    }
}