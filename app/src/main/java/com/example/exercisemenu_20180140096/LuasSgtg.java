package com.example.exercisemenu_20180140096;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSgtg extends AppCompatActivity {

    EditText edA, edT;
    Button bttnHsl;
    TextView tvHsl;

    String a, t;

    double hsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_sgtg);

        edA = findViewById(R.id.edMsknals);
        edT = findViewById(R.id.edMskntgi);

        bttnHsl = findViewById(R.id.bttn_hasil);
        tvHsl = findViewById(R.id.shw_hsl);


        bttnHsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = edA.getText().toString();
                t = edT.getText().toString();

                hsl = (Double.valueOf(a) * Double.valueOf(t)) / 2;

                tvHsl.setText("Luas Segitiga dengan\nalas: " + a + " dan tinggi: " + t + " adalah:\n" + String.valueOf(hsl));

            }
        });
    }
}
