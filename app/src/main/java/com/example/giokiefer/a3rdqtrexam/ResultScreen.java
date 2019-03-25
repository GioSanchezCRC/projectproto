package com.example.giokiefer.a3rdqtrexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    TextView tcost;
    Global global;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        tcost = (TextView) findViewById(R.id.tcost);
        tcost.setText(Double.toString(global.getTotalCost()));
    }
}
