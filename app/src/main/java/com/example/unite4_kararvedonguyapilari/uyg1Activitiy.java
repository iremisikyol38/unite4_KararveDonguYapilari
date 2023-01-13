package com.example.unite4_kararvedonguyapilari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg1Activitiy extends AppCompatActivity {
    EditText TxtNumber2;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);

        button=findViewById(R.id.konturol);
        TxtNumber2=findViewById(R.id.TxtNumber2);
    }

    public void kontrolEt(View view){
        int sayi = Integer.parseInt(TxtNumber2.getText().toString());
        if(sayi>100) {
            Toast.makeText(this,"100'den büyük not olmaz",Toast.LENGTH_SHORT).show();
        }

    }
}
