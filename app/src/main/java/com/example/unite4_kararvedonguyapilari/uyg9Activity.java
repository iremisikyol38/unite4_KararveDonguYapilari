package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg9Activity extends AppCompatActivity {
    EditText editTextSayilar;
 Button tekSayilar,ciftSayilar,tumliste;
 TextView sonuc;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
        editTextSayilar = findViewById(R.id.txtSayi4);
    }
    public void ciftSayilar(View view){
        editTextSayilar.setText("");
        for (int i=0;i<15;i++){
            if(i%2==0){
                editTextSayilar.setText(editTextSayilar.getText()+""+i);
            }
        }

        public void tekSayilar (View view){
            editTextSayilar.setText("");
            for (int i=0;i<=15;i++){
                if (i%2!=0){
                    editTextSayilar.setText(editTextSayilar.getText()+"\n"+i);
                }
            }
        }
        public void tumliste (View view){
            editTextSayilar.setText("");
            for (int i=0;i<=15;i++){
                editTextSayilar.setText(editTextSayilar.getText()+"\n"+i);
            }
        }
    }
}
