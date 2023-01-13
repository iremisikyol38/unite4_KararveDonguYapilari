package com.example.unite4_kararvedonguyapilari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg2Activity extends AppCompatActivity {
    EditText txtsayi1;
    EditText txtsayi2;
    Button konturol;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);
        konturol= findViewById(R.id.konturol);
        txtsayi1= findViewById(R.id.txtsayi1);
        txtsayi2= findViewById(R.id.txtsayi2);
    }

    public void setKonturol(View view){
        int sayi1 =Integer.parseInt(txtsayi1.getText().toString());
        int sayi2 =Integer.parseInt(txtsayi2.getText().toString());
        if (sayi1>sayi2) {
            Toast.makeText(uyg2Activity.this, "1.Sayı Büyüktür", Toast.LENGTH_LONG).show();
        }
        if (sayi1<sayi2) {
            Toast.makeText(uyg2Activity.this, "2.Sayı Büyüktür", Toast.LENGTH_LONG).show();
        }
        if (sayi1==sayi2) {
            Toast.makeText(uyg2Activity.this, "Sayılar Eşittir", Toast.LENGTH_LONG).show();
        }
        }
    }

