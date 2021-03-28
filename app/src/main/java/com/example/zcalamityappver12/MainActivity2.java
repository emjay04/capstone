package com.example.zcalamityappver12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnLgu = (Button)findViewById(R.id.btnLGU);
        btnLgu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(startIntent);
            }
        });

        Button btnResident = (Button)findViewById(R.id.btnResident);
        btnResident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(startIntent);
            }
        });

    }
}