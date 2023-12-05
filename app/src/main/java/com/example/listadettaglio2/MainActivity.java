package com.example.listadettaglio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] nomi = {"Paperino", "Pippo", "Pluto"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                nomi
        );

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            String nome = nomi[i];
            Intent intent = new Intent(MainActivity.this, Dettaglio.class);
            intent.putExtra("nome", nome);
            startActivity(intent);
        });

    }
}