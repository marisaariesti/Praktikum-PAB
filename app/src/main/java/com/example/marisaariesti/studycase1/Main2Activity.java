package com.example.marisaariesti.studycase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Main2Activity extends AppCompatActivity {
    String Tmenu, Ttempat, Tporsi;
    TextView menuTextView, porsiTextView, hargaTextView, tempatTextView;
    int money = 65500;
    int harga, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = this.getIntent();
        Tmenu = intent.getStringExtra("menu");
        Tporsi = intent.getStringExtra("porsi");
        Ttempat = intent.getStringExtra("tempat");

        menuTextView = findViewById(R.id.textView9);
        porsiTextView = findViewById(R.id.textView10);
        hargaTextView = findViewById(R.id.textView7);
        tempatTextView = findViewById(R.id.textView4);

        tempatTextView.setText(Ttempat);
        menuTextView.setText(Tmenu);
        porsiTextView.setText(Tporsi);

        switch (Ttempat){
            case "Eatbus":
                harga = 50000;
                break;
            case "Abnormal":
                harga = 30000;
                break;

        }
        total = parseInt(Tporsi)*harga;
        String hargaTotal = Integer.toString(total);
        if(total < money){
            hargaTextView.setText(hargaTotal);
            Toast.makeText(this, "makan malam disini aja", Toast.LENGTH_SHORT).show();
        }else{
            hargaTextView.setText(hargaTotal);
            Toast.makeText(this, " Uangmu tidak cukup", Toast.LENGTH_SHORT).show();
        }
    }
}
