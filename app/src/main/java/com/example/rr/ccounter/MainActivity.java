package com.example.rr.ccounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCal,btnCgpa;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCal=(Button)findViewById(R.id.buttonCalculator);
        btnCgpa=(Button)findViewById(R.id.buttonCGPACounter);
        txt1=(TextView)findViewById(R.id.textAboutUs);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Calculator Starting", Toast.LENGTH_SHORT).show();
            }
        });
        btnCgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CgpaActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "CGPA Activity Starts", Toast.LENGTH_SHORT).show();
            }
        });
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent innn = new Intent(MainActivity.this,InfoActivity.class);
                startActivity(innn);
                Toast.makeText(MainActivity.this, "About US", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
