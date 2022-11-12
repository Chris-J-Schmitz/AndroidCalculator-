package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare variable of the current and previous operand text view
    private TextView current;
    private TextView previous;
    // Create empty variables to hold numbers
    public Integer num1 = 0;
    public Integer num2 = 0;
    public String result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define the current and previous operand
        current = findViewById(R.id.currentOperand);
        previous = findViewById(R.id.currentOperand2);


        /**  Numeric Button Definitions*/
        // Button One Definitions
        Button one = findViewById(R.id.button1);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString()) == "+") {
                    current.setText("");
                }
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
                if ((current.getText().toString()) == "+") {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Three Definitions
        Button three = findViewById(R.id.button3);

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString()) == "+") {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Four Definitions
        Button four = findViewById(R.id.button4);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString() == "+")) {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Five Definitions
        Button five = findViewById(R.id.button5);

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString() == "+")) {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Six Definitions
        Button six = findViewById(R.id.button6);

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString() == "+")) {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Seven Definitions
        Button seven = findViewById(R.id.button7);

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString() == "+")) {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Eight Definitions
        Button eight = findViewById(R.id.button8);

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString() == "+")) {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Nine Definitions
        Button nine = findViewById(R.id.button9);

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString() == "+")) {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        // Button Zero Definitions
        Button zero = findViewById(R.id.button0);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();
                if ((current.getText().toString() == "+")) {
                    current.setText("");
                }
                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        /** End of Numeric Button Definitions */



        /**  Operational Button Definitions*/

        // Addition Button Definition

        Button add = findViewById(R.id.buttonAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setOperands();
                current.setText("+");

            }
        });


        // Equals Button Definition

        Button equal = findViewById(R.id.buttonEqual);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num2 = Integer.valueOf(current.getText().toString());


                calculate();
                current.setText(result);
                previous.setText("");
            }
        });



    }

    //Set Operands Function
    private void setOperands() {

        previous.setText(current.getText().toString());
        num1 = Integer.valueOf(previous.getText().toString());


    }

    // Calculation Function
    private void calculate() {
        int temp = num1 + num2;
        result = Integer.toString(temp);



    }


}