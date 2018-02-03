package com.example.android.reginridhoputra_1202150089_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Lembarpertama extends AppCompatActivity {

    EditText etFood, etPortion; //untuk deklarasi objek
    Intent intent;
    String restaurant, menu;
    int portion;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method ketika dijalankan saat activity dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembarpertama);
        etFood = (EditText) findViewById(R.id.et_food); //masukan makanan
        etPortion = (EditText) findViewById(R.id.et_portion); //masukan porsi
        intent = new Intent (this,Lembarkedua.class); //untuk pindah aktivitas
    }

    public void onEatbus(View view) {
        menu = etFood.getText().toString();
        restaurant = "Eatbus";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 50000 * Integer.parseInt(etPortion.getText().toString()); //jumlah porsi dikali harga restoran kemudian dipaksa menjadi integer
        Log.d("TOTAL HARGA", "Rp."+total); //menampilkan sesuatu di Logcat android studio
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }

    public void onAbnormal(View view) {
        menu = etFood.getText().toString();
        restaurant = "Abnormal";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 30000 * Integer.parseInt(etPortion.getText().toString()); //jumlah porsi dikali harga restoran kemudian dipaksa menjadi integer
        Log.d("TOTAL HARGA", "Rp."+total); //menampilkan sesuatu di Logcat android studio
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}