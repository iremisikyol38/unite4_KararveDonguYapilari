package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_avtivity);
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (int i=0;i<=100;i+=3){
            System.out.println(i);
        }
    }
}
