package com.example.unite4_kararvedonguyapilari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnUyg1Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg1Activitiy.class);
        startActivity(i);
    }
    public void btnUyg2Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg2Activity.class);
        startActivity(i);
    }
    public void btnUyg3Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg3Activity.class);
        startActivity(i);
    }
    public void btnUyg4Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg4Activity.class);
        startActivity(i);
    }
    public void btnUyg5Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg5Activity.class);
        startActivity(i);
    }
    public void btnUyg6Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg6Activity.class);
        startActivity(i);
    }
    public void btnUyg7Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg7Activity.class);
        startActivity(i);
    }
    public void btnUyg8Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg8Activity.class);
        startActivity(i);
    }
    public void btnUyg9Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg9Activity.class);
        startActivity(i);
    }
}