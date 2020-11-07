package com.example.kalkulatorbiddtr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText etSisi;
    TextView tvLuas,tvKeliling;
    Button hitung,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etSisi=(EditText)findViewById(R.id.txtSisi);
        tvLuas=(TextView) findViewById(R.id.hasilLuas);
        tvKeliling=(TextView) findViewById(R.id.hasilKeliling);
        hitung=(Button) findViewById(R.id.btnHitung);
        back=(Button) findViewById(R.id.btnBack);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nilSisi, hasilL, hasilK;

                nilSisi=Double.valueOf(etSisi.getText().toString().trim());

                //luas
                hasilL=nilSisi*nilSisi;
                String hasilLs = String.valueOf(hasilL);
                tvLuas.setText(hasilLs);
                //keliling
                hasilK=4*nilSisi;
                String hasilKs = String.valueOf(hasilK);
                tvKeliling.setText(hasilKs);
            }


        });
    }


    public void act2(View view) {
        startActivity(new Intent(MainActivity2.this, MainActivity.class));
        finish();
    }
}