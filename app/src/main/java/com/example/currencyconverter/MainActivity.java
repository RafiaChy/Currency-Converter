package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
        Button euro, dollar, pound, yen,dinar,bitcoin,ruble,aud, can;
        TextView myText;
        EditText myEdits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.btn1);
        dollar = findViewById(R.id.btn2);
        pound = findViewById(R.id.btn3);
        yen = findViewById(R.id.btn4);
        dinar = findViewById(R.id.btn5);
        bitcoin = findViewById(R.id.btn6);
        ruble = findViewById(R.id.btn7);
        aud = findViewById(R.id.btn8);
        can = findViewById(R.id.btn9);


        myText = findViewById(R.id.textView);
        myEdits = findViewById(R.id.editText);


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eZ= myEdits.getText().toString();

                if(TextUtils.isEmpty(eZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double eN, eK;

                    eN = Double.parseDouble(eZ);
                    myText.setText(null);
                    eK = eN * 0.010;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(eK));
                }
            }
        });


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dZ = myEdits.getText().toString();

                if (TextUtils.isEmpty(dZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double dN, dK;

                    dN = Double.parseDouble(dZ);
                    myText.setText(null);
                    dK = dN*0.012;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(dK));
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pZ = myEdits.getText().toString();

                if (TextUtils.isEmpty(pZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double pN, pK;

                    pN = Double.parseDouble(pZ);
                    myText.setText(null);
                    pK = pN*0.0091;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(pK));
                }
            }
        });


        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dZ = myEdits.getText().toString();

                if (TextUtils.isEmpty(dZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double dN, dK;

                    dN = Double.parseDouble(dZ);
                    myText.setText(null);
                    dK = dN*1.23;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(dK));
                }
            }
        });


        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dZ = myEdits.getText().toString();

                if (TextUtils.isEmpty(dZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double dN, dK;

                    dN = Double.parseDouble(dZ);
                    myText.setText(null);
                    dK = dN*0.0036;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(dK));
                }
            }
        });



        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dZ = myEdits.getText().toString();

                if (TextUtils.isEmpty(dZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double dN, dK;

                    dN = Double.parseDouble(dZ);
                    myText.setText(null);
                    dK = dN*0.00;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(dK));
                }
            }
        });



        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dZ = myEdits.getText().toString();

                if (TextUtils.isEmpty(dZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double dN, dK;

                    dN = Double.parseDouble(dZ);
                    myText.setText(null);
                    dK = dN*0.98;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(dK));
                }
            }
        });



        aud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dZ = myEdits.getText().toString();

                if (TextUtils.isEmpty(dZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double dN, dK;

                    dN = Double.parseDouble(dZ);
                    myText.setText(null);
                    dK = dN*0.017;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(dK));
                }
            }
        });




        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dZ = myEdits.getText().toString();

                if (TextUtils.isEmpty(dZ)){
                    myEdits.setError("Empty user-input");
                }

                else
                {
                    double dN, dK;

                    dN = Double.parseDouble(dZ);
                    myText.setText(null);
                    dK = dN*0.015;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    myText.setText(""+ numberFormat.format(dK));
                }
            }
        });


    }
}