package com.example.exercisemenu_20180140096;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasTrapesm extends AppCompatActivity {

    EditText edAB, edEF, edt;
    Button bttnHsl;
    TextView tvHsl;

    String AB, EF, t;

    double hsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesm);

        edAB = findViewById(R.id.edMsknAB);
        edEF = findViewById(R.id.edMsknEF);
        edt = findViewById(R.id.edMsknt);

        bttnHsl = findViewById(R.id.bttn_hasil);
        tvHsl = findViewById(R.id.shw_hsl);


        bttnHsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AB = edAB.getText().toString();
                t = edt.getText().toString();
                EF = edEF.getText().toString();

                hsl = ((Double.valueOf(AB)) + (Double.valueOf(EF))) * (Double.valueOf(t)) / 2;

                tvHsl.setText("Luas Trapesium dengan panjang\nAB: " + AB + " , panjang EF: " + EF + " dan\n tinggi: " + t + " adalah: " + String.valueOf(hsl));

            }
        });
    }
}
