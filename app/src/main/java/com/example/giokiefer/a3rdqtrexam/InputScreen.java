package com.example.giokiefer.a3rdqtrexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InputScreen extends AppCompatActivity {

    Button calculate;
    TextView tv_tota, tv_cost, tv_aver, tv_park, tv_toll, tv_carp, finalView;
    double tota, cost, aver, park, toll, carp;
    Global global;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_input_screen);
        super.onCreate(savedInstanceState);

        global = new Global();

        calculate = (Button) findViewById(R.id.calculate);

        tv_tota = (TextView) findViewById(R.id.total);
        tv_cost = (TextView) findViewById(R.id.cost);
        tv_aver = (TextView) findViewById(R.id.average);
        tv_park = (TextView) findViewById(R.id.parking);
        tv_toll = (TextView) findViewById(R.id.tolls);
        tv_carp = (TextView) findViewById(R.id.carpooling);
        finalView = (TextView) findViewById(R.id.finalView);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tota = Double.parseDouble(tv_tota.getText().toString());
                cost = Double.parseDouble(tv_cost.getText().toString());
                aver = Double.parseDouble(tv_aver.getText().toString());
                park = Double.parseDouble(tv_park.getText().toString());
                toll = Double.parseDouble(tv_toll.getText().toString());
                carp = Double.parseDouble(tv_carp.getText().toString());
                double x = (((tota/aver)*cost + park + toll)-carp);
                finalView.setText(Double.toString(x));
            }
        });
    }

    private void nextPage() {
        Intent intent = new Intent(this, ResultScreen.class);
        startActivity(intent);
    }
}
