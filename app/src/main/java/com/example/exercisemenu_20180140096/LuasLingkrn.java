package com.example.exercisemenu_20180140096;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkrn extends AppCompatActivity {

    EditText esHtgluas;
    Button bttnHsl;
    TextView tvHsl;

    String r;

    double hsl, phi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkrn);

        esHtgluas = findViewById(R.id.edMsknsisi);
        bttnHsl = findViewById(R.id.bttn_hasil);
        tvHsl = findViewById(R.id.shw_hsl);


        bttnHsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r = esHtgluas.getText().toString();
                phi = 3.14;


                hsl = phi * (Double.valueOf(r) * Double.valueOf(r));

                tvHsl.setText("Luas Lingkaran dengan jari-jari:" + r + "\nadalah: " + String.valueOf(hsl));

            }
        });
    }
}
