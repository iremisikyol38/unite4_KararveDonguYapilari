package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg4Activity extends AppCompatActivity {
    Switch konumServisleri,konumbilgilerial,konumbilgilerigonder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        konumServisleri = findViewById(R.id.KonumServisleri);
        konumbilgilerial = findViewById(R.id.KonumBilgileriAl);
        konumbilgilerigonder = findViewById(R.id.KonumBilgileriGonder);
        if(konumServisleri.isChecked()){
            konumbilgilerial.setVisibility(View.VISIBLE);
            konumbilgilerigonder.setVisibility(View.VISIBLE);
        }
        else {
            konumbilgilerial.setVisibility(View.GONE);
            konumbilgilerigonder.setVisibility(View.GONE);
        }

    }
}
