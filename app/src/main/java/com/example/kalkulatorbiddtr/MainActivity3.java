package com.example.kalkulatorbiddtr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText etAlas, etTinggi;
    TextView tvLuas, tvKeliling;
    Button hitung, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etAlas=(EditText)findViewById(R.id.txtAlas);
        etTinggi=(EditText)findViewById(R.id.txtTinggi);
        tvLuas=(TextView) findViewById(R.id.hasilLuas);
        tvKeliling=(TextView) findViewById(R.id.hasilKeliling);
        hitung=(Button) findViewById(R.id.btnHitung);
        back=(Button) findViewById(R.id.btnBack);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nilAlas, nilTinggi, hasilL, hasilK;

                nilAlas=Double.valueOf(etAlas.getText().toString().trim());
                nilTinggi=Double.valueOf(etTinggi.getText().toString().trim());
                //luas
                hasilL=(nilAlas/2)*nilTinggi;
                String hasilLs = String.valueOf(hasilL);
                tvLuas.setText(hasilLs);
                //keliling
                hasilK=nilAlas+nilAlas+nilAlas;
                String hasilKs = String.valueOf(hasilK);
                tvKeliling.setText(hasilKs);
            }

        });
    }

    public void act3(View view) {
        startActivity(new Intent(MainActivity3.this, MainActivity.class));
        finish();
    }
}