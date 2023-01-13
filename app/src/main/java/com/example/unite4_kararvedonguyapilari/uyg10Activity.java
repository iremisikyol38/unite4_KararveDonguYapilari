package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg10Activity extends AppCompatActivity {

    EditText sayii;
    Button Onayla;
    TextView sonuc;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        sayii = findViewById(R.id.sayii);
        Onayla = findViewById(R.id.onayla);
        sonuc = findViewById(R.id.sonuc);
    }
    public void onayla(View view) {
        int sayi = Integer.parseInt(sayii.getText().toString());
        int sayac=1;
        long sonuc=1;
        while(sayac<=sayi){
            sonuc=sonuc*sayac;
            sayac++;
        }
        sonuc.setText("Sonuç: "+sonuc);
    }
}
