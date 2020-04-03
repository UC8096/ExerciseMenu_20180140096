package com.example.exercisemenu_20180140096;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edNama, edPass;
    Button bKirim;
    String user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.editUN);
        edPass = findViewById(R.id.editPass);
        bKirim = findViewById(R.id.btnok);

        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user = edNama.getText().toString();
                pass = edPass.getText().toString();

                if (pass.equals("123") && user.equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), MenuHitungBDTR.class);

                    startActivity(i);

                } else {
                    Toast.makeText(getApplicationContext(), "password salah", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
