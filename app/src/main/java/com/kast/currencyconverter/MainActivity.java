package com.kast.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText amountInDollars = (EditText) findViewById(R.id.amountInDollars);

        /** From the course

        double amount = Double.parseDouble(amountInDollars.getText().toString());
        double converted = amount * 0.86;

        **/

        String amount = amountInDollars.getText().toString(); // Google search
        double d = Double.parseDouble(amount);                //
        double e = 0.86;                                      //
        double converted = d * e;                             // Google search

        Toast.makeText(this, Double.toString(converted) + "€", Toast.LENGTH_LONG).show(); // Google search

        /** String.format("%.2f", d) adds 2 decimal points

        Toast.makeText(this, String.format("%.2f", converted) + "€", Toast.LENGTH_SHORT).show();

        **/

        /** From the course, but converted.toString() is not working.

        Toast.makeText(this, converted.toString() + "€", Toast.LENGTH_SHORT).show();

         **/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
