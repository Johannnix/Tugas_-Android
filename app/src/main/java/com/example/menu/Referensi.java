package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Referensi extends AppCompatActivity {
    TextView link1,link2,link3,link4,link5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referensi);

        link1 = findViewById(R.id.txt1);
        link2 = findViewById(R.id.txt2);
        link3 = findViewById(R.id.txt3);
        link4 = findViewById(R.id.txt4);
        link5 = findViewById(R.id.txt5);

        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://medium.com/@zebhi/cara-membuat-aplikasi-android-form-input-data-sederhana-4d10cd2808b6";
                Intent a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse(url));
                startActivity(a);
            }
        });

        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://uuzworld.wordpress.com/2019/04/06/aplikasi-pemesanan-toko-roti-android-studio/";
                Intent b = new Intent(Intent.ACTION_VIEW);
                b.setData(Uri.parse(url));
                startActivity(b);
            }
        });

        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://imamfarisi.com/membuat-aplikasi-menu-makanan-di-android/";
                Intent b = new Intent(Intent.ACTION_VIEW);
                b.setData(Uri.parse(url));
                startActivity(b);
            }
        });

        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://badoystudio.com/membuat-aplikasi-pemesanan-makanan-di-android-studio/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://stackoverflow.com/questions/736571/using-intent-in-an-android-application-to-show-another-activity";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}