package com.example.exercisemenu_20180140096;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPsg extends AppCompatActivity {

    EditText esHtgluas;
    Button bttnHsl;
    TextView tvHsl;

    String sisi;

    double hsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_psg);

        esHtgluas = findViewById(R.id.edMsknsisi);
        bttnHsl = findViewById(R.id.bttn_hasil);
        tvHsl = findViewById(R.id.shw_hsl);


        bttnHsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sisi = esHtgluas.getText().toString();

                hsl = (Double.valueOf(sisi) * Double.valueOf(sisi));

                tvHsl.setText("Luas Persegi dengan sisi:" + sisi + "\nadalah: " + String.valueOf(hsl));

            }
        });


    }
}
