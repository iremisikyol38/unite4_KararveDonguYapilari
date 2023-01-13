package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg3Activity extends AppCompatActivity {
    EditText txtKullaniciAdi;
    EditText txtSifre;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);
        txtKullaniciAdi=findViewById(R.id.txtkullaniciAdi);
        txtSifre=findViewById(R.id.txtSifre);
    }
    final String kullaniciAdi = "erenaytu";
    final String sifre = "12345";

    public void btnOnayla(View view){
        String kullaniciAdiGiris = txtKullaniciAdi.getText().toString();
        String sifreGiris = txtSifre.getText().toString();
    }

}
