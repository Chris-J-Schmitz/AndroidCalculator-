package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        current = findViewById(R.id.currentOperand);

        // Button One Definitions
        Button one = findViewById(R.id.button1);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Two Definitions
        Button two = findViewById(R.id.button2);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });


    }


}