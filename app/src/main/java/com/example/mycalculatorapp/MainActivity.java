package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //test for at home github
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.editTextNumber);
        EditText number2ET = findViewById(R.id.editTextNumber3);
        TextView numberSumTV = findViewById(R.id.Answer);

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            numberSumTV.setText("EMPTY TEXT");
        }else {
            double num1 = Integer.parseInt(number1ET.getText().toString());
            double num2 = Integer.parseInt(number2ET.getText().toString());
            double sum = num1 + num2;

            numberSumTV.setText("" + sum);
            closeKeyboard();
        }
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.editTextNumber);
        EditText number2ET = findViewById(R.id.editTextNumber3);
        TextView numberSumTV = findViewById(R.id.Answer);

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            numberSumTV.setText("EMPTY TEXT");
        }else {
            double num1 = Integer.parseInt(number1ET.getText().toString());
            double num2 = Integer.parseInt(number2ET.getText().toString());
            double difference = num1 - num2;

            numberSumTV.setText("" + difference);
            closeKeyboard();
        }
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.editTextNumber);
        EditText number2ET = findViewById(R.id.editTextNumber3);
        TextView numberSumTV = findViewById(R.id.Answer);

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            numberSumTV.setText("EMPTY TEXT");
        }else {
            double num1 = Integer.parseInt(number1ET.getText().toString());
            double num2 = Integer.parseInt(number2ET.getText().toString());
            double product = num1 * num2;

            numberSumTV.setText("" + product);
            closeKeyboard();
        }
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.editTextNumber);
        EditText number2ET = findViewById(R.id.editTextNumber3);
        TextView output = findViewById(R.id.Answer);

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            output.setText("EMPTY TEXT");
        }else{
            double num1 = Integer.parseInt(number1ET.getText().toString());
            double num2 = Integer.parseInt(number2ET.getText().toString());
            double quotient = num1 / num2;

            output.setText("" + quotient);
            closeKeyboard();
        }
    }

    //Source: www.geeksforgeeks.org/how-to-programmatically-hide-android-soft-keyboard-->
    //Wanted keyboard to close after user entered numbers so found function on internet
    private void closeKeyboard()
    {
        // this will give us the view
        // which is currently focus
        // in this layout
        View view = this.getCurrentFocus();

        // if nothing is currently
        // focus then this will protect
        // the app from crash
        if (view != null) {

            // now assign the system
            // service to InputMethodManager
            InputMethodManager manager
                    = (InputMethodManager)
                    getSystemService(
                            Context.INPUT_METHOD_SERVICE);
            manager
                    .hideSoftInputFromWindow(
                            view.getWindowToken(), 0);
        }
    }
}
