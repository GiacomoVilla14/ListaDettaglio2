package com.example.listadettaglio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Dettaglio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio);

        TextView textView = findViewById(R.id.textViewNome);
        Button bottone = findViewById(R.id.bottoneTorna);

        String nome = getIntent().getStringExtra("nome");

        textView.setText(nome);

        bottone.setOnClickListener(view -> {
            finish();
        });
    }
}