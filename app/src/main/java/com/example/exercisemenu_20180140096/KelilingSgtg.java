package com.example.exercisemenu_20180140096;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingSgtg extends AppCompatActivity {

    EditText edA, edT, edssm;
    Button bttnHsl;
    TextView tvHsl;

    String a, t, ssm;

    double hsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_sgtg);

        edA = findViewById(R.id.edMsknals);
        edT = findViewById(R.id.edMskntgi);
        edssm = findViewById(R.id.edMsknssM);

        bttnHsl = findViewById(R.id.bttn_hasil);
        tvHsl = findViewById(R.id.shw_hsl);


        bttnHsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = edA.getText().toString();
                t = edT.getText().toString();
                ssm = edssm.getText().toString();

                hsl = (Double.valueOf(ssm)) + (Double.valueOf(a)) + (Double.valueOf(t));

                tvHsl.setText("Keliling Segitiga dengan\nalas: " + a + " , tinggi: " + t + " dan sisi miring: " + ssm + "\nadalah: " + String.valueOf(hsl));

            }
        });
    }
}
