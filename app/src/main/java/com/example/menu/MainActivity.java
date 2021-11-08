package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Mendeklarasi atau Membuat Variabel
    CardView cv1, cv2, cv3, cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan Variabel
        cv1 = findViewById(R.id.cardView1);
        cv2 = findViewById(R.id.cardView2);
        cv3 = findViewById(R.id.cardView3);
        cv4 = findViewById(R.id.cardView4);

        //Aksi Variabel
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this, FormData.class);
                startActivity(send);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this, Penjualan.class);
                startActivity(send);
            }
        });
    }
}