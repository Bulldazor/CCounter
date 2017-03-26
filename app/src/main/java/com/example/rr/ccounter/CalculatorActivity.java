package com.example.rr.ccounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    EditText ext1,ext2;
    Button btnAdd,btnMin,btnMul,btnDiv;
    public  float number1=0, number2=0,result=0;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ext1=(EditText)findViewById(R.id.editTextNumber1);
        ext2=(EditText)findViewById(R.id.editTextnumber2);
        btnAdd=(Button)findViewById(R.id.buttonAdd);
        btnMin=(Button)findViewById(R.id.buttonMin);
        btnMul=(Button)findViewById(R.id.buttonMul);
        btnDiv=(Button)findViewById(R.id.buttonDiv);
        txtResult=(TextView)findViewById(R.id.textViewResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberInput();
                result=number1+number2;
                txtResult.setText(number1+"+"+number2+"="+result);
            }
        });
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberInput();
                result=number1-number2;
                txtResult.setText(number1+"-"+number2+"="+result);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberInput();
                result=number1*number2;
                txtResult.setText(number1+"*"+number2+"="+result);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberInput();
                result=number1/number2;
                txtResult.setText(number1+"/"+number2+"="+result);
            }
        });
    }

    public void numberInput(){
        // Number field empty or not???

        if(TextUtils.isEmpty(ext1.getText().toString())|| TextUtils.isEmpty(ext2.getText().toString())){
            return;
        }
        //Puttong the value
        else {
            number1 = Float.parseFloat(ext1.getText().toString());
            number2 = Float.parseFloat(ext2.getText().toString());
        }

    }
    }

