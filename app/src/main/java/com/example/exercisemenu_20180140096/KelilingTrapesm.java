package com.example.exercisemenu_20180140096;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingTrapesm extends AppCompatActivity {

    EditText edAB, edEF, edt;
    Button bttnHsl;
    TextView tvHsl;

    String AB, EF, AE;

    double hsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_trapesm);

        edAB = findViewById(R.id.edMsknAB);
        edEF = findViewById(R.id.edMsknEF);
        edt = findViewById(R.id.edMsknEF);

        bttnHsl = findViewById(R.id.bttn_hasil);
        tvHsl = findViewById(R.id.shw_hsl);


        bttnHsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AB = edAB.getText().toString();
                AE = edt.getText().toString();
                EF = edEF.getText().toString();

                hsl = ((Double.valueOf(AB)) + (Double.valueOf(EF)) + (Double.valueOf(AE) * 2));

                tvHsl.setText("Keliling Trapesium dengan panjang AB: " + AB + " , panjang EF: " + EF + " dan\n AE: " + AE + " adalah: " + String.valueOf(hsl));

            }
        });
    }
}
