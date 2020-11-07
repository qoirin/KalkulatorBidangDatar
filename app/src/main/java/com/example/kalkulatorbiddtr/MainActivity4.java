package com.example.kalkulatorbiddtr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    EditText etDiameter;
    TextView tvLuas,tvKeliling;
    Button hitung,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        etDiameter=(EditText)findViewById(R.id.txtDiameter);
        tvLuas=(TextView) findViewById(R.id.hasilLuas);
        tvKeliling=(TextView) findViewById(R.id.hasilKeliling);
        hitung=(Button) findViewById(R.id.btnHitung);
        back=(Button) findViewById(R.id.btnBack);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nilDiameter, r, hasilL, hasilK;

                nilDiameter=Double.valueOf(etDiameter.getText().toString().trim());

                //luas
                hasilL=3.14*nilDiameter*nilDiameter;
                String hasilLs = String.valueOf(hasilL);
                tvLuas.setText(hasilLs);
                //keliling
                hasilK=3.14*2*nilDiameter;
                String hasilKs = String.valueOf(hasilK);
                tvKeliling.setText(hasilKs);
            }
        });
    }
    public void act4(View view) {
        startActivity(new Intent(MainActivity4.this, MainActivity.class));
        finish();
    }
}