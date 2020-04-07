package com.example.exercisemenu_20180140096;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPsgPjg extends AppCompatActivity {

    EditText edL, edP;
    Button bttnHsl;
    TextView tvHsl;

    String p, l;

    double hsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_psg_pjg);

        edL = findViewById(R.id.edMsknlbr);
        edP = findViewById(R.id.edMsknpjg);

        bttnHsl = findViewById(R.id.bttn_hasil);
        tvHsl = findViewById(R.id.shw_hsl);


        bttnHsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p = edP.getText().toString();
                l = edL.getText().toString();

                hsl = (Double.valueOf(p) * Double.valueOf(l));

                tvHsl.setText("Luas Persegi Panjang dengan\npanjang: " + p + " dan lebar: " + l + " adalah:\n" + String.valueOf(hsl));

            }
        });
    }
}
