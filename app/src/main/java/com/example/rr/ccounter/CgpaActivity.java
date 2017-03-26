package com.example.rr.ccounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CgpaActivity extends AppCompatActivity {
    TextView txt1,txt2;
    EditText ext1,ext2;
    Button btn1;
    public  float number1=0, number2=0,result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("CGPA Counter");

        txt1=(TextView)findViewById(R.id.textViewInfo);
        txt2=(TextView)findViewById(R.id.textViewrsult);
        ext1=(EditText)findViewById(R.id.editTextCrdt);
        ext2=(EditText)findViewById(R.id.editTextTotalCrdt);
        btn1=(Button)findViewById(R.id.buttonCGPA);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethod();
                result=number1/number2;
                txt2.setText("Your CGPA Is : "+result);

            }
        });



    }

    public void InputMethod(){
        if(TextUtils.isEmpty(ext1.getText().toString())|| TextUtils.isEmpty(ext2.getText().toString())){
            return;
        }
        else{
            number1=Float.parseFloat(ext1.getText().toString());
            number2=Float.parseFloat(ext2.getText().toString());
        }
    }
}
