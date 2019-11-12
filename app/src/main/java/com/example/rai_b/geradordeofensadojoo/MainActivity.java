package com.example.rai_b.geradordeofensadojoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        final ArrayList<String> ofensa = new ArrayList<String>(
                Arrays.asList("Piru", "Pinto", "Cu", "Rabo", "Cara", "Saco",  "Pau", "Cabeça", "Cerebro", "Anus", "Caralho", "Piroca", "Reto", "Penis"));

        final ArrayList<String> adjetivo = new ArrayList<>(Arrays.asList("rato", "fuinha", "lajota", "bloquete", "demente", "gamba", "baleia", "morcego", "mendigo", "mosca", "rebite", "lesma", "orelhão", "sapo", "rã", "grilo",
                "barata", "besouro", "bacteria"));

        final Random random = new Random();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux = ofensa.get(random.nextInt(ofensa.size()))+" de " + adjetivo.get(random.nextInt(adjetivo.size()));
                textView.setText(aux.toUpperCase());
            }
        });
    }
}
