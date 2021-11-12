package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Penjualan extends AppCompatActivity {
    EditText innamapel, innamabar, injumlahbar, inharga, inbayar;
    Button btnproses, btnhitung, btnhapus, btnexit;
    TextView tvtotal ,tvkembali ,tvbonus ,tvket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjualan);

        innamapel = findViewById(R.id.input_pembeli);
        innamabar = findViewById(R.id.input_barang);
        injumlahbar = findViewById(R.id.input_jumlah);
        inharga = findViewById(R.id.input_harga);
        inbayar = findViewById(R.id.input_bayar);
        btnproses = findViewById(R.id.proses);
        btnhitung = findViewById(R.id.btn_hitung);
        btnhapus = findViewById(R.id.reset);
        btnexit = findViewById(R.id.exit);
        tvtotal = findViewById(R.id.txt_total);
        tvkembali = findViewById(R.id.txt_kembali);
        tvbonus = findViewById(R.id.txt_bonus);
        tvket = findViewById(R.id.txt_ket);

        inbayar.setEnabled(false);

        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namapelanggan = innamapel.getText().toString().trim();
                String namabarang = innamabar.getText().toString().trim();
                String jumlahbeli = injumlahbar.getText().toString().trim();
                String harga = inharga.getText().toString().trim();
                String uangbayar = inbayar.getText().toString().trim();

                int jb = Integer.parseInt(jumlahbeli);
                int h = Integer.parseInt(harga);
                int ub = Integer.parseInt(uangbayar);
                int total = (jb * h);

                tvtotal.setText("Total Belanja : Rp. " + total);

                if (total >=200000){
                    tvbonus.setText("Bonus : Mouse");
                } else if (total >=50000){
                    tvbonus.setText("Bonus : Keyboard");
                } else  if (total >=40000){
                    tvbonus.setText("Bonus : Harddisk");
                } else {
                    tvbonus.setText("Bonus : Tidak Ada Bonus");
                }
                int uangkembalian = (ub - total);

                if (ub < total){
                    tvket.setText("Keterangan : Uang Bayar Kurang Rp. " + (uangkembalian));
                    tvkembali.setText("Uang Kembali : Rp. 0" );
                } else if (ub == total){
                    tvket.setText("Keterangan : Uang Bayar Pas ");
                    tvkembali.setText("Uang Kembali : Rp. 0" );
                }else{
                    tvket.setText("Keterangan : Tunggu Kembalian");
                    tvkembali.setText("Uang Kembali : Rp. " + uangkembalian);
                }
            }
        });

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlahbeli = injumlahbar.getText().toString().trim();
                String harga = inharga.getText().toString().trim();

                int jb = Integer.parseInt(jumlahbeli);
                int h = Integer.parseInt(harga);
                int total = (jb * h);

                tvtotal.setText("Total Belanja : Rp. " + total);
                inbayar.requestFocus();
                inbayar.setEnabled(true);
            }
        });

        btnhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inbayar.setEnabled(false);
                innamapel.requestFocus();
                innamapel.setText(" ");
                innamabar.setText(" ");
                tvtotal.setText("Total Belanja : Rp. 0");
                inharga.setText(" ");
                inbayar.setText(" ");
                tvkembali.setText("Uang Kembali : Rp. 0");
                tvbonus.setText("Bonus : - ");
                injumlahbar.setText(" ");
                tvket.setText("Keterangan : - ");

                Toast.makeText(getApplicationContext(),"Data Sudah Direset", Toast.LENGTH_LONG).show();
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Penjualan.this, MainActivity.class);
                startActivity(send);
            }
        });
    }
}