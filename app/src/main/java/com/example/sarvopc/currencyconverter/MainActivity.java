package com.example.sarvopc.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("Info", "Button Pressed");
        EditText editText= (EditText) findViewById(R.id.editText);

        String amountInPounds = editText.getText().toString();

        if(amountInPounds.equals("")){
            Toast.makeText(this, "Please enter some value", Toast.LENGTH_SHORT).show();
        }else {
            double amountInPoundsDouble = Double.parseDouble(amountInPounds);
            double amountInDollarsDouble = amountInPoundsDouble * 1.3;

            String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);
            Toast.makeText(this, "£" + amountInPounds + "is $" + amountInDollarsString, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
