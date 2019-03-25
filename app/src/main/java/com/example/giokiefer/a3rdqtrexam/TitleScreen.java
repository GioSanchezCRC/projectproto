package com.example.giokiefer.a3rdqtrexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class TitleScreen extends AppCompatActivity {

    Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        nextPage = (Button) findViewById(R.id.start);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextPage();
            }
        });
    }

    private void openNextPage() {
        Intent intent = new Intent(this, InputScreen.class);
        startActivity(intent);
    }
}
