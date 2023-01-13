package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg5Activity extends AppCompatActivity {
     EditText not1;
     EditText not2;
     EditText not3;
     @Override
     protected void onCreate(@Nullable Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.uyg5_activity);
          not1 = findViewById(R.id.not1);
          not2 = findViewById(R.id.not2);
          not3 = findViewById(R.id.not3);
     }
    int not1;
     int not2;
     int not3;
     float ort;
     public void Onayla(View view) {
          int not1 = Integer.parseInt(not1.getText().toString());
          int not2 = Integer.parseInt(not2.getText().toString());
          int not3 = Integer.parseInt(not3.getText().toString());
        float ort = (not1+not2+not3)/3;

          if (ort>=0 && ort<=25){
               Toast.makeText(this,"0 ile kaldınız",Toast.LENGTH_LONG).show();
          }
          else if(ort>=25 && ort<=50){
               Toast.makeText(this,"1 ile kaldınız",Toast.LENGTH_LONG).show();
          }
          else if(ort>=50 && ort<=60){
               Toast.makeText(this,"2 ile geçtiniz",Toast.LENGTH_LONG).show();
          }
          else if(ort>=60 && ort<=70){
               Toast.makeText(this,"3 ile geçtiniz",Toast.LENGTH_LONG).show();
          }
          else if(ort>=70 && ort<=84){
               Toast.makeText(this,"4 ile geçtiniz",Toast.LENGTH_LONG).show();
          }
          else if(ort>=85 && ort<=100){
               Toast.makeText(this,"5 ile geçtiniz",Toast.LENGTH_LONG).show();
          }
          else
          {
               Toast.makeText(this,"hatalı bilgi girdiniz",Toast.LENGTH_LONG).show();
          }

     }

}
