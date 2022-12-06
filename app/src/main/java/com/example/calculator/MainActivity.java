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
    public Double num1 = 0.0;
    public Double num2 = 0.0;
    public String result;
    // Create boolean variables for the operation type
    public boolean addition = false;
    public boolean subtraction = false;
    public boolean multiply = false;
    public boolean divide = false;


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

        // Button Three Definitions
        Button three = findViewById(R.id.button3);

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();

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

                String updatedText = (current.getText().toString() + text);
                current.setText(updatedText);
            }
        });

        Button decimal = findViewById(R.id.buttonDecimal);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button)view;
                String text = b.getText().toString();

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
                if (current.getText().toString() != null) {
                    setNum1();
                    previous.setText(previous.getText().toString() + "+");
                    current.setText("");
                    //set operation to true
                    addition = true;
                }

            }
        });
        
        // Subtract Button Definition
        Button sub = findViewById(R.id.buttonSubtract);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current.getText().toString() != null) {
                    setNum1();
                    previous.setText(previous.getText().toString() + "-");
                    current.setText("");
                    //set operation to true
                    subtraction = true;
                }
                else {
                    Button b = (Button)view;
                    String text = b.getText().toString();
                    String updatedText = (current.getText().toString() + text);
                    current.setText(updatedText);
                }
            }
        });

        // Multiply Button Definition
        Button multi = findViewById(R.id.buttonMultiply);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current.getText().toString() != null) {
                    setNum1();
                    previous.setText(previous.getText().toString() + "*");
                    current.setText("");
                    //set operation to true
                    multiply = true;
                }
            }
        });

        // Divide Button Definition
        Button div = findViewById(R.id.buttonDivide);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current.getText().toString() != null) {
                    setNum1();
                    previous.setText(previous.getText().toString() + "/");
                    current.setText("");
                    // set operation to true
                    divide = true;
                }
            }
        });


        // Equals Button Definition

        Button equal = findViewById(R.id.buttonEqual);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (current.getText().toString() != null && num1 != null) {
                    num2 = Double.valueOf(current.getText().toString());


                    calculate();
                    current.setText(result);
                    previous.setText("");

                    //set all operations to false to reset the operation
                    addition = false;
                    subtraction = false;
                    multiply = false;
                    divide = false;
                }
            }
        });

        /** End of Operational Button Definitions*/


        /** A/C and Delete Button definitions */



        // All Clear Button Definition
        Button clear = findViewById(R.id.buttonClear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText("");
                previous.setText("");
                num1 = 0.0;
                num2 = 0.0;
            }
        });


        Button del = findViewById(R.id.buttonDelete);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current.getText().toString() != null) {
                    //Store current in a temp variable.
                    String temp = current.getText().toString();
                    // Create a string buffer to delete the last character
                    StringBuffer sb = new StringBuffer(temp);
                    sb.deleteCharAt(sb.length() - 1);
                    // Set current to the new string with the last character removed
                    current.setText(sb);
                }

            }
        });

        /** End of A/C and Delete Button definitions */


    }

    /** Extra Function Definitions */

    //Set Operands Function
    private void setNum1() {

        previous.setText(current.getText().toString());
        num1 = Double.valueOf(previous.getText().toString());


    }

    // Calculation Function
    private void calculate() {
        double temp = 0;
        
        if (addition) {
            temp = num1 + num2;
        }
        else if (subtraction) {
            temp =  num1 - num2;
        }
        else if (multiply) {
            temp =  num1 * num2;
        }
        else if (divide) {
            temp =  num1 / num2;
        }


        
        result = Double.toString(temp);



    }


}