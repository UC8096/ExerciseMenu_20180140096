package com.example.exercisemenu_20180140096;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MenuHitungBDTR extends AppCompatActivity {

    TextView tvPsg, tvLngkrn, tvPsgPjg, tvSgtg, tvTrpsm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hitung_b_d_t_r);

        tvPsg = findViewById(R.id.tv_Mnghtg_Psg);
        tvLngkrn = findViewById(R.id.tv_Mnghtg_lngkrn);
        tvPsgPjg = findViewById(R.id.tv_Mnghtg_PsgPjg);
        tvSgtg = findViewById(R.id.tv_Mnghtg_Sgtg);
        tvTrpsm = findViewById(R.id.tv_Mnghtg_Trpsm);

        tvPsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenu();
            }
        });

        tvLngkrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenu1();
            }
        });

        tvPsgPjg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenu2();
            }
        });

        tvSgtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenu3();
            }
        });

        tvTrpsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenu4();
            }
        });
    }

    private void popupMenu() {
        PopupMenu popupMenu = new PopupMenu(MenuHitungBDTR.this, tvPsg);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MenuHitungBDTR.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                switch (item.getItemId()) {
                    case R.id.htg_luas_item:
                        Intent i = new Intent(getApplicationContext(), LuasPsg.class);

                        startActivity(i);

                        return true;
                    case R.id.htg_kelling_item:
                        Intent ii = new Intent(getApplicationContext(), KelilingPsg.class);

                        startActivity(ii);

                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();
    }

    private void popupMenu1() {
        PopupMenu popupMenu = new PopupMenu(MenuHitungBDTR.this, tvLngkrn);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MenuHitungBDTR.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                switch (item.getItemId()) {
                    case R.id.htg_luas_item:
                        return true;
                    case R.id.htg_kelling_item:
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();
    }

    private void popupMenu2() {
        PopupMenu popupMenu = new PopupMenu(MenuHitungBDTR.this, tvPsgPjg);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MenuHitungBDTR.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                switch (item.getItemId()) {
                    case R.id.htg_luas_item:
                        return true;
                    case R.id.htg_kelling_item:
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();
    }

    private void popupMenu3() {
        PopupMenu popupMenu = new PopupMenu(MenuHitungBDTR.this, tvSgtg);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MenuHitungBDTR.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                switch (item.getItemId()) {
                    case R.id.htg_luas_item:
                        return true;
                    case R.id.htg_kelling_item:
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();
    }

    private void popupMenu4() {
        PopupMenu popupMenu = new PopupMenu(MenuHitungBDTR.this, tvTrpsm);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MenuHitungBDTR.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                switch (item.getItemId()) {
                    case R.id.htg_luas_item:
                        return true;
                    case R.id.htg_kelling_item:
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();
    }
}
