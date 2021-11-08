package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormData extends AppCompatActivity {
    EditText innama, innik, inumur, inalamat, ininstitusi;
    TextView tvnama, tvnik, tvumur, tvalamat, tvinstitusi;
    Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_data);

        innama = findViewById(R.id.input_pembeli);
        innik = findViewById(R.id.input_barang);
        inumur = findViewById(R.id.input_jumlah);
        inalamat = findViewById(R.id.input_harga);
        ininstitusi = findViewById(R.id.input_bayar);
        tvnama = findViewById(R.id.txt_nama);
        tvnik= findViewById(R.id.txt_nik);
        tvumur = findViewById(R.id.txt_umur);
        tvalamat = findViewById(R.id.txt_alamat);
        tvinstitusi = findViewById(R.id.txt_asal);
        simpan = findViewById(R.id.btn_simpan);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnama.setText(innama.getText().toString());
                tvnik.setText(innik.getText().toString());
                tvumur.setText(inumur.getText().toString());
                tvalamat.setText(inalamat.getText().toString());
                tvinstitusi.setText(ininstitusi.getText().toString());
            }
        });
    }
}