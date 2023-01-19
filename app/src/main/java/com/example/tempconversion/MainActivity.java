package com.example.tempconversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textEdit1;
    EditText textEdit2;
    Button CtoFbutton;
    Button FtoCbutton;
    TextView Display1;
    TextView Display2;
    ConstraintLayout layout;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textEdit1 = findViewById(R.id.textEdit1);
        textEdit2 = findViewById(R.id.textEdit2);
        CtoFbutton = findViewById(R.id.CtoFbutton);
        FtoCbutton = findViewById(R.id.FtoCbutton);
        Display1 = findViewById(R.id.Display1);
        Display2 = findViewById(R.id.Display2);

        CtoFbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textEdit1.getText().toString();
                double x = Double.parseDouble(s);
                double result = ((x-32.0)*((5.0/9.0)));
                Display1.setText(""+ result);
            }
        });

        FtoCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textEdit2.getText().toString();
                double x = Double.parseDouble(s);
                double result = ((x*(9.0/5.0))+32.0);
                Display2.setText(""+ result);
            }
        });


    }
}