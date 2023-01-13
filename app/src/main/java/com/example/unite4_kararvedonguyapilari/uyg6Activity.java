package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg6Activity extends AppCompatActivity {
    EditText number;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        number = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.btnOnayla);
        textView = findViewById(R.id.textView);
    }
    public void Onayla(View view){
        int sayiAy =Integer.parseInt(number.getText().toString());
        String ay="";
        number.setText("");
        switch (sayiAy){
            case 1:
                ay= "ocak";
                break;
            case 2:
                ay= "şubat";
                break;
            case 3:
                ay= "mart";
                break;
            case 4:
                ay= "nisan";
                break;
            case 5:
                ay= "mayıs";
                break;
            case 6:
                ay= "haziran";
                break;
            case 7:
                ay= "temmuz";
                break;
            case 8:
                ay= "ağustos";
                break;
            case 9:
                ay= "eylül";
                break;
            case 10:
                ay= "ekim";
                break;
            case 11:
                ay= "kasim";
                break;
            case 12:
                ay= "aralık";
                break;

            default:
                ay="yanlış bilgi";
                break;

        }
        textView.setText(ay);
    }
}
