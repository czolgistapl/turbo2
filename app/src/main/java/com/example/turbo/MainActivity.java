package com.example.turbo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText dateEditText;
    private EditText mileageEditText;
    private EditText costEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateEditText = (EditText) findViewById(R.id.date);
        mileageEditText = (EditText) findViewById(R.id.mileage);
        EditText litersEditText = (EditText) findViewById(R.id.liters);
        costEditText = (EditText) findViewById(R.id.cost);

        getCurrentDate();
        dateEditText.setText(getCurrentDate());

        Button confirmButton = (Button) findViewById(R.id.confirm);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getOneLiterCost(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private String getOneLiterCost() {
        return String.valueOf(Double.valueOf(LitersEditText.getText().toString()) / Double.parseDouble(costEditText.getText().toString()));
    }

    private String getCurrentDate() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date date = new Date();
        return dateFormat.format(date);

    }
}