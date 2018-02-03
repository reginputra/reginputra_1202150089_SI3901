package com.example.android.reginridhoputra_1202150089_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Lembarkedua extends AppCompatActivity {

    TextView tvRestaurant, tvMenu, tvPortion, tvPrice;
    String restaurant, menu;
    int portion, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembarkedua);
        tvRestaurant =(TextView)findViewById(R.id.tv_restaurant); //mengambil id dari xml
        tvMenu =(TextView)findViewById(R.id.tv_menu);
        tvPortion =(TextView)findViewById(R.id.tv_portion);
        tvPrice =(TextView)findViewById(R.id.tv_price);

        Intent intent = getIntent(); //mengambil data dari activity sebeleumnya
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion", 0);
        price = intent.getIntExtra("price", 0);

        tvRestaurant.setText(restaurant); //setText untuk mengisi komponen dengan data
        tvMenu.setText(menu);
        tvPortion.setText(""+portion);
        tvPrice.setText("Rp."+price);

        Toast toast = null; //inisiasi
        if (price < 65000){
            toast = Toast.makeText(getApplicationContext(), "WAW EMEJING", Toast.LENGTH_SHORT); //apabila kurang dari 65000 akan menampilkan pesan makan disini aja atuh
        }else{
            toast = Toast.makeText(getApplicationContext(), "WADUUHH BISA GAWAT", Toast.LENGTH_SHORT); //apabila kurang dari 65000 akan menampilkan pesan jangan disini, terlalu mahal
        }
        toast.show(); //untuk menampilkan tulisan
    }
}